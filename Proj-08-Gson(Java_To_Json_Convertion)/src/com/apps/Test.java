package com.apps;

import com.google.gson.Gson;

public class Test {

	public static void main(String[] args) {

		try {
			
			//create the product class object
			Product p = new Product();
			p.setPid(101);;
			p.setPname("Laptop");
			p.setPcode(757034.0);//upto this 
			
			//Create the Gson object
			Gson g = new Gson();//this is not industry standard bcoz if there is any null value it will
                    			// simply ignore that.

			//call  the json method to convert 
			String json = g.toJson(p);
			//display the result
			System.out.println(json);
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	
	}

}
