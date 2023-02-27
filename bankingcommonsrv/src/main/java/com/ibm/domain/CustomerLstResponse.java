package com.ibm.domain;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerLstResponse extends BaseResponse {
    private List<Customers> customers;

    private String next_page_token;

    private String previous_page_token;

    public void setCustomers(List<Customers> customers){
        this.customers = customers;
    }
    public List<Customers> getCustomers(){
        return this.customers;
    }
    public void setNext_page_token(String next_page_token){
        this.next_page_token = next_page_token;
    }
    public String getNext_page_token(){
        return this.next_page_token;
    }
    public void setPrevious_page_token(String previous_page_token){
        this.previous_page_token = previous_page_token;
    }
    public String getPrevious_page_token(){
        return this.previous_page_token;
    }
@JsonIgnoreProperties(ignoreUnknown = true)
static class Identifiers
{
    private String identifier_type;

    private String identifier;

    public void setIdentifier_type(String identifier_type){
        this.identifier_type = identifier_type;
    }
    public String getIdentifier_type(){
        return this.identifier_type;
    }
    public void setIdentifier(String identifier){
        this.identifier = identifier;
    }
    public String getIdentifier(){
        return this.identifier;
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
static class Customer_details
{
    private String title;

    private String first_name;

    private String middle_name;

    private String last_name;

    private Date dob;

    private String gender;

    private String nationality;

    private String email_address;

    private String mobile_phone_number;

    private String home_phone_number;

    private String business_phone_number;

    private String contact_method;

    private String country_of_residence;

    private String country_of_taxation;

    private String accessibility;

    private String external_customer_id;

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }
    public String getFirst_name(){
        return this.first_name;
    }
    public void setMiddle_name(String middle_name){
        this.middle_name = middle_name;
    }
    public String getMiddle_name(){
        return this.middle_name;
    }
    public void setLast_name(String last_name){
        this.last_name = last_name;
    }
    public String getLast_name(){
        return this.last_name;
    }
    public void setDob(Date dob){
        this.dob = dob;
    }
    public Date getDob(){
        return this.dob;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public String getNationality(){
        return this.nationality;
    }
    public void setEmail_address(String email_address){
        this.email_address = email_address;
    }
    public String getEmail_address(){
        return this.email_address;
    }
    public void setMobile_phone_number(String mobile_phone_number){
        this.mobile_phone_number = mobile_phone_number;
    }
    public String getMobile_phone_number(){
        return this.mobile_phone_number;
    }
    public void setHome_phone_number(String home_phone_number){
        this.home_phone_number = home_phone_number;
    }
    public String getHome_phone_number(){
        return this.home_phone_number;
    }
    public void setBusiness_phone_number(String business_phone_number){
        this.business_phone_number = business_phone_number;
    }
    public String getBusiness_phone_number(){
        return this.business_phone_number;
    }
    public void setContact_method(String contact_method){
        this.contact_method = contact_method;
    }
    public String getContact_method(){
        return this.contact_method;
    }
    public void setCountry_of_residence(String country_of_residence){
        this.country_of_residence = country_of_residence;
    }
    public String getCountry_of_residence(){
        return this.country_of_residence;
    }
    public void setCountry_of_taxation(String country_of_taxation){
        this.country_of_taxation = country_of_taxation;
    }
    public String getCountry_of_taxation(){
        return this.country_of_taxation;
    }
    public void setAccessibility(String accessibility){
        this.accessibility = accessibility;
    }
    public String getAccessibility(){
        return this.accessibility;
    }
    public void setExternal_customer_id(String external_customer_id){
        this.external_customer_id = external_customer_id;
    }
    public String getExternal_customer_id(){
        return this.external_customer_id;
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
static class Additional_details
{
    private String name_kana;

    private String name_kanji;

    private String AadharNo;
    private String PAN;
    private String branch_info;


    public void setName_kana(String name_kana){
        this.name_kana = name_kana;
    }
    public String getName_kana(){
        return this.name_kana;
    }
    public void setName_kanji(String name_kanji){
        this.name_kanji = name_kanji;
    }
    public String getName_kanji(){
        return this.name_kanji;
    }
    public String getAadharNo() {
        return AadharNo;
    }
    public void setAadharNo(String aadharNo) {
        AadharNo = aadharNo;
    }
    public String getPAN() {
        return PAN;
    }
    public void setPAN(String pAN) {
        PAN = pAN;
    }
    public String getBranch_info() {
        return branch_info;
    }
    public void setBranch_info(String branch_info) {
        this.branch_info = branch_info;
    }
}


static class Customers
{
    private String id;

    private String status;

    private List<Identifiers> identifiers;

    private Customer_details customer_details;

    private Additional_details additional_details;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setIdentifiers(List<Identifiers> identifiers){
        this.identifiers = identifiers;
    }
    public List<Identifiers> getIdentifiers(){
        return this.identifiers;
    }
    public void setCustomer_details(Customer_details customer_details){
        this.customer_details = customer_details;
    }
    public Customer_details getCustomer_details(){
        return this.customer_details;
    }
    public void setAdditional_details(Additional_details additional_details){
        this.additional_details = additional_details;
    }
    public Additional_details getAdditional_details(){
        return this.additional_details;
    }
}



}
