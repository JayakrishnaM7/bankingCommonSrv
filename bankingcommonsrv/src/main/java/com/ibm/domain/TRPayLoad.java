package com.ibm.domain;

public class TRPayLoad {
	
	private String accountNumber;
	private String custName;
	private String transactionRightName;
	private String transactionRightCode;
	private String transactionRightDesc;

	
	private String depositAccount="12345678";
	private double depositAmount=1500;
	private String requestId;


	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getTransactionRightName() {
		return transactionRightName;
	}
	public void setTransactionRightName(String transactionRightName) {
		this.transactionRightName = transactionRightName;
	}
	public String getTransactionRightCode() {
		return transactionRightCode;
	}
	public void setTransactionRightCode(String transactionRightCode) {
		this.transactionRightCode = transactionRightCode;
	}
	public String getTransactionRightDesc() {
		return transactionRightDesc;
	}
	public void setTransactionRightDesc(String transactionRightDesc) {
		this.transactionRightDesc = transactionRightDesc;
	}
	@Override
	public String toString() {
		return "TRPayLoad [accountNumber=" + accountNumber + ", custName=" + custName + ", transactionRightName="
				+ transactionRightName + ", transactionRightCode=" + transactionRightCode + ", transactionRightDesc="
				+ transactionRightDesc + "]";
	}
	public String getDepositAccount() {
		return depositAccount;
	}
	public void setDepositAccount(String depositAccount) {
		this.depositAccount = depositAccount;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	
}
