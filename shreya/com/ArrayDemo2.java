package shreya.com;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayDemo2 {
	public static void getString(String[] str) {
	    
	    int n=str.length;
	    String[] str1=new String[n];
	    Arrays.sort(str);
	    if(n%2==0) {
	      for(int i=0;i<n/2;i++) {
	        str1[i]=str[i].toUpperCase();
	      }
	      for(int i=n/2;i<n;i++) {
	        str1[i]=str[i].toLowerCase();
	      }
	    }
	    else{
	      for(int i=0;i<n/2+1;i++) {
	        str1[i]=str[i].toUpperCase();
	      }
	      for(int i=n/2+1;i<n;i++) {
	        str1[i]=str[i].toLowerCase();
	      }
	    }
	    System.out.print("After sorting: ");
	    System.out.println(Arrays.toString(str1));
	  }
	  public static void main(String[] args) {
		System.out.print("Enter number of Elements to be inserted: ");
	    try(Scanner sc=new Scanner(System.in)){
	      int n=sc.nextInt();
	      String[] aray=new String[n];
	      System.out.print("Enter Elements: ");
	      for(int i=0;i<n;i++) {
	        aray[i]=sc.next();
	      }
	      getString(aray);
	    }
	  }
}
