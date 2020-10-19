package shreya.com;

import java.util.*;
public class StringBuffer {


	public static void getImage(String str) {
		
		StringBuffer str1=new StringBuffer(str);  
		str1.reverse();
		System.out.println(str1);
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str1 = sc.next();
			System.out.println(str1 + "|");
			getImage(str1);
		}
	}
}
