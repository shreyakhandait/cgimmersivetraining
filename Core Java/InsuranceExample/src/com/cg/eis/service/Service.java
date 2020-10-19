package com.cg.eis.service;

import om.cg.eis.bean.Employee;
import java.util.*;


interface EmployeeService{
	void employeeDetails();
	void lifeInsurance();
	void healthInsurance();
	void personalAccidentInsurance();
	void travelInsurance();
	

	
}

class Service extends Employee {

	int id;
	String name, designation, insuranceScheme;
	double salary; 
	
	Service(int idArg, String nameArg, String designationArg, String insuranceSchemeArg, double salaryArg) {
		super(idArg, nameArg, designationArg, insuranceSchemeArg, salaryArg);

		id=idArg;
		name=nameArg;
		designation = designationArg;
		insuranceScheme = insuranceSchemeArg;
		salary = salaryArg;
		
	}
	
	void employeeDetails() {
		System.out.println("Employee id : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Designation : " + designation);
		System.out.println("Applied Insurance Sceheme : " + insuranceScheme);
		System.out.println("Employee Salary : " + salary);
		
	}
	
	class lifeInsurance extends Service implements EmployeeService{
		lifeInsurance(String designationArg);
	}


