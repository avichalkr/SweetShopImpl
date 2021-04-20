package com.capg.sprint.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.sprint.modle.Cart;
import com.capg.sprint.modle.Customer;
import com.capg.sprint.repository.CartRepo;
import com.capg.sprint.repository.CustomerRepo;

@Transactional
@Service
public class CustomerServiceImpl {
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private CartRepo cartRepo;
	@Autowired
	private OrderDetailsServiceImpl orderService;
	@Autowired
	private SweetServiceImpl sweetService;
	
	public void addCustomer(Customer customer) {
		customerRepo.save(customer);
		cartRepo.save(new Cart(customer.getcId()));
	}
	
	public List<Customer> getAllCustomer(){
		return (List<Customer>) customerRepo.findAll();
	}
	
	public void buySweet() {
		
	}

}
