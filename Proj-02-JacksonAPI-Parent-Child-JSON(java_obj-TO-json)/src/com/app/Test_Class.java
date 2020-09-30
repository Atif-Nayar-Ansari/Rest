package com.app;

import org.codehaus.jackson.map.ObjectMapper;

public class Test_Class {

	public static void main(String[] args) {

		// child class object
		Course_Child_Class c = new Course_Child_Class();
		c.setCid(1);
		c.setCname("Java");

		// parent class object
		Student_Parent_Class s = new Student_Parent_Class();
		s.setSid(101);
		s.setSname("Atif");
		s.setFee(500.6);
		s.setCourse(c);//HAS-A relation
		try {

			// create ObjectMapper object
			ObjectMapper om = new ObjectMapper();

			// call the convertion method
			String json = om.writeValueAsString(s);
			
			//print the data
			System.out.println(json);

		} 
		catch (Exception e ) {
			e.printStackTrace();
		}

	}

}
