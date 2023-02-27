package com.ibm.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDetailsResponse extends BaseResponse {
    public String id;
    public String status;
    public List<Identifier> identifiers;
    public CustomerDetails customer_details;
    public AdditionalDetails additional_details;
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    static class AdditionalDetails{
    
        public String DATE_ENROLLED;

        public String getDATE_ENROLLED() {
            return DATE_ENROLLED;
        }

        public void setDATE_ENROLLED(String dATE_ENROLLED) {
            DATE_ENROLLED = dATE_ENROLLED;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    static class CustomerDetails{
        public String title;
        public String first_name;
        public String middle_name;
        public String last_name;
        public String dob;
        public String gender;
        public String nationality;
        public String email_address;
        public String mobile_phone_number;
        public String home_phone_number;
        public String business_phone_number;
        public String contact_method;
        public String country_of_residence;
        public String country_of_taxation;
        public String accessibility;
        public String external_customer_id;
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getFirst_name() {
            return first_name;
        }
        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }
        public String getMiddle_name() {
            return middle_name;
        }
        public void setMiddle_name(String middle_name) {
            this.middle_name = middle_name;
        }
        public String getLast_name() {
            return last_name;
        }
        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }
        public String getDob() {
            return dob;
        }
        public void setDob(String dob) {
            this.dob = dob;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public String getNationality() {
            return nationality;
        }
        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
        public String getEmail_address() {
            return email_address;
        }
        public void setEmail_address(String email_address) {
            this.email_address = email_address;
        }
        public String getMobile_phone_number() {
            return mobile_phone_number;
        }
        public void setMobile_phone_number(String mobile_phone_number) {
            this.mobile_phone_number = mobile_phone_number;
        }
        public String getHome_phone_number() {
            return home_phone_number;
        }
        public void setHome_phone_number(String home_phone_number) {
            this.home_phone_number = home_phone_number;
        }
        public String getBusiness_phone_number() {
            return business_phone_number;
        }
        public void setBusiness_phone_number(String business_phone_number) {
            this.business_phone_number = business_phone_number;
        }
        public String getContact_method() {
            return contact_method;
        }
        public void setContact_method(String contact_method) {
            this.contact_method = contact_method;
        }
        public String getCountry_of_residence() {
            return country_of_residence;
        }
        public void setCountry_of_residence(String country_of_residence) {
            this.country_of_residence = country_of_residence;
        }
        public String getCountry_of_taxation() {
            return country_of_taxation;
        }
        public void setCountry_of_taxation(String country_of_taxation) {
            this.country_of_taxation = country_of_taxation;
        }
        public String getAccessibility() {
            return accessibility;
        }
        public void setAccessibility(String accessibility) {
            this.accessibility = accessibility;
        }
        public String getExternal_customer_id() {
            return external_customer_id;
        }
        public void setExternal_customer_id(String external_customer_id) {
            this.external_customer_id = external_customer_id;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Identifier{
        public String identifier_type;
        public String identifier;
        public String getIdentifier_type() {
            return identifier_type;
        }
        public void setIdentifier_type(String identifier_type) {
            this.identifier_type = identifier_type;
        }
        public String getIdentifier() {
            return identifier;
        }
        public void setIdentifier(String identifier) {
            this.identifier = identifier;
        }
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public List<Identifier> getIdentifiers() {
        return identifiers;
    }
    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }
    public CustomerDetails getCustomer_details() {
        return customer_details;
    }
    public void setCustomer_details(CustomerDetails customer_details) {
        this.customer_details = customer_details;
    }
    public AdditionalDetails getAdditional_details() {
        return additional_details;
    }
    public void setAdditional_details(AdditionalDetails additional_details) {
        this.additional_details = additional_details;
    }

}

