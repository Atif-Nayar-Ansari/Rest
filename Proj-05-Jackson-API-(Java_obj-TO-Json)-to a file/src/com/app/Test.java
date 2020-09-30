package com.app;

import java.io.File;
import java.util.Arrays;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		
		
		try {

			Address a = new Address();
			a.setAid(1);
			a.setLoc("Hyd");
			a.setCodes(Arrays.asList("A","B","C")); //we can also write like this
			
			
			Person p = new Person();
			p.setPid(2);
			p.setPname("Atif");
			p.setAddr(a);
			
			
			//create ObjectMapper Object
			ObjectMapper om = new ObjectMapper();
			
			//file where to write
			File f = new File("E:\\abc.json");
			om.writeValue(f, p);
			
			System.out.println("Done...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
