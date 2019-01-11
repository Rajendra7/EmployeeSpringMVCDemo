package com.cg.app.employee.service;

import org.springframework.stereotype.Service;

import com.cg.app.employee.pojo.Employee;

@Service
public interface EmployeeService {

	void addNewEmployee(Employee employee);

}