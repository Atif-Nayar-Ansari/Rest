package com.app;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {

	
		try {
			
			File f = new File("E:/abc.json");

			ObjectMapper om = new ObjectMapper();
			Customer c = om.readValue(f, Customer.class);
			 
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
