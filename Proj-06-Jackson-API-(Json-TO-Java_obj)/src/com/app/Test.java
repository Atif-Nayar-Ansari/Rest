package com.app;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {

		String json = "{\"cid\":10,  \"cname\":\"Atif\",  \"amt\":1500.0}";
		//String json = "{}"; creating obj using default constructor
		
		try {
			

			ObjectMapper om = new ObjectMapper();
			Customer c = om.readValue(json, Customer.class);
			 
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
