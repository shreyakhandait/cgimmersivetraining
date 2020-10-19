package com.cg.eis.dao;

import com.cg.eis.bean.Employee;

public interface IEmployeeServiceDao {
	
	Employee save(Employee student);
	
	Employee findById(Integer id);
	
	void deleteById(Integer id);	

}
