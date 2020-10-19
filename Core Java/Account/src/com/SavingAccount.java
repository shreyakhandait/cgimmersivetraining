package com;



public class SavingAccount extends Account{
	public SavingAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}


	private final double minBalance = 500;
	
	@Override
	public void withdraw(double amount) {
		double balance  = getBalance();
		balance = balance - amount;
		setBalance(balance);
	}
	@Override
	public void deposit(double amount) {
		double balance = getBalance();
		balance= balance+amount;
		setBalance(balance);
	}
	
		

	@Override
	public String toString() {
		
		return "SavingAccount [getAccNum()=" + getAccNum() + ", getBalance()=" + getBalance() + ", getAccHolder()="
				+ getAccHolder() + "]";
	}
}
