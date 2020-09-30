package com.apps;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	public static void main(String[] args) {

		try {
			
			//create the product class object
			Product p = new Product();
			p.setPid(101);;
			p.setPname("Laptop");
			p.setPcode(757034.0); 
			
			FileWriter f = new FileWriter("E:/abc.json");
			
			//Create the Gson object this is industry standard.
			Gson g = new GsonBuilder()
						.serializeNulls()
						.setPrettyPrinting()
						.create();
			
			//call  the json method to convert 
			g.toJson(p,f);
			//closing is mandetory if we don't write the close the out put will not be printed.
			f.close();
			
			System.out.println("Done....");

		} catch (Exception e) {
			e.printStackTrace();
		}	
	
	}

}
