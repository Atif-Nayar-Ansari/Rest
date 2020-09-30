package com.apps;

import java.util.Map;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType
public class Employee {
	
	//@XmlElementWrapper(name = "a")
	private Map<String,String> ename;

	public Map<String, String> getEname() {
		return ename;
	}

	public void setEname(Map<String, String> ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + "]";
	}



	
	

}
