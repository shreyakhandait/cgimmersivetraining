package practice.com;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		int n1=0, n2=1, n3, i;
		System.out.print("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(i=2; i<num; i++)
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
			
			
		}
		
	}

}
