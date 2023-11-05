package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dto.Customer;
import com.example.demo.repo.Customerrepo;
@Service
public class Customerservice {
	@Autowired
	private Customerrepo customerrepo;
	
	public Customerservice() {
		System.out.println("Customer Service Constructor");
		
	}
	
	public Customer resisterCust(Customer cust) {
		customerrepo.save(cust);
		return cust;
		
	}
	

	

}
