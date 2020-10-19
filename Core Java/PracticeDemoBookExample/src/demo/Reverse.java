package demo;

public class Reverse {

	public static void main(String[] args) {
		String reversedString = reverse(null);
		System.out.println(reversedString);

	}
	private static String reverse(String s) {
		String reversedString;
		
			try {
				if(s == null) {
				throw new Exception("The parameter can be null");
				
			}
				StringBuilder sb = new StringBuilder(s);
				System.out.printf("Reverse string %s ...\n", s);
				reversedString = sb.reverse().toString();
			
			}catch(Exception e){
				reversedString = null;
				e.printStackTrace();
			}
		
		
		return reversedString;
	}

}
