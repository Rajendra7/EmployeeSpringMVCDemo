package com.cg.app.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.app.employee.pojo.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private JdbcTemplate template;
	
	/* (non-Javadoc)
	 * @see com.cg.app.employee.dao.EmployeeDAO#addNewEmployee(com.cg.app.employee.controller.Employee)
	 */
	@Override
	public void addNewEmployee(Employee employee) {
		template.update("INSERT INTO employee VALUES(?,?,?)",new Object[] {employee.getEmpId(),employee.getEmpName(),employee.getSalary()});
	}

}
