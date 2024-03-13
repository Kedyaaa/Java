package com.edubridge.decisionmaking;

import java.util.Scanner;

public class RevercePattern{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int row=s.nextInt();
		for(int j=row;j>=1;j--) {
			for(int i=2*(row-j);i>=1;i--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=j;k++) {
				System.out.print("  *");
			}
			System.out.println();
		}
		

	}

}

