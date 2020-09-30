package com.apps;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Test {

	public static void main(String[] args) {

		//create Emp class object
		Employee emp = new Employee();
		emp.setEno(10);
		emp.setEname("Atif");
		emp.setSalary(123.32);
		
		try {

			//Define JAXB context object
			JAXBContext  context = JAXBContext.newInstance(Employee.class);
			
			//create marshaller object
			Marshaller m = context.createMarshaller();

			//to format the output
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			//call marshal method
			//m.marshal(emp, new File("E:/Emp.xml"));
			  m.marshal(emp, System.out);
			System.out.println("Done...");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
