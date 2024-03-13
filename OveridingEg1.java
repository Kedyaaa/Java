package com.feb29;
class vehical{
	void speed(int s) {
		System.out.println("Speed of Vehical"+s);
	}
}
class Car extends vehical{
	void speed(int s) {
		System.out.println("Speed of Car:69+47/8"+s);
	}
}
class Bus extends vehical {
	void speed(int s) {
		System.out.println("Speed of Bus:"+s);
		
	}
}
class Bicycle extends vehical{
	void speed(int s){
		System.out.println("Speed of Bicycle:"+s);
	}
}

public class OveridingEg1 {

	public static void main(String[] args) {
		
		vehical a1,a2,a3;
		
		a1=new Car();
		a2=new Bus();
		a3=new Bicycle();
		
		a1.speed(10);
		a2.speed(20);
		a3.speed(30);
		
		

	}

}
