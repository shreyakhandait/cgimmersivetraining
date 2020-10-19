package lab1;
import java.util.Scanner;
public class IncreasingOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the n digit number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(check(n));
	}
	public static boolean check(int n)
	{
		int r1,r2;
		r1=n%10;
		while(n>0)
		{
			n=n/10;
			r2=n%10;
			if(r1<r2) {
				return false;
			}
			r1=r2;
			
		}
		return true;
	}
}
