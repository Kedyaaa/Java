package com.feb28;
class Vehical{
	double speed(double s) {
		return s;
	}
}
class Car extends Vehical{
	String showColour(String color) {
		return color;
	}
}
class Bike extends Car{
	int showPrize(int prize) {
		return prize;
	}
}
class Bicycle extends Bike{
	int showYearModel(int year) {
		return year;
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Bicycle b1=new Bicycle();
		System.out.println("The Speed of the Vehicle is :"+b1.speed(9.85));
		System.out.println("The Color of Car is:"+b1.showColour("Red"));
		

	}

}
