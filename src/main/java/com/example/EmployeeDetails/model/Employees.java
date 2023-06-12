package com.example.EmployeeDetails.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employees_table")
public class Employees {
	@Id
	private int id;
	private String name;
	private String role;
	private String place;
	private int pnumber;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Address address;
	
	
	

}
