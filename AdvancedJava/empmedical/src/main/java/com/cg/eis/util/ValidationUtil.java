package com.cg.eis.util;

import com.cg.eis.exceptions.*;

public class ValidationUtil {

	public static void checkArgumentNotNull(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("arg can't be null");
		}
	}

	public static void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidEmployeeNameException("name is not valid");
		}

	}

	public static void checkId(Integer id) {
		if (id == null) {
			throw new InvalidAgeException("id is not valid");
		}
		
	}
	
	public static void checkSalary(Long salary) {
		if(salary == null) {
			throw new InvalidSalaryException("invalid salary");
		}
	}

	public static void checkDesignation(String designation) {
		if(designation == null) {
			throw new InvalidDesignationException("invalid designation");
		}
		
	}
	
	public static void checkInsuranceScheme(String insuranceScheme) {
		if(insuranceScheme == null) {
			throw new InvalidinsuranceSchemeException("invalid insuranceScheme");
		}
		
	}
	

}
