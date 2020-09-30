package com.app;

public class Person {

	private int pid;
	private String pname;
	private Address addr;//HAS-A relation
	
	
	//default constructor
	public Person() {

	}

	//setters and getters
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

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
}
