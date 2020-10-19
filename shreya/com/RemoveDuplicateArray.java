package shreya.com;

import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicateArray {
	public static void modifyArray(int[] arr) {
	    int n=arr.length;
	    int[] arr1=new int[n];
	    for(int i=0;i<n;i++) {
	      int count=1;
	      for(int j=0;j<n;j++) {
	        if(arr[i]==arr[j]) {
	          count++;
	        }
	      }
	      if(count==1){
	        arr1[i]=arr[i];
	      }
	    }
	    System.out.print(Arrays.toString(arr1));
	  }
	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    try(Scanner sc=new Scanner(System.in)){
	      int n=sc.nextInt();
	      int[] arr1=new int[n];
	      for(int i=0;i<n;i++) {
	        arr1[i]=sc.nextInt();
	      }
	      modifyArray(arr1);
	    }
	  }
	}
	
      

