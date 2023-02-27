package com.ibm.domain;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustAccountsLstResponse extends BaseResponse{
	private List<Accounts> accounts;
	
	private String previous_page_token;

	private String next_page_token;

	public void setAccounts(List<Accounts> accounts){
		this.accounts = accounts;
	}
	public List<Accounts> getAccounts(){
		return this.accounts;
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
	static class Instance_param_vals
	{
		private String interest_application_day;
	
		public void setInterest_application_day(String interest_application_day){
			this.interest_application_day = interest_application_day;
		}
		public String getInterest_application_day(){
			return this.interest_application_day;
		}
	}
	@JsonIgnoreProperties(ignoreUnknown = true)
	static class Accounting
	{
		private String tside;
	
		public void setTside(String tside){
			this.tside = tside;
		}
		public String getTside(){
			return this.tside;
		}
	}
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class BranchDetails
	{
		private String branch_code;
		private String branch_name;
		private String branch_city;
		private String ifsc;
		public String getBranch_code() {
			return branch_code;
		}
		public void setBranch_code(String branch_code) {
			this.branch_code = branch_code;
		}
		public String getBranch_name() {
			return branch_name;
		}
		public void setBranch_name(String branch_name) {
			this.branch_name = branch_name;
		}
		public String getBranch_city() {
			return branch_city;
		}
		public void setBranch_city(String branch_city) {
			this.branch_city = branch_city;
		}
		public String getIfsc() {
			return ifsc;
		}
		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}
	

	}


	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Accounts
	{
		private String id;
	
		private String name;
	
		private String product_id;
	
		private String product_version_id;
	
		private List<String> permitted_denominations;
	
		private String status;
	
		private String opening_timestamp;
	
		private String closing_timestamp;
	
		private List<String> stakeholder_ids;
	
		private Instance_param_vals instance_param_vals;
	
		
		private Accounting accounting;
		private BranchDetails branchDetails;


	
		public void setId(String id){
			this.id = id;
		}
		public String getId(){
			return this.id;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return this.name;
		}
		public void setProduct_id(String product_id){
			this.product_id = product_id;
		}
		public String getProduct_id(){
			return this.product_id;
		}
		public void setProduct_version_id(String product_version_id){
			this.product_version_id = product_version_id;
		}
		public String getProduct_version_id(){
			return this.product_version_id;
		}
		public void setPermitted_denominations(List<String> permitted_denominations){
			this.permitted_denominations = permitted_denominations;
		}
		public List<String> getPermitted_denominations(){
			return this.permitted_denominations;
		}
		public void setStatus(String status){
			this.status = status;
		}
		public String getStatus(){
			return this.status;
		}
		public void setOpening_timestamp(String opening_timestamp){
			this.opening_timestamp = opening_timestamp;
		}
		public String getOpening_timestamp(){
			return this.opening_timestamp;
		}
		public void setClosing_timestamp(String closing_timestamp){
			this.closing_timestamp = closing_timestamp;
		}
		public String getClosing_timestamp(){
			return this.closing_timestamp;
		}
		public void setStakeholder_ids(List<String> stakeholder_ids){
			this.stakeholder_ids = stakeholder_ids;
		}
		public List<String> getStakeholder_ids(){
			return this.stakeholder_ids;
		}
		public void setInstance_param_vals(Instance_param_vals instance_param_vals){
			this.instance_param_vals = instance_param_vals;
		}
		public Instance_param_vals getInstance_param_vals(){
			return this.instance_param_vals;
		}

		public void setAccounting(Accounting accounting){
			this.accounting = accounting;
		}
		public Accounting getAccounting(){
			return this.accounting;
		}
		public BranchDetails getBranchDetails() {
			return branchDetails;
		}
		public void setBranchDetails(BranchDetails branchDetails) {
			this.branchDetails = branchDetails;
		}
	}
	

	
}
