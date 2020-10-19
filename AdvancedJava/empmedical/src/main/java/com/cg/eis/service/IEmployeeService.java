package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {

    Employee save(Employee student);
	
	Employee findById(Integer id);
	
	void deleteById(Integer id);	
}
