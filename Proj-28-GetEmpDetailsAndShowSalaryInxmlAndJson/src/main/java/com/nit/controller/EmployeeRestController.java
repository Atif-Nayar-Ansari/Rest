package com.nit.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.nit.model.Employee;
import com.nit.model.SalaryInfo;

@Path("/employee")
public class EmployeeRestController {

	@POST
	@Consumes({ "application/json", "application/xml" })
	@Produces({ "application/json", "application/xml" })
	public SalaryInfo processSal(Employee e) {

		double basic = e.getBasicSal();

		double hra = 5 * basic / 100.0;
		double ta = 2 * basic / 100.0;
		double da = 3 * basic / 100.0;
		double tax = 6 * basic / 100.0;
		double net = basic + hra + ta + da - tax;

		SalaryInfo s = new SalaryInfo();
		s.setEname(e.getEname());
		s.setBasic(basic);
		s.setHra(hra);
		s.setDa(da);
		s.setTax(tax);
		s.setNet(net);

		return s;
	}
}