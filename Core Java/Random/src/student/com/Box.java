package student.com;

public class Box {

	public static void main(String[] args) {
		Student s1 = new Student(1, " John ");
		Student s2 = new Student(2, " Harry ");
		System.out.println("after objects createion");
		String name = s1.getName(); //object reference by s2 is for deallocation
		System.out.println("Name = " + name);

	}

}

//s2