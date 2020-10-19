package lab5;

public class ValidateName {
	public static void main(String[] args) {
		try{
			ValidateName name=new ValidateName();
			name.verify("","");
	}
		catch(InvalidArgumentException e) {
			System.out.println("Name should not be null");
		}
		}
	public void verify(String firstName, String lastName) throws InvalidArgumentException{
		if((firstName=="" || firstName==null) && (lastName=="" || lastName==null)) {
			InvalidArgumentException e=	new InvalidArgumentException("Name should not be null");	
			throw e;
		}
		else {
			System.out.println("name: "+firstName+lastName);
		}
	}

}
