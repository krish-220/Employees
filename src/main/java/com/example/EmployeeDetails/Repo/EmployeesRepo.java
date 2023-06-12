package com.example.EmployeeDetails.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeDetails.model.Employees;

public interface EmployeesRepo  extends JpaRepository<Employees, Integer>{

}
