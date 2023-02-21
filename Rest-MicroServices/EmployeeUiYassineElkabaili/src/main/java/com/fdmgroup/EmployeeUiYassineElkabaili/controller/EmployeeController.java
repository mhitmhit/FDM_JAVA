package com.fdmgroup.EmployeeUiYassineElkabaili.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.EmployeeUiYassineElkabaili.model.Employee;
import com.fdmgroup.EmployeeUiYassineElkabaili.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/")
	public String getEmployees(Model model) {
		List<Employee> employees = employeeService.retrieveEmployees();
		model.addAttribute("employees", employees);
		return "index";
	}
	
	@GetMapping("/view/{id}")
	public String viewEmployeeDetails(@PathVariable String id, Model model) {
		Employee emp = employeeService.retrieveEmployee(Long.valueOf(id));
		model.addAttribute("employee", emp);
		return "employee-details";
	}
	
	@GetMapping("/createEmployee")
	public String toCreateEmployeeForm() {
		return "create-employee";
	}
	
	@PostMapping("/createEmployee")
	public String createEmployee(Employee emp) {
		employeeService.createEmployee(emp);
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}")
	public String toUpdateEmployee(Model model, @PathVariable String id) {
		Employee rEmp = employeeService.retrieveEmployee(Long.valueOf(id));
		model.addAttribute("employee", rEmp);
		return "update-employee";
	}
	
	@PostMapping("/updateEmployee")
	public String updateEmployee(Employee emp) {
		employeeService.updateEmployee(emp);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(Long.valueOf(id));
		return "redirect:/";
	}
}
