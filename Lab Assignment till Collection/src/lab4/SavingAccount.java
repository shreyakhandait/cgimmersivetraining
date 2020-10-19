package lab4;
import java.util.*;
public class SavingAccount extends Account {
	Random rand = new Random();
	private int minmBal=100;
	@Override
	public void withdraw(double withdraw) {
		double balance=getBalance();
		double temp=balance-withdraw;
		if(temp>minmBal)
			super.withdraw(withdraw);
		else
			System.out.println("Cannot withdraw as need to have minimum balance");
	}
	
	public SavingAccount(String name,float age,double balance) {
		setAccHolder(new Person(name,age));
		setAccNum(rand.nextLong());
		setBalance(balance);
		
	}
}
