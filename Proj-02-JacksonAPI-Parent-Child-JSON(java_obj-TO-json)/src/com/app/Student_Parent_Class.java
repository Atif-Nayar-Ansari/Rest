package com.app;

public class Student_Parent_Class {
	
	private int sid;
	private String sname;
	private double fee;
	private Course_Child_Class course;
	
	//default constructor
	public Student_Parent_Class() {

	}

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

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Course_Child_Class getCourse() {
		return course;
	}

	public void setCourse(Course_Child_Class course) {
		this.course = course;
	}


}
