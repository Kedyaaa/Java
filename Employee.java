package com.edubridge.decisionmaking;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Management System ");
		int choice=0;
		do {
			System.out.println("1.Employee Has To Enter Name");
			System.out.println("2.Employee Has To Enter Designation");
			System.out.println("3.Employee Has To Enter Specialition");
			System.out.println("4.Exit");
			Scanner s=new Scanner(System.in);
			choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Name:");
				String name=s.next();
				System.out.println("Employee Name:"+name);
				break;
			case 2:
				System.out.println("Enter Designation:");
				String designation=s.next();
				System.out.println("Employee Designation:"+designation);
				break;
			case 3:
				System.out.println("Enter Specialition:");
				String specialition=s.next();
				System.out.println("Employee Specialition:"+specialition);
				break;
			case 4:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Wrong Input!");
				break;
				
				
			}
	  	}while(choice!=4);

	}

}
