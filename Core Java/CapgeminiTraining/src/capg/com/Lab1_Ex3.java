package capg.com;

import java.util.Scanner;  
public class Lab1_Ex3 {  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
//       System.out.print("Enter the first number : ");  
//       int start = s.nextInt();  
       System.out.print("Enter the number : ");  
       int num = s.nextInt();  
       System.out.println("List of prime numbers between "  + num);  
       for (int i = 0; i <= num; i++) {  
           if (isPrime(i)) {  
               System.out.println(i);  
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