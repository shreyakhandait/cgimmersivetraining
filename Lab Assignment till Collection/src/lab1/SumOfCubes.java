package lab1;
import java.util.*;
public class SumOfCubes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the n digit number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(calc(n));
	}
	public static int calc(int n)
	{
		int r,sum;
		r=sum=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum+=r*r*r;
		}
		return sum;
	}
}
