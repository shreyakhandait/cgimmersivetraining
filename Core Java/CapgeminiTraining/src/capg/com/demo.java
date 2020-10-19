package capg.com;

public class demo {

	public static void main(String[] args) {
		String[] listOfNames = {
				"Ravi", "Soma", "null", "Colin", "Harry", "Smith"
		};
		
		for(int i = 0; i< listOfNames.length; i++)
		{
			if (listOfNames[i].equals("null"))
				continue;
			System.out.println(listOfNames[i]);
		}

	}

}
