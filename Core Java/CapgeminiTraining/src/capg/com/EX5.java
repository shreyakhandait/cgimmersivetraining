package capg.com;

public class EX5 {
	public static void words(String str) {
		String s1="hello hello how";
        String s[]=s1.split(" ");
        System.out.print(s.length);
	}
	public static void line(String str1) {
		String s1="hello. hello. how";
        String s[]=s1.split(". ");
        System.out.print(s.length);
	}
	public static void text(String str2) {
		 String s1="hello how"; 
	        int count = 0;
	    for (int i=0; i<s1.length(); i++) {
	        if (s1.charAt(i) != ' ') {
	             ++count;
	         }
	    }
	    System.out.println(count);
	}
	

}




