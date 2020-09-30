package com.apps;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Test {

	public static void main(String[] args) {

		
		try {

			//Define JAXB context object
			JAXBContext  context = JAXBContext.newInstance(Employee.class);
			
			//create Unmarshaller object
			Unmarshaller m = context.createUnmarshaller();

			Object ob = m.unmarshal(new File("F://Emp.xml"));
			Employee emp = (Employee) ob;
			System.out.println(emp);
			
			         //or
			/*if(ob instanceof Employee) {
				Employee emp = (Employee) ob;
				System.out.println(emp);
			}
			else
			{
				System.out.println("Not a Employee xml..");
			}*/
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
