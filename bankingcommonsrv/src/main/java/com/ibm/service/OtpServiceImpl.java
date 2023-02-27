package com.ibm.service;


import com.ibm.domain.OtpResponse;
import com.ibm.restUtil.OtpRestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtpServiceImpl implements OtpService {

	private static final Logger logger = LoggerFactory.getLogger(OtpServiceImpl.class);

	@Autowired
	private OtpRestUtil queryOtpUtil;


	public OtpServiceImpl(OtpRestUtil queryTRRestUtil) {
		this.queryOtpUtil = queryTRRestUtil;
	}

	


	public OtpResponse validateOtp(String otp) {
		//logger.info("Enter::: getCustomerDetails:::: ");
		try {
			//logger.info("Request::: getCustomerDetails:::: ");
			queryOtpUtil.callGetRestService(otp);
			//logger.info("Response::: getCustomerDetails:::: ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//logger.info("Ext::: getCustomerDetails");
		return queryOtpUtil.getResponse();
	}

	public OtpResponse generateOtp() {
		//logger.info("Enter::: getCustomerDetails:::: ");
		try {
			//logger.info("Request::: getCustomerDetails:::: ");
			queryOtpUtil.callGetRestService("");
			//logger.info("Response::: getCustomerDetails:::: ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//logger.info("Ext::: getCustomerDetails");
		return queryOtpUtil.getResponse();
	}
}
