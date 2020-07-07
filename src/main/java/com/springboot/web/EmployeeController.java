package com.springboot.web;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

    @GetMapping("/listEmployees/{name}")
    public Employee listUsingHQL(@PathVariable("name") String empName) {

    	Employee employee = employeeRepository.findByName(empName);
    	return employee;
    	
	}
    @GetMapping("/hibernateCache")
    public void hibernateCache() {
    
    	Optional<Employee> emp1=employeeRepository.findById(10L);
    	System.out.println(emp1.get().getName());
    	Optional<Employee> emp2=employeeRepository.findById(10L);
    	System.out.println(emp2.get().getId());
    
    }
}
