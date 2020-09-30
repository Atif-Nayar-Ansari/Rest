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

		try {  //it is long procedure to see in short show the next application
		
			//create client object
			Client c = ClientBuilder.newClient();

			//create webtarget by adding target(url) and path
			WebTarget wt = c.target(uri ).path(path );
			
			//invocation builder
			Builder b = wt.request();
			//execute request by using one method type and store the response
			Response resp = b.get();
			System.out.println(resp.getStatus());
			System.out.println(resp.getStatusInfo());
			System.out.println(resp.readEntity(String.class));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
