package com.rajith.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajith.employee.model.Employee;
import com.rajith.employee.service.EmployeeService;

//EmployeeController.java
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

	@Autowired
 	 EmployeeService employeeService;

	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	}

	@GetMapping("/name/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name) {
		return employeeService.getEmployeeByName(name);
	}

	@GetMapping("/highest-salary")
	public Employee getEmployeeWithHighestSalary() {
		return employeeService.getEmployeeWithHighestSalary();
	}
	
	 @GetMapping
	 public List<Employee> getAllEmployees() {
	    return employeeService.getAllEmployees();
	 }
	 
	 @GetMapping("/{id}") // New endpoint to get employee by ID
	 public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
	     Employee employee = employeeService.getEmployeeById(id);
	     if (employee == null) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // Return 404 if employee not found
	     }
	     return ResponseEntity.ok(employee); // Return 200 with employee data
	 }
	 
	 
}
