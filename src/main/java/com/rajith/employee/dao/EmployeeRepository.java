package com.rajith.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajith.employee.model.Employee;

//EmployeeRepository.java
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

 List<Employee> findByName(String name);

 Employee findTopByOrderBySalaryDesc();
}
