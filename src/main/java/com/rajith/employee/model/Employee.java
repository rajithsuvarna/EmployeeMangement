package com.rajith.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//Employee.java
@Entity
@Data
public class Employee {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;
 
 private String phone;
 
 private String email;
 
 private String address;
 
 private Double salary;
 
 private String bloodgroup;
 
 private String designation;
 
 private String dateofjoin;
 
}

