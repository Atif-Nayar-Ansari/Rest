package com.apps;

public class Product {
	
	private int pid;
	private String pname;
	private transient double pcode; // transient will ignore the property in the json output
	
	public Product() {

	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPcode() {
		return pcode;
	}

	public void setPcode(double pcode) {
		this.pcode = pcode;
	}

}
