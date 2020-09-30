package com.app;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Employee {

	private int eid;
	private String ename;
	@JsonIgnore //this property will not be converted to json
	private int esal;
	
	//const
	public Employee() {

	}

	//setters and getters
	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getEsal() {
		return esal;
	}


	public void setEsal(int esal) {
		this.esal = esal;
	}
	
}
