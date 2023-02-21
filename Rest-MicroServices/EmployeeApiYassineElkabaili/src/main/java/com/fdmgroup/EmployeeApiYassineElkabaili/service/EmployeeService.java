package com.fdmgroup.EmployeeApiYassineElkabaili.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fdmgroup.EmployeeApiYassineElkabaili.model.Employee;
import com.fdmgroup.EmployeeApiYassineElkabaili.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepo;
	
	public EmployeeService(EmployeeRepository employeeRepo) {
		super();
		this.employeeRepo=employeeRepo;
	}
	
	public List<Employee> retrieveEmployees(){
		return employeeRepo.findAll();
	}
	
	public Employee retrieveEmployee(long id) {
		Optional<Employee> employee = employeeRepo.findById(id);
		if (!employee.isPresent()) {
			throw new EmployeeNotFoundException("No Employee found with id: " + id);
		}
		return employee.get();
	}
	
	public Employee createEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public Employee updateEmployee(long id, Employee employee) {
		Optional<Employee> conta = employeeRepo.findById(id);
		if (employee.getFirstName() != null) {
			conta.get().setFirstName(employee.getFirstName());	
		}
		if (employee.getLastName() != null) {
			conta.get().setLastName(employee.getLastName());
		}
		conta.get().setSalary(employee.getSalary());
		if (employee.getState() != null) {
			conta.get().setState(employee.getState());
		}
		if (employee.getCountry() != null) {
			conta.get().setCountry(employee.getCountry());
		}
		return employeeRepo.save(conta.get());
	}
	
	public Employee deleteEmployee(long id) {
		Optional<Employee> conta = employeeRepo.findById(id);
		employeeRepo.deleteById(id);
		return conta.get();
	}
}
