package com.feb29;
class Employee{
	void show(String name) {
		System.out.println("Employee Name:"+name);
	}
}
class Company{
	void show(String name) {
		System.out.println("Company Name:"+name);
	}
}

public class Overiding {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Company c1=new Company();
		e1.show("Jhon Smith");
		c1.show("Capgemini");

	}

}
