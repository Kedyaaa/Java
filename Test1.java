package com.march13;
import java.util.LinkedList;
import java.util.Scanner;


public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		LinkedList<Employee>l1=new LinkedList<Employee>();
		do 
		{
			System.out.println("LinkedList Implementation");
			
			System.out.println("Press 1:Add data into list");
			System.out.println("Press 2:Display list");
			System.out.println("Press 3:Update list");
			System.out.println("Press 4:Delete list");
			System.out.println("Press 5:Exit");
			System.out.println("Enter Choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the Employee id");
				int id=sc.nextInt();
				System.out.println("Enter the Employee name");
				int name=sc.nextInt();
				System.out.println("Enter the Employee age");
				int age=sc.nextInt();
				System.out.println("Enter the Employee salary");
				int salary=sc.nextInt();
				l1.add(new Employee());
				System.out.println("Data Added Successfully");
				break;
				
			case 2:
				System.out.println("LinkedList elements are:");
				for(int i=0;i<l1.size();i++) {
					System.out.println(l1.get(i));
					
				}
			break;
			
			case 3:
				System.out.println("Enter index no which you want change");
				int n=sc.nextInt();
				System.out.println("Enter name which you want to add on index");
				String name1=sc.next();
				Employee e=new Employee();
				e.setEmpName(name1);
				l1.set(n, e);
				System.out.println("Employee name updated");
				break;
				
			case 4:
				System.out.println("Enter index no which you want delete");
				int i=sc.nextInt();
				l1.remove(i);
				System.out.println("Index deleted successfully");
				break;
				
			case 5:
				System.out.println("Exit");
				break;
				default:
				System.out.println("Wrong choice");
			
			
			}
		}while(ch!=5);

	}

}
