package com.ibm.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.ibm.domain.AcctBalanceResponse;
import com.ibm.domain.CustAccountsLstResponse;
import com.ibm.domain.CustomerDetailsResponse;
import com.ibm.domain.CustomerLstResponse;
import com.ibm.domain.FundTransferResponse;
import com.ibm.domain.OtpResponse;
import com.ibm.domain.Payee;
import com.ibm.domain.TransactionStatus;
import com.ibm.domain.CustAccountsLstResponse.BranchDetails;
import com.ibm.service.CoreBankingService;

import com.ibm.service.OtpService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bankingcommonsrv")
public class CommonCoreServiceController {

	@Autowired
	private CoreBankingService coreBankingService;
	@Autowired
	private OtpService otpService;

	@Autowired
	JdbcTemplate jdbcTemplate;

	private static final Logger logger = LoggerFactory.getLogger(CommonCoreServiceController.class);

	private final String INSERT_QUERY = "INSERT INTO  TRANSACTIONSTATUS (FROMACCOUNT,TOACCOUNT,PAYEENAME,MOBILENUMBER,IFSCCODE,TRANSACTIONTYPE,TRANSACTIONAMT,TRANSACTIONDATE, TRANSACTIONSTATUS, TRANSACTIONID, fundTransferType) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

	public CommonCoreServiceController() {

	}

	@GetMapping(value = "/getCustomerLst/{pageNumber}/{pageSize}")
	public CustomerLstResponse getCustomerLst(@PathVariable("pageNumber") Integer pageNumber,
			@PathVariable("pageSize") Integer pageSize) {
		CustomerLstResponse res;
		logger.info("Enter:getCustomerList Controller");
		res = coreBankingService.getCustomerLst(pageNumber, pageSize);
		logger.info("Exit:getCustomerList Controller");
		return res;
	}

	@GetMapping(value = "/getCustomerAccLst/{customerId}/{pageNumber}/{pageSize}")
	public CustAccountsLstResponse getCustomerAccLst(@PathVariable("customerId") String customerId,
			@PathVariable("pageNumber") Integer pageNumber, @PathVariable("pageSize") Integer pageSize) {
		CustAccountsLstResponse res;

		logger.info("Enter:getCustomerAccLst Controller");
		res = coreBankingService.getCustomerAccLst(customerId, pageNumber, pageSize);
		for (CustAccountsLstResponse.Accounts account : res.getAccounts()) {
			BranchDetails branchDetails = new BranchDetails();
			branchDetails.setBranch_city("Mumbai");
			branchDetails.setBranch_code("00010");
			branchDetails.setBranch_name("Belapur");
			branchDetails.setIfsc("SBIN000010");
			account.setBranchDetails(branchDetails);
		}

		logger.info("Exit:getCustomerAccLst Controller");
		return res;
	}

	@GetMapping(value = "/getAccountBalance/{accountNumber}")
	public AcctBalanceResponse getAccountBalance(@PathVariable("accountNumber") String accountNumber) {
		AcctBalanceResponse res;

		logger.info("Enter:getAccountBalance Controller");
		res = coreBankingService.getAccountBalance(accountNumber);

		logger.info("Exit:getAccountBalance Controller");
		return res;
	}

	@GetMapping(value = "/customers/{customerId}")
	public CustomerDetailsResponse getCustomerDetails(@PathVariable("customerId") String customerId) {
		CustomerDetailsResponse res;

		logger.info("Enter: getCustomerDetails Controller");
		res = coreBankingService.getCustomerDetails(customerId);

		logger.info("Exit: getCustomerDetails Controller");
		return res;
	}

	@GetMapping(value = "/validateOtp/{otp}")
	public OtpResponse validateOtp(@PathVariable("otp") String otp) {
		OtpResponse res;
		logger.info("Enter: validateOtp Controller");
		res = otpService.validateOtp(otp);

		logger.info("Exit: validateOtp Controller");
		return res;
	}

	@GetMapping(value = "/generateOtp")
	public OtpResponse generateOtp() {
		OtpResponse res;
		logger.info("Enter: generateOtp Controller");
		res = otpService.generateOtp();
		logger.info("Enter: generateOtp Controller");
		return res;
	}

	@GetMapping(value = "/payees/{customerId}")
	public @ResponseBody ResponseEntity<List<Payee>> getPayees(@PathVariable("customerId") String customerId) {
		List<Payee> list = new ArrayList<Payee>();
		logger.info("Enter: getPayees Controller");
		jdbcTemplate
				.query("SELECT * FROM payee where customerId = ?", new Object[] { customerId },
						(rs, rowNum) -> new Payee(rs.getString("payeeName"), rs.getString("payeeNickName"),
								rs.getString("ifsc"), rs.getString("mobileNumber"), rs.getString("payeeAccount")))
				.forEach(payee -> list.add(payee));
		logger.info("Exit: getPayees Controller");
		return new ResponseEntity<List<Payee>>(list, HttpStatus.OK);
	}

	@GetMapping(value = "/transactionStatus/{accountId}")
	public @ResponseBody ResponseEntity<List<TransactionStatus>> getTransactionStatus(
			@PathVariable("accountId") String accountId) {
		List<TransactionStatus> list = new ArrayList<TransactionStatus>();
		logger.info("Enter: getTransactionStatus Controller");
		jdbcTemplate
				.query("SELECT * FROM transactionstatus where fromAccount = ? ORDER BY TRANSACTIONDATE DESC LIMIT 5",
						new Object[] { accountId },
						(rs, rowNum) -> new TransactionStatus(rs.getString("fromAccount"), rs.getString("toAccount"),
								rs.getString("payeeName"), rs.getString("mobileNumber"), rs.getString("ifscCode"),
								rs.getString("transactionType"), rs.getFloat("transactionAmt"),
								rs.getDate("transactionDate"), rs.getString("transactionStatus")))
				.forEach(thing -> list.add(thing));
		logger.info("Exit: getTransactionStatus Controller");
		return new ResponseEntity<List<TransactionStatus>>(list, HttpStatus.OK);
	}
}
