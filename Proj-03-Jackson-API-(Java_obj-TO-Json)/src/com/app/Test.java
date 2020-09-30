package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		
		
		try {

			Address a = new Address();
			a.setAid(1);
			a.setLoc("Hyd");

		/*	//to enter the data into list
			List<String> s = new ArrayList<>();
			s.add("A");
			s.add("B");
			s.add("C");
			
			a.setCodes(s);*/
			
				//or
			a.setCodes(Arrays.asList("A","B","C")); //we can also write like this
			
			
			Person p = new Person();
			p.setPid(2);
			p.setPname("Atif");
			p.setAddr(a);
			
			
			//create ObjectMapper Object
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(p);
			
			System.out.println(json);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}
