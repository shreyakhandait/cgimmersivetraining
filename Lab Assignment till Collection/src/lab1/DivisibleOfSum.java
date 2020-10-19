package lab1;
import java.util.Scanner;
public class DivisibleOfSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(divisible(n));
	}
	public static int divisible(int n)
	{
		int i,sum;
		i=1;
		sum=0;
		while(i<=n)
		{
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
			i++;
		}
		return sum;
	}
	}
