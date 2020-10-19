package practice.com;

import java.util.Scanner;

public class PrimeDemo {
	
	public static void main(String[] args) {
		System.out.print("Enter value: "  );
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++){
			if (isPrime(i)){
			System.out.print(i + " ");
		}
	}
	
}
	public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  

	
	

}
