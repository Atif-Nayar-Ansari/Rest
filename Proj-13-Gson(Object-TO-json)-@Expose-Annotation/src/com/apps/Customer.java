package com.apps;

import com.google.gson.annotations.Expose;

public class Customer {
	
	@Expose //it will apear in json
	private int cid;
	
	@Expose(serialize = true) //same as above one
	private String cname;
	
	@Expose(serialize = false ) // will not apear in  json output
	private double cver;
	
	private String code; // also will not apear bcoz we are using .excludeFieldsWithoutExposeAnnotation() function
	
	//def cons
	public Customer() {

		}
	
		public int getCid() {
			return cid;
		}
	
		public void setCid(int cid) {
			this.cid = cid;
		}
	
		public String getCname() {
			return cname;
		}
	
		public void setCname(String cname) {
			this.cname = cname;
		}
	
		public double getCver() {
			return cver;
		}
	
		public void setCver(double cver) {
			this.cver = cver;
		}
	
		public String getCode() {
			return code;
		}
	
		public void setCode(String code) {
			this.code = code;
		}
	

}
