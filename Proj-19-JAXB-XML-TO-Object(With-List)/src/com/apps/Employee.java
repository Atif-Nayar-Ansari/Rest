package com.apps;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	private List<String> empNames;

	public List<String> getEmpNames() {
		return empNames;
	}

	public void setEmpNames(List<String> empNames) {
		this.empNames = empNames;
	}

	@Override
	public String toString() {
		return "Employee [empNames=" + empNames + "]";
	}

	
	

}
