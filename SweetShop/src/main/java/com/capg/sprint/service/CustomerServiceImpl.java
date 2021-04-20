package com.capg.sprint.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.sprint.modle.Cart;
import com.capg.sprint.modle.Customer;
import com.capg.sprint.modle.OrderDetails;
import com.capg.sprint.modle.Sweet;
import com.capg.sprint.repository.CustomerRepo;

@Transactional
@Service
public class CustomerServiceImpl {
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private CartServiceImpl cartService;
	@Autowired
	private OrderDetailsServiceImpl orderService;
	@Autowired
	private SweetServiceImpl sweetService;
	
	public void addCustomer(Customer customer) {
		customerRepo.save(customer);
		cartService.saveCart(new Cart(customer.getcId()));
	}
	
	public List<Customer> getAllCustomer(){
		return (List<Customer>) customerRepo.findAll();
	}
	
	public void buySweet(int customerId,int sweetId,int quantity) {
		orderService.putOrder(new OrderDetails(cartService.findByCid(customerId).getCartId(), sweetId, quantity));
	}
	
	public List<Sweet> getAllSweets(){
		return sweetService.getAllSweets();
	}
	
	public List<OrderDetails> seeCart(int custId){
		return orderService.findByCartId(cartService.findByCid(custId).getCartId());
	}
	
	

}
