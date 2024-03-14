package com.march13;

public class Employee {
	private int empId;
	private String empName;
	private int empAge;
	private int empSalary;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String name, int empAge, int empSalary) {
		super();
		this.empId = empId;
		this.empName = name;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	public int getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

}
