package com.Tnsif.Interface;
//saving account class for bank account interface
public class SavingsAccoount implements BankAccount {
	private int balance;
	//constructor
	SavingsAccoount(int initialbalance){
		balance = initialbalance;
	}
	
	@Override
	public void deposit(int amount) {
		balance += amount;
		System.out.println("Deposit " + amount + "in savings.  Balance: " + balance);
		
	}
	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if (balance >= amount) {
			balance -=amount;
			System.out.println("withdraw " + amount + "from saving. Balance: " + balance);
		}else {
			System.out.println("Insufficient blaance in savings.");
		}
		
	}

}
