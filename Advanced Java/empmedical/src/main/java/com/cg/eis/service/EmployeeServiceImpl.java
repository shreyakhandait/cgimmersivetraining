package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.*;
import com.cg.eis.util.JpaUtil;
import com.cg.eis.util.ValidationUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EmployeeServiceImpl implements IEmployeeService {

    private IEmployeeServiceDao dao;

    private EntityManager entityManager;

    public EmployeeServiceImpl() {
        JpaUtil jpaUtil=JpaUtil.getInstance();
        entityManager = jpaUtil.getEntityManager();
        dao = new EmployeeServiceDaoImpl(entityManager);
    }

    @Override
    public Employee save(Employee employee) {
        ValidationUtil.checkArgumentNotNull(employee);
        ValidationUtil.checkSalary(employee.getSalary());
        ValidationUtil.checkDesignation(employee.getDesignation());
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        employee = dao.save(employee);
        transaction.commit();
        return employee;
    }


    @Override
    public Employee findById(Integer id) {
        Employee employee = dao.findById(id);
        return employee;
    }

    @Override
    public void deleteById(Integer id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        dao.deleteById(id);
        transaction.commit();
    }

}
