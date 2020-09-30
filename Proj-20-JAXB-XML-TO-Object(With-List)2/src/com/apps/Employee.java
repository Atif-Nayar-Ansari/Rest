package com.apps;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType
public class Employee {
	
	//@XmlElementWrapper(name = "a")
	private List<String> emp;

	public List<String> getEmp() {
		return emp;
	}

	public void setEmp(List<String> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Employee [emp=" + emp + "]";
	}


	
	

}
