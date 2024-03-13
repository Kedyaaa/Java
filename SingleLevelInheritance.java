package com.feb28;

class AccountHolder
{
	void info(String accNo,String name) {
		System.out.println("Account number:"+accNo+"\nPerson Name"+name);
	}
}	
class Bank{
	void getRoi(double roi) {
		System.out.println("Bank intrest:"+roi);
	}
}
public class SingleLevelInheritance {
	
	public static void main(String[] args) {
		AccountHolder a1=new AccountHolder();
		a1.info("123","Sujay");
		Bank b1=new Bank();
		b1.getRoi(5.6);
	}

}
