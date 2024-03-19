 package com.March18;

import java.util.Scanner;

public class Test1 {
	static void pattern(int num) {
		for(int i=1;i<=num;i++)
		{
			for(int k=i+1;k<=num;k++)
			{
				System.out.println(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.println(i+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows for first pattern:");
		num1=sc.nextInt();
		System.out.println("Enter rows for second pattern:");
		num2=sc.nextInt();
		System.out.println("Enter rows for third pattern:");
		num3=sc.nextInt();
		
		pattern(num1);
		pattern(num2);
		pattern(num3);
		
		

	}

}
