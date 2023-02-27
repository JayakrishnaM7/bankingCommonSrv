package com.ibm.service;

import com.ibm.domain.AcctBalanceResponse;
import com.ibm.domain.CustAccountsLstResponse;
import com.ibm.domain.CustomerDetailsResponse;
import com.ibm.domain.CustomerLstResponse;
import com.ibm.domain.FundTransferCBSRequest;
import com.ibm.domain.FundTransferCBSResponse;

import com.ibm.restUtil.CustomerAccountBalanceRestUtil;
import com.ibm.restUtil.CustomerAccountLstRestUtil;
import com.ibm.restUtil.CustomerDetailsRestUtil;
import com.ibm.restUtil.CustomerLstCBSRestUtil;
import com.ibm.restUtil.FundTrasnferCBSRestUtil;
import com.ibm.restUtil.JsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class CoreBankingServiceImpl implements CoreBankingService {

	private static final Logger logger = LoggerFactory.getLogger(CoreBankingServiceImpl.class);

	@Autowired
	private FundTrasnferCBSRestUtil queryTRRestUtil;

	@Autowired
	private CustomerAccountLstRestUtil custAccLstRestUtil;

	@Autowired
	private CustomerLstCBSRestUtil custLstCBSRestUtil;

	@Autowired
	private CustomerAccountBalanceRestUtil custAcctBalRestUtil;

	@Autowired
	private CustomerDetailsRestUtil custdetailsRestUtil;

	public CoreBankingServiceImpl(FundTrasnferCBSRestUtil queryTRRestUtil) {
		this.queryTRRestUtil = queryTRRestUtil;
	}

	

	public CustomerLstResponse getCustomerLst(int pageNumber, int pageSize) {
		//logger.info("Enter::: getCustomerLst:::: ");
		CustomerLstResponse trRes = null;
		try {
			logger.info("Request::: getCustomerLst:::: ");
			custLstCBSRestUtil.callGetRestService("");
			logger.info("Response::: getCustomerLst:::: ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//logger.info("Ext::: getCustomerLst");
		return custLstCBSRestUtil.getResponse();
	}


	public CustAccountsLstResponse getCustomerAccLst(String customerId, int pageNumber, int pageSize) {
		logger.info("Enter::: getCustomerAccLst:::: ");
		try {
			//logger.info("Request::: getCustomerAccLst:::: ");
			custAccLstRestUtil.callGetRestService(customerId);
			//logger.info("Response::: getCustomerAccLst:::: ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("Ext::: getCustomerAccLst");
		return custAccLstRestUtil.getResponse();
	}


	public AcctBalanceResponse getAccountBalance(String accountNumber) {
		logger.info("Enter::: getAccountBalance:::: ");
		try {
			//logger.info("Request::: getAccountBalance:::: ");
			custAcctBalRestUtil.callGetRestService(accountNumber);
			///logger.info("Response::: getAccountBalance:::: ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//logger.info("Ext::: getAccountBalance");
		return custAcctBalRestUtil.getResponse();
	}

	private FundTransferCBSResponse callFindTransfer(String strRequest) throws Exception {
		//queryTRRestUtil.setRequest(trReq);
		queryTRRestUtil.setStrRequest(strRequest);
		queryTRRestUtil.callRestServicewithReq(strRequest);
		return queryTRRestUtil.getResponse();
	}


	public CustomerDetailsResponse getCustomerDetails(String customerId) {
		//logger.info("Enter::: getCustomerDetails:::: ");
		try {
			//logger.info("Request::: getCustomerDetails:::: ");
			custdetailsRestUtil.callGetRestService(customerId);
			//logger.info("Response::: getCustomerDetails:::: ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//logger.info("Ext::: getCustomerDetails");
		return custdetailsRestUtil.getResponse();
	}

}
