package com.rest.main;

import org.codehaus.jackson.map.ObjectMapper;

import com.rest.classes.Student;

public class TestClass {

	public static void main(String[] args)throws Exception {

		Student s = new Student();
		s.setSid(1);
		s.setSname("Atif");
		s.setSal(1234);
		ObjectMapper om = new ObjectMapper();
		
		String json = om.writeValueAsString(s);
		
		System.out.println(json);
		
	}

}
