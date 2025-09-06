package com.Tnsif.Interface;
//bank account main class
public class BAMain {
	public static void main(String[] args) {
		BankAccount  saving = new SavingsAccoount(1000);
		BankAccount current = new CurrentAccount(500);
		
		// savings account operator
		saving.deposit(500);
		saving.withdraw(300);
		saving.withdraw(1200);
		
		
		//current account operator
		current.deposit(300);
		current.withdraw(900);
		current.withdraw(200);
	}

	
	
}
