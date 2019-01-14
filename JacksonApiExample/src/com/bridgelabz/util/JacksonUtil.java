package com.bridgelabz.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonUtil {
	private static ObjectMapper mapper;
	{
		mapper=new ObjectMapper();
	}
public static String convertJavaToJson(Object object)
{
	String jsonResult="";
		try {
			jsonResult=mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			System.out.println("Exception occured durring java object to json:"+e.getMessage());
			
		} catch (JsonMappingException e) {
			System.out.println("Exception occured durring java object to json:"+e.getMessage());
			
		} catch (IOException e) {
			System.out.println("Exception occured durring java object to json:"+e.getMessage());
			
		}
	
	return jsonResult;
}
}
