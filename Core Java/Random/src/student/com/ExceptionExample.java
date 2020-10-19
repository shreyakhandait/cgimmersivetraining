package student.com;
public class ExceptionExample {

	public static void main(String[] args) {
		ExceptionExample example = new ExceptionExample();
		ElectronicStudent student = null;
		example.display(student);
		System.out.println("after display method");
		}
	
	void display(ElectronicStudent student) {
		try {
		System.out.println("parameter = " + student);
		int id = student.getId();
		String name = student.getName();
		System.out.println("id = " + id + " name " + name );
		}
		catch(NullPointerException e) {
			String msg=e.getMessage();
			System.out.println("exception caught, msg is " + msg);
		System.out.println("Student is null so didn'it display details");
		}
	}

}
