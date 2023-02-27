package com.ibm.restUtil;

import java.net.URI;


import com.ibm.domain.OtpResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class OtpRestUtil extends RestUtil{
	
	private static final Logger logger = LoggerFactory.getLogger(OtpRestUtil.class);
	private static final String TRACE_TAG = "Otp Rest Util.";
	public static final String SERVICE_NAME= "OtpService";
	public static final String SUFFIX_URL="/api";
	
	@Value("${backendAServiceUrl}")
	private String backendAServiceUrl;
	
	
	private OtpResponse response;
	
	/**
	 * Abstract method to fetch REST Service Name
	 * @return ServiceName
	 */
	protected String getRestServiceName(){
		return SERVICE_NAME;
	}
	
	protected String getSuffixUrl(){
		return SUFFIX_URL;
	}
	protected String getRestWsUrl() {
		// Read REST WebService URL from lookup cache
		//String url=EnsembleServiceLibrarianEns.getServiceUrlValue("RMS_REST_WS_URL");
		String url = System.getenv("otpurl");
		if (null!= url && ""!=url && !url.isEmpty()) {
			url = url + getSuffixUrl();
		}
		return url;
	}

	
	protected void parseJsonResponse(ResponseEntity response) {
		String jsonResp = (String)response.getBody();
		setResponse(JsonUtil.convertJsontoJava(jsonResp,OtpResponse.class));
	}




	public OtpResponse getResponse() {
		return response;
	}

	public void setResponse(OtpResponse response) {
		this.response = response;
	}

	@Override
	protected String buildJsonRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getRestWsUrlWithParam(String otp) {
        UriComponentsBuilder builder;
        if((otp!= null) && (otp.trim()!="" ))
        {
            builder = UriComponentsBuilder.fromHttpUrl(getRestWsUrl()+"/verify_otp?otp="+otp);
            logger.info("URL to be called-Computed:"+builder.toString());
            return builder.build().toUri();
        }
        else
        {
            builder = UriComponentsBuilder.fromHttpUrl(getRestWsUrl()+"/get_otp");
            logger.info("URL to be called-Computed:"+builder.toString());
            return builder.build().toUri();
        }

	}

	
}
