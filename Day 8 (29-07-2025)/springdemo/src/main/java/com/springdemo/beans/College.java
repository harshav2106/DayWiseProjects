package com.springdemo.beans;

public class College {
	String hod;
	Department department;
	
	public College(String hod, Department department) {
		super();
		this.hod = hod;
		this.department = department;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "College [hod=" + hod + ", department=" + department + "]";
	}
	

}
