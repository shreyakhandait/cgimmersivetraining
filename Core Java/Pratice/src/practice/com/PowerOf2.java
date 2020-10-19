package practice.com;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkNumber(n));

	}
	public static boolean checkNumber(int n) {
	
			if (n == 0) 
	            return false; 
	          
	        while (n != 1) 
	        { 
	            if (n % 2 != 0) 
	                return true; 
	            n = n / 2; 
	        } 
	        return false; 
	     }
}
