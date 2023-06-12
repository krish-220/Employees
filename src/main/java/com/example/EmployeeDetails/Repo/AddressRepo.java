package com.example.EmployeeDetails.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeDetails.model.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {

}
