package com.ibm.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AcctBalanceResponse extends BaseResponse {
    private List<Balances> balances;

    private String previous_page_token;

    private String next_page_token;

    public void setBalances(List<Balances> balances){
        this.balances = balances;
    }
    public List<Balances> getBalances(){
        return this.balances;
    }
    public void setPrevious_page_token(String previous_page_token){
        this.previous_page_token = previous_page_token;
    }
    public String getPrevious_page_token(){
        return this.previous_page_token;
    }
    public void setNext_page_token(String next_page_token){
        this.next_page_token = next_page_token;
    }
    public String getNext_page_token(){
        return this.next_page_token;
    }
	@JsonIgnoreProperties(ignoreUnknown = true)
	static class Balances
	{
		private String id;

		private String account_id;

		private String account_address;

		private String phase;

		private String asset;

		private String denomination;

		private String posting_instruction_batch_id;

		private String update_posting_instruction_batch_id;

		private String value_time;

		private String amount;

		private String total_debit;

		private String total_credit;

		public void setId(String id){
			this.id = id;
		}
		public String getId(){
			return this.id;
		}
		public void setAccount_id(String account_id){
			this.account_id = account_id;
		}
		public String getAccount_id(){
			return this.account_id;
		}
		public void setAccount_address(String account_address){
			this.account_address = account_address;
		}
		public String getAccount_address(){
			return this.account_address;
		}
		public void setPhase(String phase){
			this.phase = phase;
		}
		public String getPhase(){
			return this.phase;
		}
		public void setAsset(String asset){
			this.asset = asset;
		}
		public String getAsset(){
			return this.asset;
		}
		public void setDenomination(String denomination){
			this.denomination = denomination;
		}
		public String getDenomination(){
			return this.denomination;
		}
		public void setPosting_instruction_batch_id(String posting_instruction_batch_id){
			this.posting_instruction_batch_id = posting_instruction_batch_id;
		}
		public String getPosting_instruction_batch_id(){
			return this.posting_instruction_batch_id;
		}
		public void setUpdate_posting_instruction_batch_id(String update_posting_instruction_batch_id){
			this.update_posting_instruction_batch_id = update_posting_instruction_batch_id;
		}
		public String getUpdate_posting_instruction_batch_id(){
			return this.update_posting_instruction_batch_id;
		}
		public void setValue_time(String value_time){
			this.value_time = value_time;
		}
		public String getValue_time(){
			return this.value_time;
		}
		public void setAmount(String amount){
			this.amount = amount;
		}
		public String getAmount(){
			return this.amount;
		}
		public void setTotal_debit(String total_debit){
			this.total_debit = total_debit;
		}
		public String getTotal_debit(){
			return this.total_debit;
		}
		public void setTotal_credit(String total_credit){
			this.total_credit = total_credit;
		}
		public String getTotal_credit(){
			return this.total_credit;
		}
	}



}
