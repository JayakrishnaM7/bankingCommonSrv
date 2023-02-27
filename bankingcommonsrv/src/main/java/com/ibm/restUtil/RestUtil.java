package com.ibm.restUtil;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.ibm.domain.BaseResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public abstract class RestUtil {

	private long startTime;
	
	private String TRACE_TAG="RestWsUtil.";
	private static final Logger logger = LoggerFactory.getLogger(RestUtil.class);

	/**
	 * Abstract method to fetch REST Service Name
	 * 
	 * @return ServiceName
	 */
	protected abstract String getRestServiceName();

	/**
	 * Abstract method for building BT request.
	 * 
	 * @return JSON request string
	 */
	protected abstract String buildJsonRequest();

	/**
	 * Abstract method for parsing JSON response
	 */
	@SuppressWarnings("rawtypes")
	protected abstract void parseJsonResponse(ResponseEntity response) throws Exception;

	/**
	 * Abstract method to get Suffix url
	 * 
	 * @return
	 */
	protected abstract String getSuffixUrl();
	/**
	 * Abstract method to get Rest Ws url
	 * 
	 * @return
	 */
	protected abstract String getRestWsUrl();
	/**
	 * Method to make REST WS call and log metrics,json response into log file.
	 * 
	 * @return
	 * @throws Exception
	 */
	public final boolean callRestService() throws Exception {
		logger.info("Entering External Service call:::");
		String requestJson = attachRequestHeaders(buildJsonRequest());
		String serviceName = getRestServiceName();
		String url = getRestWsUrl();

		//String url = "http://localhost:8280/RmsRestService/salesService/queryGetReservations";
		String salesRepId = null;
		long startTimeInMillis = 0;
		

		boolean success = false;
		logger.info("External Service call:::Payload"+requestJson);

		//logApiRequest(requestJson, salesRepId, serviceName, true);

		// Create HttpEntity object by using request JSON.
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("X-Auth-Token",System.getenv("tmvauthtoken"));
		
		HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
		RestTemplate restTemplate = new RestTemplate();
		setStartTime(System.currentTimeMillis());
		long endTimeMillis = 0;

		// Make REST Api call
		try {
			ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
			success = true;
			// Parse Api Response
			logger.info("Response from TMV:::"+ response);
			parseJsonResponse(response);
			
		} catch (org.springframework.web.client.HttpClientErrorException httpe) {

			//added after getting a 404 error that tells absolutely nothing about the real cause
			logger.error(TRACE_TAG+" - Exception in callRestService() : "+httpe.getMessage());
			success = false;
			throw new Exception("Error calling "+url+" : "+httpe.getMessage(),httpe);
			
		} catch (Exception e) {
			// Timeouts/Internal server errors
			success = false;
			
			throw e;

		} finally {
		}
		return true;
	}
	public final boolean callRestServicewithReq(String myRequest) throws Exception {
		logger.info("Entering External Service call::: (FundTransfer Flow) "+myRequest);
		//String requestJson = attachRequestHeaders(myRequest);
		String url = getRestWsUrl();
	
		boolean success = false;
		//logger.info("External Service call:::Payload"+requestJson);

		//logApiRequest(requestJson, salesRepId, serviceName, true);

		// Create HttpEntity object by using request JSON.
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("X-Auth-Token",System.getenv("tmvauthtoken"));
		
		HttpEntity<String> entity = new HttpEntity<String>(myRequest, headers);
		RestTemplate restTemplate = new RestTemplate();
		setStartTime(System.currentTimeMillis());
	
		// Make REST Api call
		try {
			ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
			success = true;
			// Parse Api Response
			logger.info("Response from TMV:::"+ response);
			parseJsonResponse(response);
			
		} catch (org.springframework.web.client.HttpClientErrorException httpe) {

			//added after getting a 404 error that tells absolutely nothing about the real cause
			logger.error(TRACE_TAG+" - Exception in callRestService() : "+httpe.getMessage());
			success = false;
			throw new Exception("Error calling "+url+" : "+httpe.getMessage(),httpe);
			
		} catch (Exception e) {
			// Timeouts/Internal server errors
			success = false;
			
			throw e;

		} finally {
		}
		return true;
	}

	public abstract URI getRestWsUrlWithParam(String customerId);
	





public final boolean callGetRestService(String customeId) throws Exception {
	String requestJson = attachRequestHeaders(buildJsonRequest());
	String serviceName = getRestServiceName();
	URI url = getRestWsUrlWithParam(customeId);
	//String url = "http://localhost:8280/RmsRestService/salesService/queryGetReservations";
	String salesRepId = null;
	long startTimeInMillis = 0;
	

	boolean success = false;

	//logApiRequest(requestJson, salesRepId, serviceName, true);

	// Create HttpEntity object by using request JSON.
	HttpHeaders headers = new HttpHeaders();
	headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
	headers.add("X-Auth-Token", System.getenv("tmvauthtoken"));
	
	HttpEntity<String> entity = new HttpEntity<String>(headers);
	RestTemplate restTemplate = new RestTemplate();
	setStartTime(System.currentTimeMillis());
	long endTimeMillis = 0;

	// Make REST Api call
	try {
		logger.info("URL to be called-CBS:"+url);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		success = true;
		// Parse Api Response
		logger.info("Response from TMV:::"+ response);
		parseJsonResponse(response);
		
	} catch (org.springframework.web.client.HttpClientErrorException httpe) {

		//added after getting a 404 error that tells absolutely nothing about the real cause
		logger.error(TRACE_TAG+" - Exception in callRestService() : "+httpe.getMessage());
		success = false;
		throw new Exception("Error calling "+url+" : "+httpe.getMessage(),httpe);
		
	} catch (Exception e) {
		// Timeouts/Internal server errors
		success = false;
		
		throw e;

	} finally {
	}
	return true;
}
	/**
	 * Attaches header information to request body string
	 * @param requestJson
	 * @param daoContext
	 * @return
	 */
	private String attachRequestHeaders(String requestJson){
		Map <String,HashMap<String,String>> jsonRequest=new HashMap<String,HashMap<String,String>>();
		Map <String,String> jsonHeader=new HashMap<String,String>();
		String tmpReqJson=requestJson;
		try{
			if(null==tmpReqJson || (tmpReqJson.trim().length()==0)){
				tmpReqJson="";
			} 
			
				jsonHeader.put("appId","Test");		
				jsonHeader.put("applUserId","Test01");
				jsonHeader.put("applPassword","Test01");
				jsonRequest.put("header",(HashMap<String,String>)jsonHeader);
				String headerString=JsonUtil.convertJavaToJson(jsonRequest);
				if(!("{}".equalsIgnoreCase(tmpReqJson))){
					tmpReqJson=tmpReqJson.replaceFirst("\\{",headerString.substring(0,headerString.length()-1).concat(","));
				}
				else{
					tmpReqJson=tmpReqJson.replaceFirst("\\{",headerString.substring(0,headerString.length()-1));
				}
		}
		catch(Exception e){			
			logger.error(TRACE_TAG+"Exception in attachRequestHeaders() : "+e);
			throw e;
		}
		return tmpReqJson;
	}

	/**
	 * Mock Implementation Checks for exceptions/errors in response to log
	 * process metrics
	 * 
	 * @param response
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private boolean checkForErrors(ResponseEntity response) {
		boolean success = true;
		if (null != response) {
			String jsonRes = (String) response.getBody();
			try {
				if (null != jsonRes) {
					BaseResponse baseRes = JsonUtil.convertJsontoJava(jsonRes, BaseResponse.class);
					if (null != baseRes) {
						if (!baseRes.isSuccess()
								&& (null != baseRes.getErrorCode() || null != baseRes.getErrorDesc())) {
							success = false;
						}
					}
				} else {
					success = false;
				}
			} catch (Exception e) {
				logger.error(TRACE_TAG+"Exception in checkForErrors() : "+e);
				throw e;
			}
		} else {
			success = false;
		}
		return success;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
}
