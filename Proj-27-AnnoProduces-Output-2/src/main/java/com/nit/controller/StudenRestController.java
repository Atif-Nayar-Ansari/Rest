package com.nit.controller;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nit.model.Address;
import com.nit.model.Student;

@Path("student")
public class StudenRestController {
	
	@GET
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces({"application/json","application/xml"})
	public Student StudentInfo() {
		

		Address a = new Address();
		a.setHno("house1");
		a.setLoc("Odisha");
		
		Student s = new Student();
		s.setSid(101);
		s.setSname("Atif");
		s.setSubjects(Arrays.asList("JAVA", "PYTHON", "SPRING"));
		s.setAddrs(a);
		
		return s;
	}

	
}
