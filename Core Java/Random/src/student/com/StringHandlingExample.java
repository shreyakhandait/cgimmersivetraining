package student.com;

public class StringHandlingExample {

	public static void main(String[] args) {
		StringHandlingExample example = new StringHandlingExample();
		String result=example.converUsingArray("zebra");
		System.out.println(result);
		
		

	}
	
	String converUsingArray(String input) {
		char characters[] = input.toCharArray();
		for(int index=0; index<characters.length;index++) {
			char ch = characters[index];
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				if(ch=='z') {
					char next = 'a';
					characters[index]= next;
					
				}else {
					int currentCharCode = ch;
					int nextCharCode = currentCharCode+1;
					System.out.println("Current char code = " + currentCharCode + "Char = " + ch);
					char nextChar=(char)nextCharCode;
					characters[index]=nextChar;
				}
				
			}
			
		}
		return input.toString();
	}
	


}
