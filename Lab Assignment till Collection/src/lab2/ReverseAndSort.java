package lab2;
import java.util.*; 
import java.lang.Iterable;
public class ReverseAndSort {
	public static int[] getSorted(int[] a){  

		int len=a.length;
		for(int i=0;i<len;i++){
		  a[i]=reverse(a[i]);

		}
		Arrays.sort(a);

		return a;  
		}  



		public static int reverse(int num){
		  int reverse=0;
		  while(num!=0){
		    reverse= reverse*10 + (num%10);
		    num = num/10;
		  }
		  return reverse;
		}

		public static void main(String args[]){  
		int a[]={123,24,34,33}; 
		int b[]=getSorted(a);
		System.out.println("Sorted array: "); 
		for(int i=0;i<b.length;i++)    
		System.out.println(b[i]); 

		}
	

}
