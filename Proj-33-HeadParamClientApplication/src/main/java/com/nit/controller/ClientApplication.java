package com.nit.controller;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

public class ClientApplication {

	private static String uri="http://localhost:2424/Proj-32-HeafderParamProducerApp";
	private static String path="/rest/secure";

	public static void main(String[] args) {
		
		try {
			
			
			Response resp = ClientBuilder.newClient()
					        .target(uri)
					        .path(path)
					        .request()
					        .header("clientId","123")
					        .header("secureCode","abc")
					        .get();
					        
					        
					        
			System.out.println(resp.getStatus());
			System.out.println(resp.getStatusInfo());
			System.out.println(resp.readEntity(String.class));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
