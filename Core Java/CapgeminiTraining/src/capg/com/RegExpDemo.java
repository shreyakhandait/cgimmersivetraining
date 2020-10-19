package capg.com;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExpDemo {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		str = sc.next();
		//Pattern pattern = Pattern.compile("^[A-Z][a-z]{4,}$");
		boolean match = Pattern.matches("^[A-Z][a-z]{4,10}$", str);
//		Matcher.mat=Pattern.matcher(str);
		if(match) {
			System.out.println("Valid name");
		}
		else {
			System.out.println("invalid name ..");
		}
		System.out.println("Enter mobile no:");
		String mobno = sc.next();
		match=Pattern.matches("[9][0-9]{9}", mobno);
		if(match)
			System.out.println("Valid number");
		else
			System.out.println("invalid number");
	
		System.out.println("Enter Pincode");
		String pin=sc.next();
		Pattern pattern = Pattern.compile("[0-9]{4}");
		boolean match1=pattern.matcher(pin).matches();
		if(match)
			System.out.println("valid pin no");
		else
			System.out.println("invalid ...");
	
	}
	
	
	

}
