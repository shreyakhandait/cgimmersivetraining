package demo;

public class Test1 {
	public void printPattern() {
		for(int i=0; i<5; i++) {
			System.out.println(" * ");
		}
	}
	
	public void printPatter(char symbol) {
		for(int i=0; i<5; i++) {
			System.out.println(symbol);
		}
	}
}

class Main{
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.printPattern();
		System.out.println("\n");
		Object p1;
		((Object) p1).printPattern('#');

}
}