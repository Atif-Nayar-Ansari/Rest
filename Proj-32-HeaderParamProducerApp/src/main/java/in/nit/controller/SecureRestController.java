package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

@Path("/secure")
public class SecureRestController {

	@GET
	public String verifyAndProcess(@HeaderParam("clientId") String id,
			                       @HeaderParam("secureCode") String code) 
	{
		System.out.println("id="+id);
		System.out.println("code="+code);
		String message = null;
		if(id==null || "".equals(id.trim())) {
			message="Empty client id provided";
		}
		else if(code==null || "".equals(code.trim())) {
			message="Empty client code is provided";
		}
		else if("123".equals(id) && "abc".equalsIgnoreCase(code)){
			message = "welcome to Amazon client";
		}
		return message;
	}
}
