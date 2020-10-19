package lab2;
import java.util.*;
public class SecondSmallest {
	 int getSecondSmallest(int[] arr,int total){
		 int temp;  
		 for (int i = 0; i < total; i++)   
		         {  
		             for (int j = i + 1; j < total; j++)   
		             {  
		                 if (arr[i] > arr[j])   
		                 {  
		                     temp = arr[i];  
		                     arr[i] = arr[j];  
		                     arr[j] = temp;  
		                 }  
		             }  
		         }  
		        return arr[1];
    }
	public static void main(String[] args) {
		 int n;
	        Scanner Sc = new Scanner(System.in);
	        
	        
	        System.out.print("Enter number of elements : ");
	        n = Sc.nextInt();
	        
	     
	        int a[] = new int[n];
	     
	        System.out.println("Enter the elements in array : ");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = Sc.nextInt();
	        }
	        SecondSmallest s=new SecondSmallest();
	        int result=s.getSecondSmallest(a,n);
	        System.out.println(result );
	        

	}

}
