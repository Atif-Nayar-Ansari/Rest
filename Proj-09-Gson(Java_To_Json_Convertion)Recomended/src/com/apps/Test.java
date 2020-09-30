package com.apps;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String[] args) {

		try {
			
			//create the product class object
			Product p = new Product();
			p.setPid(101);;
			p.setPname("Laptop");
			p.setPcode(757034.0);//upto this 
			
			//Create the Gson object this is industry standard.
			Gson g = new GsonBuilder()
						.serializeNulls()
						.setPrettyPrinting()
						.create();
			
			//call  the json method to convert 
			String json = g.toJson(p);
									 
			//display the result
			System.out.println(json);
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	
	}

}
