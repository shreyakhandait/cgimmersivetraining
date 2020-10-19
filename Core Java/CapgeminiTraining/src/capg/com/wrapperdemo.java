package capg.com;

public class wrapperdemo {
public static void main() {
	/*
	 * int num=10; //Integer obj = new Integer(num); Integer obj = num; //auto
	 * boxing int x = obj.intValue(); //int x = obj; //auto unboxing
	 */
	
	
	String str1 = "Java";
	Object obj = str1;
	int len = ((String) obj).length();
}
}
