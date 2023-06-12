package com.example.EmployeeDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeDetails.model.Employees;
import com.example.EmployeeDetails.service.EmployeesService;
@RestController
public class EmployeesCont {
	@Autowired
	private EmployeesService employeeserv;
	@GetMapping({"/findAll"})
	public List<Employees> findAll(){
		return employeeserv.findAllEmployees();
		
	}
	@GetMapping({"/findById/{id}"})
	public Employees findById(@PathVariable("id") int id){
		return employeeserv.findById((id));
		
	}
	@PostMapping({"/saveemployeesservice"})
	public Employees saveEmployeesService(@RequestBody Employees service) {
		return employeeserv.saveEmployeesService(service);
		
	}
	
	@DeleteMapping({"/deleteById/{id}"})
	public void deleteById(@PathVariable("id") int id) {
		employeeserv.deleteById((id));

	
	}
}
