package lab1;
public class fibonacci {
	public int fibo(int n)
	{
		int i=2;
		if(n==1 || n==2){
			return 1;
		}
		else
		{
			int num1,num2,tempNum=0;
			num1=num2=1;
			while(i<n)
			{
				tempNum=num1+num2;
				num1=num2;
				num2=tempNum;
				i++;
			}
			return tempNum;
		}
	}
	public static void main(String[] args) {
		
		fibonacci obj=new fibonacci();
		System.out.println(obj.fibo(5));
	}

}
