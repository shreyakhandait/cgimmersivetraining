package com.cg.eis.dao;

import com.cg.eis.bean.Employee;
import com.cg.eis.exceptions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.*;

public class EmployeeServiceDaoImpl implements IEmployeeServiceDao {

	private EntityManager entityManager;
	public EmployeeServiceDaoImpl(EntityManager entityManager){
     this.entityManager=entityManager;
	}

	@Override
	public Employee save(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}

	@Override
	public Employee findById(Integer id) {
		Employee employee = entityManager.find(Employee.class,id);
		if(employee==null){
			throw new InvalidDesignationException("employee not found for id="+id);
		}
		return employee;
	}

	@Override
	public void deleteById(Integer id) {
		Employee employee=findById(id);
		entityManager.remove(employee);
	}

}









/*package com.cg.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class EmployeeServiceDaoImpl implements IEmployeeServiceDao{
	Map<Integer, Employee> store=new HashMap<>();
	private int empId;
	
	Integer empId() {
		++empId;
		return empId;
	}

	@Override
	
	public Employee save(Employee employee) {
		
		Integer id=empId();
		employee.setId(id);
	    store.put(id, employee);
		return employee;
		
	}

	@Override
	
	public Employee getDetails(int insuranceScheme) {
		Employee employee=store.get(insuranceScheme);
		return employee;
		
	}

	@Override
	public void deleteEmployee(int inSh) {
		store.remove(inSh);
		
	}

}

*/

