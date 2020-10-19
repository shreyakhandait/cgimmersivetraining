package lab5;

public class PersonAge {

	public static void main(String[] args) {
		try{
			PersonAge age=new PersonAge();
			age.verify(14);
			System.out.println("Age acceptable");
	}
		catch(InvalidArgumentException e) {
			System.out.println("Age should be greater than 15");
		}
		}
	public void verify(int age) throws InvalidArgumentException{
		if(age<=15) {
			InvalidArgumentException e=	new InvalidArgumentException("Age should be greater than 15");	
			throw e;
		}
	}
	

}
