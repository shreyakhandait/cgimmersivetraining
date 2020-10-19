package student.com;

public class StudentMain {
	private Student students[] = new Student[4];// field of StudentMain object

	public static void main(String args[]) {
		StudentMain mainObj = new StudentMain();
		mainObj.execute();
	}

	public void execute() {
		CurrentAccount eceStudent1=new CurrentAccount(1,"abhishek","multimeter");
		CurrentAccount eceStudent2=new CurrentAccount(2,"aniket","multimeter");
		ComputerScience csStudent1=new ComputerScience(3,"saiteja","dell","java");
		ComputerScience csStudent2=new ComputerScience(4,"saksham","acer","python");
 
		students[0]=eceStudent1;
		students[1]=eceStudent2;
		students[2]=csStudent1;
		students[3]=csStudent2;
		displayStudents();

		// toString() method to convert object to string, mostly used for debugging to check what object contains
		String eceStudent1String=eceStudent1.toString();
        String cseStudent1String=csStudent1.toString();
        System.out.println(eceStudent1String);
        System.out.println(cseStudent1String);
		ComputerScience csStudent4=new ComputerScience(4,"saiteja","dell","java");
		ComputerScience csStudent5=new ComputerScience(4,"saiteja","dell","java");
        boolean identity= csStudent4==csStudent5;// return false
		boolean isEqual=csStudent4.equals(csStudent5);
        System.out.println("identity="+identity+" equality="+isEqual);
	}

	public void displayStudents() {
		for (int i=0;i<students.length;i++) {
			Student student=students[i];
			int id = student.getId();
			String name = student.getName();
			System.out.println("student detail is " + id + " " + name);
			boolean isEce=student instanceof CurrentAccount;
			if(isEce) {
				CurrentAccount eceStudent=(CurrentAccount)student;
			    String device= eceStudent.getDevice();
			    System.out.println(" device available "+device);
			}
			boolean isCse=student instanceof ComputerScience;
			if(isCse) {
				ComputerScience cseStudent=(ComputerScience)student;
				String language=cseStudent.getLanguage();
				String laptop=cseStudent.getLaptop();
				System.out.println("laptop is "+laptop+" language is "+language);
			}
		}
	}

}