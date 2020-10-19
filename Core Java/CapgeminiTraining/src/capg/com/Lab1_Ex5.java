package capg.com;

import java.util.Scanner;

public class Lab1_Ex5 {

	public static void main(String[] args) {
		int num, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum from:");
		//takes an integer as input  
		i = sc.nextInt();  
		System.out.print("Sum up to: ");  
		//takes an integer as input  
		num = sc.nextInt();  
		while(i <= num%3 && i <=num%5)  
		{  
		//adding the value of i into sum variable  
		sum = sum + i;  
		//increments the value of i by 1  
		i++;  
		}  
		//prints the sum  
		System.out.println("Sum of Natural Numbers = " + sum);  
		}  
	}


