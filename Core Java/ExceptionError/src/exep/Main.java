package exep;

public class Main {

	public static void main(String[] args) {
		Exception ex = new Exception();
		System.out.println(ex);
		Exception exMessage = new Exception("This is my exception");
		System.out.println(exMessage);
		Exception exBoth = new Exception("This is another exception");
		System.out.println(exBoth);
		System.out.println(exBoth.getCause());

	}

}
