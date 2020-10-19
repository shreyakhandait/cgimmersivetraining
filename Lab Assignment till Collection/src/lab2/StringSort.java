package lab2;
import java.util.*;
public class StringSort {

	public static String[] sortStrings(String[] a){  
	
		int len=a.length;
		for(int i=0;i<len;i++){
		  a[i]=a[i].toUpperCase();

		}
		Arrays.sort(a);
		for(int i=0;i<len;i++){
		  if (len%2==0){
		    if (!(i< (len/2) ) )
		    a[i]=a[i].toLowerCase();
		  }
		  else{
		  if (!(i< (len/2)+1 ) )
		    a[i]=a[i].toLowerCase();
		}}

		return a;  
		}  
		public static void main(String args[]){  
		String a[]={"Tohka","Yatogami","Prakhar","Tenka","Gupta"};  

		String b[]=sortStrings(a);
		System.out.println("Sorted array: "); 
		for(int i=0;i<b.length;i++)    
		System.out.println(b[i]); 

		}

}
