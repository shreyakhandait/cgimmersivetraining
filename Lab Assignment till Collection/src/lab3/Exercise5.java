package lab3;
import java.util.*;
public class Exercise5 {
	public static void words(String input) {
		String[] words = input.split("\\s+");
	    System.out.println(words.length);
       
	}
	public static void line(String input) {
		  int count = 0;
		    for (int i=0; i<input.length(); i++) { 
		        if (input.charAt(i) == '.') { 
		             ++count;
		         }
		    }
		    System.out.println(count);
	}
	public static void text(String input) {
		 
	        int count = 0;
	    for (int i=0; i<input.length(); i++) { 
	        if (input.charAt(i) != ' ') {
	             ++count;
	         }
	    }
	    System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("word count");
		words(input);
		System.out.println("line count");
		line(input);
		System.out.println("text count");
		text(input);
		
	}

}
