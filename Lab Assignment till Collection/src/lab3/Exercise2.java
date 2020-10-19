package lab3;
import java.util.*;
public class Exercise2 {
	public static void getImage(String input) {
		StringBuilder string1 =new StringBuilder(input);
		string1.reverse();
		System.out.println(input +"|"+string1);

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string:");
		String input=sc.next();
		getImage(input);
				

	}
	

}
