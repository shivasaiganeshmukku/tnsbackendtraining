package com.Tnsif.Inheritance;
//method overriding
public class BankMain {
//main class
	public static void main(String[] args) {
		//creating object for the bank names
		Bank b1 = new SBI();
		Bank b2 = new ICICI();
		Bank b3 = new AXIS();
		
		System.out.println("SBI Interest Rate:" + b1.getInterestRate());
		System.out.println("ICICI Interest Rate:" + b2.getInterestRate());
		System.out.println("AXIS Intrest Rate:" + b3.getInterestRate());
		
	}

}
