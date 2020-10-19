package lab1;
import java.util.Scanner;
public class PowerOf2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the n digit number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(check(n));
	}
	public static boolean check(int n)
	{
		while(n!=1)
		{
			if(n%2==0) {
				n=n/2;
			}
			else {
				return false;
			}
			}
		return true;
	}
}
