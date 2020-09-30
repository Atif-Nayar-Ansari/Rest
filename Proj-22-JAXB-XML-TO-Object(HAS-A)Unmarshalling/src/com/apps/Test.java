package com.apps;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Test {

	public static void main(String[] args) {

		
		
		try {
			
			
			JAXBContext context = JAXBContext.newInstance(Customer.class);
			Unmarshaller um = context.createUnmarshaller();
			
			Object ob = um.unmarshal(new File("E://Customer.xml"));
			Customer c = (Customer) ob;
			System.out.println(c);
			
			
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
