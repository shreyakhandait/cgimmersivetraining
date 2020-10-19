package exception.com;

public class ExceptionExample1 {
	
	public static void main(String args[]) {
		ExceptionExample1 example=new ExceptionExample1();
		ElectronicStudent student=null;
		example.display(student);
		System.out.println("after display method");
	}
	
	void display(ElectronicStudent student) {
		try {
		if(student==null) {
		InvalidArgumentException e=	new InvalidArgumentException("student is null");	
		throw e;	
		}
		System.out.println("parameter ="+student);
		int id=student.getId();
		String name=student.getName();
		System.out.println("id="+id+" name="+name);
		}
		catch(InvalidArgumentException e) {
			String msg=e.getMessage();
			System.out.println("exception caught "+msg);
		}
	
	}

}	
		/*
		 * try { System.out.println("parameter = " + student); int id = student.getId();
		 * String name = student.getName(); System.out.println("id = " + id + " name " +
		 * name ); } catch(NullPointerException e) { String msg=e.getMessage();
		 * System.out.println("exception caught, msg is " + msg);
		 * System.out.println("Student is null so didn'it display details"); }
		 */
	
	
	

