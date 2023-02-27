package com.ibm.restUtil;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);
	private static final String TRACE_TAG="JsonUtil->";
//	private static ObjectMapper mapper;
	
	private JsonUtil(){		
	}
	
//	static{
//		
//		mapper = new ObjectMapper();
//	}

	public static String convertJavaToJson(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonResult = null;
		try {
			if(null!=object){			
				jsonResult = mapper.writeValueAsString(object);
			}
			
		} catch (JsonGenerationException e) {
			logger.error(TRACE_TAG+"JsonGenerationException in convertJavaToJson() : "+e);
		} catch (JsonMappingException e) {			
			logger.error(TRACE_TAG+"JsonMappingException in convertJavaToJson() : "+e);
		} catch (IOException e) {
			logger.error(TRACE_TAG+"IOException in convertJavaToJson() : "+e);
		}
		return jsonResult;
	}
	
	public static <T> T convertJsontoJava(String json,Class<T> cls){
		ObjectMapper mapper = new ObjectMapper();
		T result = null;
		try {
			if(null!=json && null!=cls){
				result = mapper.readValue(json, cls);
			}
		} catch (JsonParseException e) {
			logger.error(TRACE_TAG+"JsonParseException in convertJsontoJava() : "+e);
		} catch (JsonMappingException e) {
			logger.error(TRACE_TAG+"JsonMappingException in convertJsontoJava() : Not an instance of : "+cls+" : "+e);
		} catch (IOException e) {
			logger.error(TRACE_TAG+"IOException in convertJsontoJava() : "+e);
		}
		return result;
		
	}
}
