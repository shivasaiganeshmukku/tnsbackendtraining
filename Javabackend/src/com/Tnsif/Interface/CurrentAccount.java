package com.Tnsif.Interface;
//class of current account from the interface of Bank account
public class CurrentAccount implements BankAccount {
	private int balance;
	//constructor
	CurrentAccount(int initialbalance){
		balance = initialbalance;
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		balance += amount;
		System.out.println("Deposit " + amount + "in current balance " + balance);
		
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if (balance - amount >= -500 ) {
			balance -=amount;
			System.out.println("withdraw " + amount + "from current Balance: " + balance);
		}else {
			System.out.println("overdraft  limit exceed in current.");
		}
		
	}
	
	

}
