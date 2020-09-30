package com.turtle.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.turtle.models.Address;
import com.turtle.models.Employee;

public class ClientApp2 {

	public static void main(String[] args)  {

	//unmarshalling form xml to java object
		//xml -> java
		
		
		try {
			
			//create JAXBContext object 
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			
			//create unmarshaller object
			Unmarshaller um = context.createUnmarshaller();
			
			//call the unmarshaller method
			Object res = um.unmarshal(new File("F:\\Emp.xml"));
			
			Employee emp = (Employee) res;
			System.out.println(emp);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
