package com.example.EmployeeDetails.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EmployeeDetails.model.Employees;

@Service
public interface EmployeesService {
	
	public List<Employees> findAllEmployees();
	public Employees findById(int id);
	public Employees saveEmployeesService(Employees service);
	public void deleteById(int id);
	

}
