package com.app;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {

		try {
			
			 Employee e = new Employee();
			 e.setEid(101);
			 e.setEname("Atif");
			 e.setEsal(123);
			 
			 ObjectMapper om = new ObjectMapper();
			 String json = om.writeValueAsString(e);
			 System.out.println(json);
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
