package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Customer;
import com.example.demo.service.Customerservice;

@RestController
@RequestMapping("/Customer")
public class Customercontroller {
	@Autowired
	private Customerservice customerservice;
	
	public Customercontroller() {
		System.out.println("Customercontroller constructor");
	}
	@PostMapping("/resister")
	public ResponseEntity<Customer> resCustomer(@RequestBody Customer cust){
		System.out.println("inside resCustomer method of controller");
		
		return new ResponseEntity (customerservice.resisterCust(cust),HttpStatus.ACCEPTED);
		
	}
	
//	@PutMapping("/employee")
//	   public void updateEmployee(@RequestBody Employee employee) {
//	      employeeService.saveOrUpdate(employee);
//	   }	

}
