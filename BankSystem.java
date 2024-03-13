package com.feb29;
class AtmCard{
	void transactionhistoy(int deposite) {
		System.out.println("Deposited Rs:"+deposite);
	}
	void transactionhistoy(long withdraw) {
		System.out.println("Withdraw Rs:"+withdraw);
}
}

public class BankSystem {

	public static void main(String[] args) {
		AtmCard a1=new AtmCard();
		a1.transactionhistoy(100);
		a1.transactionhistoy(10L);
		

	}

}
