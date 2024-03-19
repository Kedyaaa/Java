package com.March18;
interface Shape{
	public void show();
	
}
class Cube implements Shape{
	@Override
	public void show() {
		System.out.println("this is cube shape class");
		
	}
public class Test3 {
	

	public static void main(String[] args) {
		Cube c1=new Cube();

	}

}
}
