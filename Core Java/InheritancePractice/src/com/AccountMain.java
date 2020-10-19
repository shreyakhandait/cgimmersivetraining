package com;

import java.util.*;

public class AccountMain {
	static Scanner sc = new Scanner(System.in);
	static long accNum;
	
	public static void main(String[] args) {

/**		
		SavingAccount sa[] = new SavingAccount[2];
		{
			for(int i = 0; i<sa.length; i++) {
				System.out.println(sa[i]);
			}
		}
		CurrentAccount ca[] = new CurrentAccount[2];
		{
			for(int i = 0; i<ca.length; i++) {
				System.out.println(sa[i]);
			}
		}

**/
		SavingAccount sa[] = new SavingAccount[10];
		CurrentAccount ca[] = new CurrentAccount[10];
		System.out.println("Do you have bank account? 1. yes 2. no");
		int ans = sc.nextInt();
		if(ans == 2) {
			System.out.println("Do you want to open 1.saving account or 2.current account ");
			int acc = sc.nextInt();
			accNum++;
			if(acc ==1) {
				sa[0] = createSavingAccount();
			}
			else {
				ca[0] = createCurrentAccount();
			}
		}
		
		
		
		System.out.println("Do you want to: 1. deposit 2. Withdraw");
		int acc = sc.nextInt();
		if(acc  == 1) {
			transaction(1, sa[2], ca[2]);
;		}
		else {
			transaction(2, sa[2], ca[2]);
		}
		
	}
		
	private static CurrentAccount createCurrentAccount() {
		System.out.println("Enter name: " );
		String name = sc.next();
		System.out.println("Enter age: ");
		float age = sc.nextFloat();
		Person accHolder = new Person(name, age);
		System.out.println("Enter initial balance: ");
		double balance = sc.nextDouble();
		
		CurrentAccount ca = new CurrentAccount(accNum, balance, accHolder);
		System.out.print("Account created successfully \nAcocunt Details are");
		System.out.println(ca.toString());
		return ca;
	}


	private static SavingAccount createSavingAccount() {
		System.out.println("Enter name: " );
		String name = sc.next();
		System.out.println("Enter age: ");
		float age = sc.nextFloat();
		Person accHolder = new Person(name, age);
		System.out.println("Enter initial amount : ");
		double minBalance = sc.nextDouble();
		if(minBalance < 500)
		{
			System.out.println("Minimum Balance should be 500. Please Enter Valid amount");
			}
		else if(minBalance > 500){
				System.out.println("Enter initial amount : "  + minBalance);
			}
		else {
			System.out.println("Enter initial balance is : " + minBalance);
		}
		
		double balance = sc.nextDouble();
		SavingAccount sa = new SavingAccount(accNum, balance, accHolder);
		System.out.println(sa.toString());
		System.out.print("Account created successfully \nAcocunt Details are");
		
		
		return sa;
	}



	private static void transaction(int i, SavingAccount sa, CurrentAccount ca) {
		System.out.println("Enter account type: 1. SavingAccount 2. CurrentAccount");
		int trans=sc.nextInt();
		int accType=sc.nextInt();
		if(accType == 1) {
			if(trans == 1) {
				double amount = sc.nextDouble();
				System.out.println("Amount credited \nUpdated Balance : " + sa.getBalance());
				sa.deposit(amount);
			}	

			else if(trans == 2) {
				System.out.println("Enter Amount");
				double amount = sc.nextDouble();
				sa.withdraw(amount);
				System.out.println("Amount debited \nUpdated Balance : " + sa.getBalance());
			}
			}
		else {
			
			if(trans ==1) {
				System.out.println("Enter Amount");
				double amount = sc.nextDouble();
				double overdraft = 10000;
				if(overdraft < amount) {
					System.out.println("Limit exceeds");
				}
				else {
					System.out.println("Amount credited \nUpdated Balance : " + ca.getBalance());
				}
				ca.deposit(amount);
				
			}
			else if(trans ==2) {
				System.out.println("Enter Amount");
				double amount = sc.nextDouble();
				ca.withdraw(amount);
				System.out.println("Amount debited \nUpdated Balance : " + ca.getBalance());
			}
			else {
				System.out.println("Balance : " + ca.getBalance());
			}
		}

			
		}
	}
		
		
			
				
			
		
