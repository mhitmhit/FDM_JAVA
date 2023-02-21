package com.fdmgroup.EmployeeApiYassineElkabaili.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fdmgroup.EmployeeApiYassineElkabaili.model.Employee;
import com.fdmgroup.EmployeeApiYassineElkabaili.service.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/")
	public List<Employee> getEmployees(){
		return employeeService.retrieveEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable long id) {
		return employeeService.retrieveEmployee(id);
	}
	
	@PostMapping("/")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){
		employeeService.createEmployee(emp);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(emp.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee emp){
		employeeService.updateEmployee(id, emp);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(emp.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable long id){
		Employee deletedEmp = employeeService.deleteEmployee(id);
		return ResponseEntity.created(null).body(deletedEmp);
	}
}
