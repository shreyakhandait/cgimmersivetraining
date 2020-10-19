package lab1;
import java.util.Scanner;
public class SumDiffSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the n digit number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(calculate(n));
	}
	public static int calculate(int n)
	{
		if(n>1)
		{
			int x=n*(n+1)/2;
			return ((x*(2*n+1))/3)-(x*x);
		}
		return 0;
	}

}
