package com.turtle.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {
	
	private String ano;
	private String aname;
	
	
	public Address() {

	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	@Override
	public String toString() {
		return "Address [ano=" + ano + ", aname=" + aname + "]";
	}

}
