package com.fdmgroup.EmployeeUiYassineElkabaili.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fdmgroup.EmployeeUiYassineElkabaili.model.Employee;

@Service
public class EmployeeClientRestTemplate {
	
	private WebClient webClient;

	@Autowired
	public EmployeeClientRestTemplate(WebClient webClient) {
		super();
		this.webClient = webClient;
	}

	public List<Employee> retrieveEmployees() {
		return webClient.get()
				.retrieve()
				.bodyToFlux(Employee.class)
				.collectList()
				.block()
				;
	}

	public Employee retrieveEmployee(long id) {
		return webClient.get()
				.uri( builder -> builder.path("/{id}").build(id) )
				.retrieve()
				.bodyToMono(Employee.class)
				.block()
				;
	}

	public Object createEmployee(Employee emp) {
		return webClient.post()
				.bodyValue(emp)
				.retrieve()
				.bodyToMono(Employee.class)
				.block()
				;
	}

	public void updateEmployee(Employee emp) {
			webClient.put()
				.bodyValue(emp)
				.retrieve()
				.bodyToMono(Employee.class)
				.log()
				.block()
				;
		
	}

	public void deleteById(Long id) {
			webClient.delete()
				.uri(builder -> builder.path("/{id}").build(id))
				.retrieve()
				.bodyToMono(Employee.class)
				.block()
				;
		
	}
	
	

}
