package com.nt.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/card")
public class CardRestController {

	@POST
	@Path("pay")              //receive the data from the url
	public String doPayment(@FormParam("cname") String name,
							@FormParam("cnum") String num,
							@FormParam("cvv") String cvv,
							@FormParam("camt") int  amt,
							@FormParam("cdate") String dte)
	{
		return new StringBuilder()
				   .append("Name: ").append(name)
				   .append(",Num: ").append(num)
				   .append(",Cvv: ").append(cvv)
				   .append(",Amt: ").append(amt)
				   .append(",Date: ").append(dte)
				   .toString();
	}
	
}
