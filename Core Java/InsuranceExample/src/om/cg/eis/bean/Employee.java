package om.cg.eis.bean;

public class Employee {
	
	int id;
	String name, designation, insuranceScheme;
	double salary;
	

		
	public Employee(int idArg, String nameArg, String designationArg, String insuranceSchemeArg, double salaryArg){
		this.id=idArg;
		this.name=nameArg;
		this.designation = designationArg;
		this.insuranceScheme = insuranceSchemeArg;
		this.salary=salaryArg;
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public String getInsuranceScheme() {
		return insuranceScheme;
	}



	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
