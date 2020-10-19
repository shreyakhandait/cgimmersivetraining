package practice.com;

import java.util.Scanner;

public class SumBetweenTwoNo {

	public static void main(String[] args) {
		System.out.print("Enter number: " );
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		System.out.print(calculateSum(N));

	}
	
	public static int calculateSum(int N) {
		int X = 3;
		int Y = 5;
		int S1 = ((N/X)/2) * (2 * X + (N/X - 1) * X);   //Sn = (n/2) * {2*a + (n-1)*d}
		int S2 = ((N/Y)/2) * (2 * Y + (N/Y - 1) * Y);
		int S3 = ((N/(X*Y))/2) * (2 * Y + (N/(X*Y) - 1) * (X*Y));
		int SUM = S1 + S2 - S3;
		return SUM;
	}
	
}
