package practice.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayOfReverseString {

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
	    System.out.println("after sorting");
	    System.out.println(Arrays.toString(str1));
	  }
	  public static void main(String[] args) {
	    
	    // TODO Auto-generated method stub
		  try(Scanner sc=new Scanner(System.in)){
	      int n=sc.nextInt();
	      String[] aray=new String[n];
	      for(int i=0;i<n;i++) {
	        aray[i]=sc.next();
	      }
	      getString(aray);
	    }
	  }
	}
	

