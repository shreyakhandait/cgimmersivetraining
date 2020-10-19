package generic.com;

public class MainStorage1 {
	public static void main(String args[]) {
		Integer value = 20;
		Storage1<Integer> storage = new Storage1<Integer>();
		storage.setValue(value);
		System.out.println("added integer value to storage");
		Integer fetched = storage.getValue();

	}
}
