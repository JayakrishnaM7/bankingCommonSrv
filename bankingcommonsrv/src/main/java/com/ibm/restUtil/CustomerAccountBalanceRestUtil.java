package com.ibm.restUtil;

import java.net.URI;

import com.ibm.domain.AcctBalanceResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class CustomerAccountBalanceRestUtil extends RestUtil{
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerAccountBalanceRestUtil.class);
	private static final String TRACE_TAG = "QueryTransactionRightsRestUtil.";
	public static final String SERVICE_NAME= "queryTransactionRights";
	public static final String SUFFIX_URL="/v1/balances";
	
	@Value("${backendAServiceUrl}")
	private String backendAServiceUrl;
	
	
	private AcctBalanceResponse response;
	
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

	
	protected void parseJsonResponse(ResponseEntity response) {
		String jsonResp = (String)response.getBody();
		setResponse(JsonUtil.convertJsontoJava(jsonResp,AcctBalanceResponse.class));
	}




	public AcctBalanceResponse getResponse() {
		return response;
	}

	public void setResponse(AcctBalanceResponse response) {
		this.response = response;
	}

	@Override
	protected String buildJsonRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getRestWsUrlWithParam(String customerId) {

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(getRestWsUrl())
        .queryParam("account_id", customerId)
        .queryParam("live", "true")
        .queryParam("order_by", "ORDER_BY_VALUE_TIME_DESC")
        .queryParam("page_size", "10");
		logger.info("URL to be called-Computed:"+builder.toString());
		return builder.build().toUri();
	}
	
}
