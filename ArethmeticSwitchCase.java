package com.edubridge.decisionmaking;

import java.util.Scanner;

public class ArethmeticSwitchCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice=s.nextInt();
		System.out.println("Enter the a");
		int a=s.nextInt();
		System.out.println("Enter the b");
		int b=s.nextInt();
		switch (choice){
		
		case 1:
			System.out.println("Add:"+(a+b));
			break;
		case 2:
			System.out.println("Sub:"+(a-b));
			break;
		case 3:
			System.out.println("Mul:"+(a*b));
			break;
		case 4:
			System.out.println("Div:"+(a/b));
			break;
		}
		


	}

}
