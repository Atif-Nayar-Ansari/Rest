package com.apps;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String[] args) {

		String json = "{ \"cid\": 101, \"cname\": \"Atif Ansari\" }";
		
		
		Gson g  =  new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.create();
		 Customer c = g.fromJson(json, Customer.class );
		
		System.out.println(c);
		
				
	}

}
