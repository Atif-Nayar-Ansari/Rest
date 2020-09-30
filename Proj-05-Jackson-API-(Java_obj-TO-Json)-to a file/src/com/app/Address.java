package com.app;

import java.util.List;

public class Address {
	
	private int aid;
	private String loc;
	private  List<String> codes;
	
	//default constructor
	public Address() {

	}

	//setters and getters
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<String> getCodes() {
		return codes;
	}

	public void setCodes(List<String> codes) {
		this.codes = codes;
	}
	
	

}
