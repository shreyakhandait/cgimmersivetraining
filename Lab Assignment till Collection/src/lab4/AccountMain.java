package lab4;
public class AccountMain {

	public static void main(String[] args) {
		Account first=new Account("Smith",22,2000);
		Account second=new Account("Kathy",22,3000);
		first.deposit(2000);
		second.withdraw(2000);
		System.out.println("Updated balance in Smith Acc"+first.getBalance());
		System.out.println("Updated balance in Kathy Acc"+second.getBalance());
	}

}
