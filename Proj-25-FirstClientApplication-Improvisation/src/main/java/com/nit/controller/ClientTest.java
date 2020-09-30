package com.nit.controller;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ClientTest {

	private static String uri = "http://localhost:2424/Proj-23-REST/";
	private static String path = "rest/payment/name";

	public static void main(String[] args) {

		try {  //it is industries standards best practices
		
			Response resp = ClientBuilder
					        .newClient()
					        .target(uri)
					        .path(path)
					        .request()
					        .get();
			
			System.out.println(resp.getStatus());
			System.out.println(resp.getStatusInfo());
			System.out.println(resp.readEntity(String.class));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
