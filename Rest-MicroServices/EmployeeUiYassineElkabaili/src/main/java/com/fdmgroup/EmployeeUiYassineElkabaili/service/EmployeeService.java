package com.fdmgroup.EmployeeUiYassineElkabaili.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.EmployeeUiYassineElkabaili.client.EmployeeClientRestTemplate;
import com.fdmgroup.EmployeeUiYassineElkabaili.model.Employee;

@Service
public class EmployeeService {
	
	private EmployeeClientRestTemplate employeeClient;

	@Autowired
	public EmployeeService(EmployeeClientRestTemplate employeeClient) {
		super();
		this.employeeClient = employeeClient;
	}

	public List<Employee> retrieveEmployees() {
		return employeeClient.retrieveEmployees();
	}

	public Employee retrieveEmployee(long id) {
		return employeeClient.retrieveEmployee(id);
	}

	public void createEmployee(Employee emp) {
		employeeClient.createEmployee(emp);
	}
	
	public void updateEmployee(Employee emp) {
		employeeClient.updateEmployee(emp);
	}

	public void deleteEmployee(Long id) {
		employeeClient.deleteById(id);
	}
}
