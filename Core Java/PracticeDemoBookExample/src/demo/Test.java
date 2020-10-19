package demo;

public class Test {
	public static void main(String args[]) 
    {
        try 
        {
            int a = args.length;
            int b = 10 / a;
            System.out.print(a);
            try 
            {
                 if (a == 1)
                     a = a / a - a;
                 
            catch (ArithmeticException e) 
            {
                System.out.println("TypeB");
            }
            }

}


	public void printPattern() {
		// TODO Auto-generated method stub
		
	}