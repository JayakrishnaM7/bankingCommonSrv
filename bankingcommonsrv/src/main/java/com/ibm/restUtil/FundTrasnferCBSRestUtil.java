package com.ibm.restUtil;

import java.net.URI;

import com.ibm.domain.FundTransferCBSRequest;
import com.ibm.domain.FundTransferCBSResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class FundTrasnferCBSRestUtil extends RestUtil{
	
	private static final Logger logger = LoggerFactory.getLogger(FundTrasnferCBSRestUtil.class);
	private static final String TRACE_TAG = "QueryTransactionRightsRestUtil.";
	public static final String SERVICE_NAME= "queryTransactionRights";
	public static final String SUFFIX_URL="/v1/posting-instruction-batches:asyncCreate";
	
	@Value("${backendAServiceUrl}")
	private String backendAServiceUrl;
	
	private FundTransferCBSRequest request;
	private FundTransferCBSResponse response;
	private String strRequest;
	
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
		String url = System.getenv("tmvurl");
		if (null!= url && ""!=url && !url.isEmpty()) {
			url = url + getSuffixUrl();
		}
		return url;
	}

	protected String buildJsonRequest() {
		// String jsonString=null;
		// try {
		// 	jsonString = JsonUtil.convertJavaToJson(request);
		// }
		// catch(Exception e) {
		// 	logger.error(TRACE_TAG+"Exception in buildJsonRequest() : ",e);
		// }
		return strRequest;
	}
	
	protected void parseJsonResponse(ResponseEntity response) {
		String jsonResp = (String)response.getBody();
		setResponse(JsonUtil.convertJsontoJava(jsonResp,FundTransferCBSResponse.class));
	}

	public FundTransferCBSRequest getRequest() {
		return request;
	}

	public void setRequest(FundTransferCBSRequest request) {
		this.request = request;
	}

	public FundTransferCBSResponse getResponse() {
		return response;
	}

	public void setResponse(FundTransferCBSResponse response) {
		this.response = response;
	}

	@Override
	public URI getRestWsUrlWithParam(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStrRequest() {
		return strRequest;
	}

	public void setStrRequest(String strRequest) {
		this.strRequest = strRequest;
	}

	
}
