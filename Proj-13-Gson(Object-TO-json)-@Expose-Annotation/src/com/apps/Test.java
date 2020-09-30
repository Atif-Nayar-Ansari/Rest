package com.apps;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String[] args) {

		Customer c = new Customer();
		c.setCid(101);
		c.setCname("Atif Ansari");
		c.setCode("Vhs");
		c.setCver(78.89);
		
		Gson g = new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.setPrettyPrinting()
				.create();
		String json = g.toJson(c);
		System.out.println(json);
		
				
	}

}
