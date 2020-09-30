package com.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/payment")
public class PaymentRestController {
	
	@GET
	@Path("name")
	public String ShowMessage() {
		return "My Name is Atif Nayar Ansari";
	}
	@GET
	@Path("number")
	public int ShowMessage1() {
		return 45;
	}

}


//  http://localhost:2525/Proj-23-REST/rest/payment/name   type it in browser