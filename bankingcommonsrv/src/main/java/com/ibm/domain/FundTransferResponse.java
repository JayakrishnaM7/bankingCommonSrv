package com.ibm.domain;

public class FundTransferResponse extends BaseResponse{
	
	private String transactionId;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "FundTransferResponse [transactionId=" + transactionId + ", getTransactionId()=" + getTransactionId()
				+ ", isSuccess()=" + isSuccess() + ", getResponseId()=" + getResponseId() + ", getResponseMessage()="
				+ getResponseMessage() + ", getResponseCode()=" + getResponseCode() + ", getErrorCode()="
				+ getErrorCode() + ", getErrorDesc()=" + getErrorDesc() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
