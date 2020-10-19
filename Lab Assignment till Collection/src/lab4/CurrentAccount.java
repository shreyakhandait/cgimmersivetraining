package lab4;
import java.util.*;
public class CurrentAccount extends Account {
	Random rand = new Random();
	private double overdraft=-20;
	@Override
	public boolean withdraw(double withdraw) {
		double balance=getBalance();
		double temp=balance-withdraw;
		if(temp<overdraft)
			return false;
		else
			return true;
	}
	
	public CurrentAccount(String name,float age,double balance) {
		setAccHolder(new Person(name,age));
		setAccNum(rand.nextLong());
		setBalance(balance);
		
	}
	
}
