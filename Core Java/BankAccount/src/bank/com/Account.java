package bank.com;

import java.util.*;
public class Account {
	Random rand = new Random();
	private long accNum;
	private double balance;
	Person accHolder;
	
	public Account(String name,float age,double balance) {
		setAccHolder(new Person(name,age));
		this.balance=balance;
	}
	
	
	public void deposit(double dep) {
		balance+=dep;
	}
	
	public void withdraw(double withdraw) {
		balance-=withdraw;
	}
	
	//getter and setters
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public long getAccNum() {
		return accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
