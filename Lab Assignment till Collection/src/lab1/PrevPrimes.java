package lab1;
import java.util.*;
public class PrevPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=1;
        int n=sc.nextInt();
        while(i<n)  
        {
        	boolean bool=prime(i);
        	if(bool)
        		System.out.print(i+" ");
        	i++;
        }
        sc.close();
	}
	public static boolean prime(int i)
	{
		if(i==1)
			return false;
		for(int m=2;m<=i/2;m++)
		{
			if(i%m==0)
				return false;
		}
		return true;
	}

}
