package com.apps;

import com.google.gson.annotations.Expose;

public class Customer {
	
	@Expose(serialize = false) //it will apear in java obj either true or false here serialize does not matter
	private int cid;
	
	@Expose(deserialize = true) //it will apear in java object
	private String cname;
	
	@Expose(deserialize = false ) // will not apear in  java object output
	private double cver;
	
	private String code; // also will not apear bcoz we are using .excludeFieldsWithoutExposeAnnotation() function
	
	private String addrs;
	
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

		public String getAddrs() {
			return addrs;
		}

		public void setAddrs(String addrs) {
			this.addrs = addrs;
		}

		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", cname=" + cname + ", cver=" + cver + ", code=" + code + ", addrs="
					+ addrs + "]";
		}

	

}
