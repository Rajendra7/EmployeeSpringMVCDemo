package com.cg.app.employee.dao;

import org.springframework.stereotype.Repository;

import com.cg.app.employee.pojo.Employee;

@Repository
public interface EmployeeDAO {

	void addNewEmployee(Employee employee);

}