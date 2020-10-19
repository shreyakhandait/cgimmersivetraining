package practice.com;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfSortString {

	 public static void getSorted(int[] arr) {
		    int n=arr.length;
		    
		    int[] arr2=new int[n];
		    for(int i=0;i<n;i++) {
		      int rev=0;
		       while(arr[i] != 0) {
		         int num=arr[i]%10;
		         rev=rev*10+num;
		         arr[i]=arr[i]/10;
		        
		            }
		       arr2[i]=rev;
		    }
		    
		    System.out.println("after sorting and reversing");
		    Arrays.sort(arr2);
		    System.out.println(Arrays.toString(arr2));
		    
		  }

		  public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    try(Scanner sc=new Scanner(System.in)){
		      int n=sc.nextInt();
		      int[] arr1=new int[n];
		      
		      for(int i=0;i<n;i++) {
		        
		        arr1[i]=sc.nextInt();
		      }
		      
		      getSorted(arr1);
		    }
		    
		    
		  }

		}