package com;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class AccountMain {
	public static long accNum = 0;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
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
		 
			System.out.println("Do you want to 1. deposit or 2. withdraw or 3. Check balance");
			int trans = sc.nextInt();
			if(trans == 1) {
				transaction(1, sa[0], ca[0]);
			}
			else if(trans ==2) {
				transaction(2, sa[0], ca[0]);
			}
			else {
				transaction(3, sa[0], ca[0]);
			}
			
		}

	public static SavingAccount createSavingAccount() {
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter age");
		float age = sc.nextFloat();
		Person accHolder = new Person(name, age);
		System.out.println("Enter initial balance");
		double balance = sc.nextDouble();
		if(balance < 500) {
			System.out.println("Minimum amount should be 500Rs. Please enter valid amount: ");
		}
		else {
			System.out.print("Account created successfully \nAcocunt Details are");
		}
		SavingAccount sa = new SavingAccount(accNum, balance, accHolder);
		
		System.out.println(sa.toString());
		
		return sa;
	}
	public static CurrentAccount createCurrentAccount() {
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter age");
		float age = sc.nextFloat();
		Person accHolder = new Person(name, age);
		System.out.print("Enter initial balance");
		double balance = sc.nextDouble();
		double overdraft = 10000;
		
		
		CurrentAccount ca = new CurrentAccount(accNum, 	balance, accHolder);
		System.out.print("Account created successfully \nAcocunt Details are");
		System.out.println(ca.toString());
		
		if(overdraft - amount > 10000) {
			System.out.println("Limit exceeds");
		}
		else {
		System.out.println("Amount debited \nUpdated Balance : " + balance);
		}
		return ca;
	}	
		
	public static void transaction(int trans, SavingAccount sa, CurrentAccount ca) {
		
		System.out.println("Enter account type 1. SavingAccount or 2. CurrentAccount");
		int accType = sc.nextInt();
		if(accType ==1) {
			if(trans ==1) {
				System.out.println("Enter Amount");
				double amount = sc.nextDouble();
				sa.deposit(amount);
				double minBalance = 500;
				if(amount - minBalance <= 500) {
					System.out.println("Minimum amount should be 500Rs. Please enter valid amount: " + amount);
				}
				
				else {
					System.out.println("Amount credited \nUpdated Balance : " + sa.getBalance());
				}
				
			}
			else if(trans ==2) {
				System.out.println("Enter Amount");
				double amount = sc.nextDouble();
				sa.withdraw(amount);
				double overdraft = 10000;
				if(overdraft - amount > 10000) {
					System.out.println("Limit exceeds");
				}
				else {
				System.out.println("Amount debited \nUpdated Balance : " + sa.getBalance());
				}
				
			}
			else {
				System.out.println("Balance : " + ca.getBalance());
			}
		}
		

		else {
			
				
			if(trans ==1) {
				System.out.println("Enter Amount");
				double amount = sc.nextDouble();
				ca.deposit(amount);
				System.out.println("Amount credited \nUpdated Balance : " + ca.getBalance());
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


