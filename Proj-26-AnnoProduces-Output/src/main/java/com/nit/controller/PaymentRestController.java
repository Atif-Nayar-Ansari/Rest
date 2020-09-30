package com.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/payment")
public class PaymentRestController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Payment ShowPaymentInfo() {
		
		Payment p = new Payment();
		p.setPid(101);
		p.setPacode("code10");
		p.setPamt(33.89);
		return p;
		
	}
}
