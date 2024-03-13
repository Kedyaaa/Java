package com.mar4;
class User{
	String uname;
	String passward;
	public User(String uname,String passward) {
		this.uname=uname;
		this.passward=passward;
	}
	void show() {
		System.out.println(uname+" "+passward);
	}
}

public class ThisKeyWord {

	public static void main(String[] args) {
		User u1=new User("jhon","jhon123");
		u1.show();

	}

}
