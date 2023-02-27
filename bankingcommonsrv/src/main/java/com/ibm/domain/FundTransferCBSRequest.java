package com.ibm.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FundTransferCBSRequest extends BaseResponse {

	private String request_id="{{$guid}}";
	
	private Posting_instruction_batch posting_instruction_batch;

	public void setRequest_id(String request_id){
		this.request_id = request_id;
	}
	public String getRequest_id(){
		return this.request_id;
	}
	public void setPosting_instruction_batch(Posting_instruction_batch posting_instruction_batch){
		this.posting_instruction_batch = posting_instruction_batch;
	}
	public Posting_instruction_batch getPosting_instruction_batch(){
		return this.posting_instruction_batch;
	}

	
	static class Target_account
	{
		private String account_id;
	
		public void setAccount_id(String account_id){
			this.account_id = account_id;
		}
		public String getAccount_id(){
			return this.account_id;
		}
	}
	static class Inbound_hard_settlement
	{
		private String amount;
	
		private String denomination;
	
		private Target_account target_account;
	
		private String internal_account_id;
	
		public void setAmount(String amount){
			this.amount = amount;
		}
		public String getAmount(){
			return this.amount;
		}
		public void setDenomination(String denomination){
			this.denomination = denomination;
		}
		public String getDenomination(){
			return this.denomination;
		}
		public void setTarget_account(Target_account target_account){
			this.target_account = target_account;
		}
		public Target_account getTarget_account(){
			return this.target_account;
		}
		public void setInternal_account_id(String internal_account_id){
			this.internal_account_id = internal_account_id;
		}
		public String getInternal_account_id(){
			return this.internal_account_id;
		}

		@Override
		public String toString() {
			return "Inbound_hard_settlement [amount=" + amount + ", denomination=" + denomination
					+ ", internal_account_id=" + internal_account_id + ", target_account=" + target_account + "]";
		}
	}
	
	static class Outbound_hard_settlement
	{
		private String amount;
	
		private String denomination;
	
		private Target_account target_account;
	
		private String internal_account_id;
	
		public void setAmount(String amount){
			this.amount = amount;
		}
		public String getAmount(){
			return this.amount;
		}
		public void setDenomination(String denomination){
			this.denomination = denomination;
		}
		public String getDenomination(){
			return this.denomination;
		}
		public void setTarget_account(Target_account target_account){
			this.target_account = target_account;
		}
		public Target_account getTarget_account(){
			return this.target_account;
		}
		public void setInternal_account_id(String internal_account_id){
			this.internal_account_id = internal_account_id;
		}
		public String getInternal_account_id(){
			return this.internal_account_id;
		}

		@Override
		public String toString() {
			return "Inbound_hard_settlement [amount=" + amount + ", denomination=" + denomination
					+ ", internal_account_id=" + internal_account_id + ", target_account=" + target_account + "]";
		}
	}
	
	static class Instruction_details
	{
		private String auto_transfer;
	
		public void setAuto_transfer(String auto_transfer){
			this.auto_transfer = auto_transfer;
		}
		public String getAuto_transfer(){
			return this.auto_transfer;
		}

		@Override
		public String toString() {
			return "Instruction_details [auto_transfer=" + auto_transfer + "]";
		}
	}
	
	static class Posting_instructions
	{
		private String client_transaction_id;
	
		private Inbound_hard_settlement inbound_hard_settlement;
		private Outbound_hard_settlement outbound_hard_settlement;
	
		private Instruction_details instruction_details;
	
		public void setClient_transaction_id(String client_transaction_id){
			this.client_transaction_id = client_transaction_id;
		}
		public String getClient_transaction_id(){
			return this.client_transaction_id;
		}
		public void setInbound_hard_settlement(Inbound_hard_settlement inbound_hard_settlement){
			this.inbound_hard_settlement = inbound_hard_settlement;
		}
		public Inbound_hard_settlement getInbound_hard_settlement(){
			return this.inbound_hard_settlement;
		}
		public void setInstruction_details(Instruction_details instruction_details){
			this.instruction_details = instruction_details;
		}
		public Instruction_details getInstruction_details(){
			return this.instruction_details;
		}

		@Override
		public String toString() {
			return "Posting_instructions [client_transaction_id=" + client_transaction_id + ", inbound_hard_settlement="
					+ inbound_hard_settlement + ", instruction_details=" + instruction_details + "]";
		}
		public Outbound_hard_settlement getOutbound_hard_settlement() {
			return outbound_hard_settlement;
		}
		public void setOutbound_hard_settlement(Outbound_hard_settlement outbound_hard_settlement) {
			this.outbound_hard_settlement = outbound_hard_settlement;
		}
	}
	
	static class Posting_instruction_batch
	{
		private String client_id;
	
		private String client_batch_id;
	
		private List<Posting_instructions> posting_instructions;
	
		public void setClient_id(String client_id){
			this.client_id = client_id;
		}
		public String getClient_id(){
			return this.client_id;
		}
		public void setClient_batch_id(String client_batch_id){
			this.client_batch_id = client_batch_id;
		}
		public String getClient_batch_id(){
			return this.client_batch_id;
		}
		public void setPosting_instructions(List<Posting_instructions> posting_instructions){
			this.posting_instructions = posting_instructions;
		}
		public List<Posting_instructions> getPosting_instructions(){
			return this.posting_instructions;
		}

		@Override
		public String toString() {
			return "Posting_instruction_batch [client_batch_id=" + client_batch_id + ", client_id=" + client_id
					+ ", posting_instructions=" + posting_instructions + "]";
		}
	}
	

	
		


}
