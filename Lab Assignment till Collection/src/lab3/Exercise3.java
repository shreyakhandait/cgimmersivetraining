package lab3;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input = sc.next();
		Exercise3 obj =new Exercise3();
		String result = obj.alterString(input);
		System.out.println(result);
	}
	String alterString(String input) {
		StringBuilder builder1=new StringBuilder(input);
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				int nextCharCode=ch+1;
				char nextChar=(char)nextCharCode;
				builder1.setCharAt(index,nextChar);
			}
		}
		String result=builder1.toString();
		return result;
	}

}
