package lab3;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,num;
		System.out.println("Enter integers");
		String number =sc.nextLine();
		StringTokenizer string1 = new StringTokenizer(number);
		while(string1.hasMoreTokens()) {
			String temp=string1.nextToken();
			num=Integer.parseInt(temp);
			System.out.println(temp);
			sum=sum+num;
		}
		System.out.println(sum);

	}

}
