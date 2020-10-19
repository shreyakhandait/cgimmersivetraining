package practice.com;

import java.util.*;
public class CheckNo {

	public static void main(String[] args) {
		int n;
	       boolean flag = false;
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter a number : ");
	       n = sc.nextInt();
	       int num = n % 10;
	       n = n/10;
	       while(n>0){
	           if(num <= n % 10){
	               flag = true;
	               break;
	           }

	           num = n % 10;
	           n = n/10;
	       }
	       if(flag){
	           System.out.println(+ n + " Digits are not in increasing order.");
	       }else{
	           System.out.println(+ n + "Digits are in increasing order.");
	       }
	    }
	

	}


