package demo;

import java.util.Random;
import java.util.*;
public class HandleError {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 32000; i++) {
			try {
				b = sc.nextInt();
				c = sc.nextInt();
				a = 12345/ (b/c);
			}catch(ArithmeticException e){
				System.out.println("Division by zero");
				a = 0;
			}
			System.out.println("a : " + a);
		}
	}

}
