package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.service.IEmployeeService;

public class EmployeeUi {
	private IEmployeeService service = new EmployeeServiceImpl();

	public void runUi() {
		Employee employee = add("Navin", 20000L, "System Associate","Scheme C");
		int id1 = employee.getId();
		Employee employee2 = add("John", 30000L, "Programmer","Scheme B");
		int id2 = employee2.getId();
		Employee employee3 = add("Smith", 40000L, "Manager","Scheme A");
		int id3 = employee3.getId();
		Employee employee4 = add("Jimmy", 5000L, "Clerk","No Scheme");
		int id4 = employee4.getId();
		displayUserById(id1);
		displayUserById(id2);
		

	}

	public Employee add(String name, Long salary, String designation, String insuranceScheme) {
		Employee employee = new Employee(name, salary, designation, insuranceScheme);
		employee = service.save(employee);
		System.out.println("employee added with details, name=" + employee.getName() + " salary=" + employee.getSalary() + " designation="
				+ employee.getDesignation() + " insuranceScheme = " + employee.getInsuranceScheme());
		return employee;
	}

	public void displayUserById(Integer id) {
		Employee employee = service.findById(id);
		System.out.println("employee added with details, name=" + employee.getName() + " salary=" + employee.getSalary() + " designation="
				+ employee.getDesignation() +  " insuranceScheme = " + employee.getInsuranceScheme());

	}

	public void removeEmployeeById(Integer id) {
		service.deleteById(id);
	}
}
