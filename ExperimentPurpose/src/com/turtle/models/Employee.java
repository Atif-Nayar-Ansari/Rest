package com.turtle.models;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	private int eno;
	private String ename;
	private Address addrs;
	private List<String> hobby;
	private Map<String, String> country;
	
	public Employee() {

	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddrs() {
		return addrs;
	}

	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	public Map<String, String> getCountry() {
		return country;
	}

	public void setCountry(Map<String, String> country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", addrs=" + addrs + ", hobby=" + hobby + ", country="
				+ country + "]";
	}


	
	
}
