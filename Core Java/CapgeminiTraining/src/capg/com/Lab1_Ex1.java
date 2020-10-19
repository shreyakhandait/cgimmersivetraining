package capg.com;

import java.util.Scanner;

public class Lab1_Ex1 {
	
	public static int sumofSeries(int n)
	{
		int sum = 0;
		for (int i = 0; i<=n; i++)
			sum = i*i*i;
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	System.out.printf("Enter element:");
	int sumofSeries = scanner.nextInt();
	System.out.println("Cube is" + sumofSeries(sumofSeries));

	}

}
