package com.capg.sprint.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.sprint.modle.Cart;
import com.capg.sprint.modle.Customer;
import com.capg.sprint.modle.OrderDetails;
import com.capg.sprint.modle.Sweet;
import com.capg.sprint.modle.UserLogin;
import com.capg.sprint.repository.ICustomerRepo;

@Transactional
@Service
public class CustomerServiceImpl {
	@Autowired
	private ICustomerRepo customerRepo;
	@Autowired
	private CartServiceImpl cartService;
	@Autowired
	private OrderDetailsServiceImpl orderService;
	@Autowired
	private SweetServiceImpl sweetService;
	@Autowired
	private LoginServiceImpl loginService;
	
	public void addCustomer(Customer customer) {
		customerRepo.save(customer);
		cartService.saveCart(new Cart(customer.getcId()));
		loginService.addUser(new UserLogin(customer.getcId(),customer.getcPassword()));
	}
	
	public List<Customer> getAllCustomer(){
		return (List<Customer>) customerRepo.findAll();
	}
	
//	public void buySweet(int customerId,int sweetId,int quantity) {
//		orderService.putOrder(new OrderDetails(cartService.findByCid(customerId).getCartId(), sweetId, quantity));
//	}
	
	public List<Sweet> getAllSweets(){
		return sweetService.getAllSweets();
	}
	
	public List<OrderDetails> seeCart(int custId){
		return orderService.findByCartId(cartService.findByCid(custId).getCartId());
	}
	
	public void OrderSweet(OrderDetails order) {
		orderService.putOrder(order);
	}
	
	public int generateBill(int custId) {
		List<OrderDetails> od=orderService.findByCartId(cartService.findByCid(custId).getCartId());
		int bill=0;
		for(OrderDetails orderit:od) {
			System.out.println(orderit.getsId()+" "+orderit.getoQty());
			int sweetId=orderit.getsId();
			int sweetQty=orderit.getoQty();
			Sweet tempSweet=sweetService.getSweetById(sweetId);
			double price= tempSweet.getsPrice();
//			System.out.println(price);
			bill+=(price*sweetQty);	
		}
		System.out.println(bill);
		
		
		return bill;
		
	}
	
	
	

}
