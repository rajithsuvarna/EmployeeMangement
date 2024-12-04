package com.rajith.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajith.employee.dao.EmployeeRepository;
import com.rajith.employee.model.Employee;

//EmployeeService.java
@Service
public class EmployeeService {

	 @Autowired
	 private EmployeeRepository employeeRepository;
	
	 public Employee addEmployee(Employee employee) {
	     return employeeRepository.save(employee);
	 }
	
	 public void deleteEmployee(Long id) {
	     employeeRepository.deleteById(id);
	 }
	
	 public List<Employee> getEmployeeByName(String name) {
	     return employeeRepository.findByName(name);
	 }
	
	 public Employee getEmployeeWithHighestSalary() {
	     return employeeRepository.findTopByOrderBySalaryDesc();
	 }
	 
	 public List<Employee> getAllEmployees() {
	     return employeeRepository.findAll();
	 }
	 
	//New method to retrieve employee by ID
	 public Employee getEmployeeById(Long id) {
	     return employeeRepository.findById(id).orElse(null); // Return null if employee not found
	 }
}
