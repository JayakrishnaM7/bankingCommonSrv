package com.ibm.domain;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payee extends BaseResponse {
    public Payee(String payeeName, String payeeNickName, String ifsc, String mobileNumber, String payeeAccount) {
        this.payeeName = payeeName;
        this.payeeNickName = payeeNickName;
        this.ifsc = ifsc;
        this.mobileNumber = mobileNumber;
        this.payeeAccount = payeeAccount;
    }
    public String payeeName;
    public String payeeNickName;
    public String ifsc;
    public String mobileNumber; 
    public String customerId;
    public String payeeAccount;

    
    public String getPayeeName() {
        return payeeName;
    }
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }
    public String getPayeeNickName() {
        return payeeNickName;
    }
    public void setPayeeNickName(String payeeNickName) {
        this.payeeNickName = payeeNickName;
    }
    public String getIfsc() {
        return ifsc;
    }
    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getPayeeAccount() {
        return payeeAccount;
    }
    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
    }

    @Override
    public String toString() {
        return "Payee [customerId=" + customerId + ", ifsc=" + ifsc + ", mobileNumber=" + mobileNumber + ", payeeName="
                + payeeName + ", payeeNickName=" + payeeNickName + "]";
    }


}

