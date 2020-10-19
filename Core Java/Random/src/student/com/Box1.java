package student.com;

public class Box1 {
	

	
	public static void main(String args[]) {
		int value = 10;
		Box1 box = new Box1();
		box.change(value);
		System.out.println("after change, value = " + value);
	}
	
	public void change(int value) {
		value = 20;
		System.out.println("inside change value = " + 20);
	}

}
