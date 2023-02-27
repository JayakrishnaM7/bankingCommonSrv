package com.ibm.service;
import com.ibm.domain.OtpResponse;

public interface OtpService {
	

	 
    OtpResponse generateOtp() ;
    OtpResponse validateOtp(String otp) ;


}
