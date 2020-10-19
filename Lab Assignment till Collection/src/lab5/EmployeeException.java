package lab5;
public class EmployeeException {
	public static void main(String[] args) throws SalaryException{
		EmployeeException employeeException=new EmployeeException();
			employeeException.checkSalary(4000);
			System.out.println("Salary is greater than 3000 so acceptable");
		}
	public void checkSalary(int salary) throws SalaryException{
		if(salary<3000) {
			throw new SalaryException(salary);
		}
	}

}
