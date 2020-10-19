package com;

import java.util.Scanner;

public class CurrentAccount extends Account {

		
		
	private double overdraft;

	public CurrentAccount(long accNum2, double balance2, Person accHolder2) {
		super(accNum2, balance2, accHolder2);
		System.out.println("In Current Account" + balance2);
		this.overdraft = overdraft;
	}
	
	
	public double getOverdraft() {
		return overdraft;
	}


	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}


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
	public double overdraft(double amount) throws NullPointerException {
		
		if(amount >= 10000) {
			throw new NullPointerException("Limit exceeds");
			
		}else {
			System.out.println("Enter the amount to withdraw: " + amount);
		}
		return amount;
		
	}
	
	
}
			


	
