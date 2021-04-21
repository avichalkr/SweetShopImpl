package com.capg.sprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.sprint.modle.Customer;
import com.capg.sprint.modle.OrderDetails;
import com.capg.sprint.modle.Sweet;
import com.capg.sprint.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerService;
	
	@PostMapping(path="/add",consumes="application/json")
	public void add(@RequestBody Customer addcust) {
		customerService.addCustomer(addcust);
	}
	
	@GetMapping(path = "/searchallsweets", produces = "application/json")
	public List<Sweet> getall() {
		return customerService.getAllSweets();

	}
	
	
	@GetMapping(path = "/seecart/{id}", produces = "application/json")
	public List<OrderDetails> seeCart(@PathVariable int id) {
		return  customerService.seeCart(id);

	}
	
	@PostMapping(path="/buy",consumes="application/json")
	public void add(@RequestBody OrderDetails order) {
		customerService.OrderSweet(order);
	}
	
	@GetMapping(path = "/generatebill/{id}")
	public void seeBill(@PathVariable int id) {
		 customerService.generateBill(id);

	}
	
	

}
