package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/class")
public class RestController {
	
	@GET
	@Path("/msg")
	public String GetMessage() {
		return "atif Ansari";
	}
	

}
