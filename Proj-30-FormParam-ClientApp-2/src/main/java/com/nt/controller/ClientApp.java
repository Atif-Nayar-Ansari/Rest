package com.nt.controller;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

public class ClientApp {
	
		private static String uri="http://localhost:2424/Proj-29-FormParam-POST-1";
		private static String path="/rest/card/pay";

		public static void main(String[] args) {
			
			try {
				
				//Logical form
				Form f = new Form();
				f.param("cname","atif");
				f.param("cnum","24");
				f.param("cvv","Cvv123");
				f.param("camt","143");
				f.param("cdate","17/01/2020");
				
				Response resp = ClientBuilder.newClient()
						        .target(uri)
						        .path(path)
						        .request()
						        .post(Entity.form(f));
				System.out.println(resp.getStatus());
				System.out.println(resp.getStatusInfo());
				System.out.println(resp.readEntity(String.class));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
