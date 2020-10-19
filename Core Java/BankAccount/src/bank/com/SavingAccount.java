 package bank.com;

 import java.util.*;
 public class SavingAccount extends Account {
 	Random rand = new Random();
 	private final int minmBal=500;
 	@Override
 	public boolean withdraw(double withdraw) {
 		double balance=getBalance();
 		double temp=balance-withdraw;
 		if(temp>minmBal)
 			super.withdraw(withdraw);
 		else
 			System.out.println("Cannot withdraw as need to have minimum balance");
		return false;
 	}
 	
 	public SavingAccount(String name,float age,double balance) {
 		setAccHolder(new Person(name,age));
 		setAccNum(rand.nextLong());
 		setBalance(balance);
 		
 	}
 }
