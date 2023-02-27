package com.ibm.domain;



import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionStatus extends BaseResponse {

    public TransactionStatus(String fromAccount, String toAccount, String payeeName, String mobileNumber,
            String ifscCode, String transactionType, Float transactionAmt, Date transactionDate,
            String transactionStatus) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.payeeName = payeeName;
        this.mobileNumber = mobileNumber;
        this.ifscCode = ifscCode;
        this.transactionType = transactionType;
        this.transactionAmt = transactionAmt;
        this.transactionDate = transactionDate;
        this.transactionStatus = transactionStatus;
    }

    public String fromAccount;
    public String toAccount;
    public String payeeName;
    public String mobileNumber;
    public String ifscCode;
    public String transactionType;


    @Override
    public String toString() {
        return "TransactionStatus [fromAccount=" + fromAccount + ", ifscCode=" + ifscCode + ", mobileNumber="
                + mobileNumber + ", payeeName=" + payeeName + ", toAccount=" + toAccount + ", transactionAmt="
                + transactionAmt + ", transactionDate=" + transactionDate + ", transactionStatus=" + transactionStatus
                + ", transactionType=" + transactionType + "]";
    }

    public Float transactionAmt;
    public Date transactionDate;
    
    public String getTransactionStatus() {
        return transactionStatus;
    }
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
    public String transactionStatus;

    public String getFromAccount() {
        return fromAccount;
    }
    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }
    public String getToAccount() {
        return toAccount;
    }
    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }
    public String getPayeeName() {
        return payeeName;
    }
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getIfscCode() {
        return ifscCode;
    }
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public Float getTransactionAmt() {
        return transactionAmt;
    }
    public void setTransactionAmt(Float transactionAmt) {
        this.transactionAmt = transactionAmt;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

}

