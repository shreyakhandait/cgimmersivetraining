package lab2;
import java.util.*; 

public class RemoveDuplicates {
	
		  public static int[] modifyArray(int[] arr){
		    Arrays.sort(arr);
		    int arr2[]=new int[arr.length];
		    int j=0,i=0;
		    for (i=0;i<arr.length-1 ;i++ ){
		      if (arr[i]!=arr[i+1]){
		        arr2[j++]=arr[i];
		        
		      }
		        
		      
		    }
		    
		    
		    arr2[j]=arr[i];
		    int arr3[]=new int[j+1];
		    for (i=0; i<=j; i++) 
		            arr3[i] = arr2[i];
		    return arr3;
		  }
		  
		  
		  
		    public static void main(String[] args) {
		        int arr[]={12,12,23,23,44,54,54};
		        int arr2[]=modifyArray(arr);
		        for (int i=(arr2.length-1);i>=0;i-- ){
		          System.out.println(arr2[i]);
		        } 
		    }
		
}
