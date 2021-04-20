package com.capg.sprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.sprint.modle.Customer;
import com.capg.sprint.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	@PostMapping(path="/add",consumes="application/json")
	public void add(@RequestBody Customer addcust) {
		customerService.addCustomer(addcust);
	}
	
	@GetMapping(path = "/getall", produces = "application/json")
	public List<Customer> getall() {
		return customerService.getAllCustomer();

	}


}
