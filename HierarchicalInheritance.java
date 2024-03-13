package com.feb28;
class Student{
	String name="Rahul";
	String address="Thane";
	String qualification ="BE CSE";
}
class Course extends Student
{
	String cName="Java Full stack";
	int fees=50000;
}
class Placement extends Student{
	String compName="Capgemini";
	String ctc="5Lakh";
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Course c1=new Course();
		Placement p1=new Placement();
		System.out.println("Student Name:"+c1.name+
				"\nStudent address:"+c1.address+
				"\nStudent qualification:"+c1.qualification+
				"\nCource Name:"+c1.cName+
				"\ncourse fees:"+c1.fees+
				"\nCompany Name:"+p1.compName+
				"\nCTC:"+p1.ctc);

	}

}
