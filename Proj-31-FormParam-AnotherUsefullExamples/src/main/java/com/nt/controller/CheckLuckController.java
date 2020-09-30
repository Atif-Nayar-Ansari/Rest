package com.nt.controller;

import java.util.Random;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/luck")
public class CheckLuckController {

	@POST
	public String doPayment(@FormParam("num") int number)      //receive the data from the url
	{

		String msg = null;
		//Generate the random Number
		int rand = new Random().nextInt(5);
		if(number==rand) {
			msg="Congrats you won 1 cror...";
		}
		else
		{
			msg="Better luck next time..";
		}
		
		return msg;
		
	}
	
}
