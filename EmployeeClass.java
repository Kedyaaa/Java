package com.edubridge.decisionmaking;

import java.util.Scanner;

public class EmployeeClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int employeeId=s.nextInt();
		System.out.println("Enter Employee Name:");
		String employeename=s.next();
		System.out.println("Enter Address:");
		String address=s.next();
		System.out.println("Enter Designation:");
		String designation=s.next();
		System.out.println("Enter Salary:");
		int salary=s.nextInt();
		
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee Name:"+employeename);
		System.out.println("Enter Address:"+address);
		System.out.println("Enter Designation:"+designation);
		System.out.println("Enter Salary:"+salary);

	}

}
