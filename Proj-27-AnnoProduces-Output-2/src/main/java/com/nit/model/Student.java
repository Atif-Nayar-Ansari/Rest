package com.nit.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	private int sid;
	private String sname;
	private List<String> subjects;
	private Address addrs;
	
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Address getAddrs() {
		return addrs;
	}
	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", subjects=" + subjects + ", addrs=" + addrs + "]";
	}
	

}
