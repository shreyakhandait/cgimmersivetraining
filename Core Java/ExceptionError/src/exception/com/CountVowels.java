package exception.com;

public class CountVowels {

	public static void main(String[] args) {
		try {
			CountVowels examples = new CountVowels();
			String input = "shreya";
			String vowels = examples.findVowels(input);
			System.out.println("Argumrnt is an empty");
			
			System.out.println("vowels " + vowels );
			char firstVowel = vowels.charAt(0);
			System.out.println("first vowel found is " + firstVowel);
		}
		catch(InvalidArgumentException e) {
			System.out.println("Argument is null or empty so we caanot find vowel");
		}
		catch(NoVowelsFoundException e) {
			System.out.println("no vowel found or empty");
		}

	}
	
	String findVowels(String input) throws InvalidArgumentException, NoVowelsFoundException {
		if(input == null || input.isEmpty()) {
			throw new InvalidArgumentException("input is null or empty");
			
		}
		String vowels = " ";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			
			if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
					vowels = vowels + ch;
			}
		}
		if(vowels.isEmpty()) {
			throw new NoVowelsFoundException("No vowel found in " + input);
		}
		return vowels;
	}

}
