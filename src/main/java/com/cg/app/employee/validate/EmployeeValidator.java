package com.cg.app.employee.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cg.app.employee.pojo.Employee;
@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee employee=(Employee) target;
		if(employee.getEmpName().length() < 2) {
			errors.rejectValue("empName", "empname.length", "Employee Name must contain 2 or more characters");
		}
		if(employee.getSalary()<1000) {
			errors.rejectValue("salary", "salary", "Salary must be greater then 100000");
		}
		
	}

}
