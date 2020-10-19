package demo;

public class Demo {
	
	static int x;
	void calculator(int a) {
		x += a;
		
		}
		
	}

public class Starter{
	public static void main(String args[]) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		d1.x=0;
		d1.calculator(1);
		d2.x=0;
		d2.calculator(2);
		System.out.println(d1.x + "and" + d2.x);
	}
}


