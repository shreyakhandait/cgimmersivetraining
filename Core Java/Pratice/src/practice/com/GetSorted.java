package practice.com;
import java.util.Scanner;
import java.util.Arrays;


public class GetSorted {
	
	public static void main(String[] str, int[] arr2) {
		System.out.println("Enter element: " );
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("after sorting and reversing");
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
	}

	public static void getSorted(int[] arr) {
		int n = arr.length;
		int[] arr2=new int[n];
		 for(int i=0; i<n; i++) {
			 int rev=0;
			 while(arr[i] != 0) {
				 int num=arr[i]%10;
				 rev=rev*10+num;
				 arr[i]=arr[i]/10;
			 }
			 arr2[i]=rev;
		 }
	
	}


}
