package com.ibm.service;

import com.ibm.domain.AcctBalanceResponse;
import com.ibm.domain.CustAccountsLstResponse;
import com.ibm.domain.CustomerDetailsResponse;
import com.ibm.domain.CustomerLstResponse;

public interface CoreBankingService {
	


	 CustomerLstResponse getCustomerLst(int pageNumber, int pageSize) ;
	 CustAccountsLstResponse getCustomerAccLst(String customerId, int pageNumber, int pageSize);
	 AcctBalanceResponse getAccountBalance(String accountNumber) ;
	 CustomerDetailsResponse getCustomerDetails(String customerId) ;
	 

}
