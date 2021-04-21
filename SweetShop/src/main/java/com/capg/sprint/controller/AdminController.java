
	package com.capg.sprint.controller;

	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.capg.sprint.modle.Admin;
import com.capg.sprint.modle.Customer;
import com.capg.sprint.modle.OrderDetails;
import com.capg.sprint.modle.Sweet;
import com.capg.sprint.service.AdminServiceImpl;
import com.capg.sprint.service.CustomerServiceImpl;
import com.capg.sprint.service.OrderDetailsServiceImpl;

	@RestController
	@RequestMapping("/admin")
	public class AdminController {
		@Autowired
		private AdminServiceImpl adminService;
		@Autowired
		private CustomerServiceImpl customerService;
		@Autowired
		private OrderDetailsServiceImpl orderService;
		
		@PostMapping(path="/addAdmin",consumes="application/json")
		public void add(@RequestBody Admin admin) {
			adminService.addAdmin(admin);
		}
		
		@PostMapping(path="/addSweet",consumes="application/json")
		public void add(@RequestBody Sweet sweet) {
			adminService.addSweet(sweet);
		}
		
		@GetMapping(path = "/allSweets", produces = "application/json")
		public List<Sweet> getallSweets() {
			return adminService.getAllSweets();
		}
		
		@PostMapping(path="/updateSweet",consumes="application/json")
		public void updateSweet(@RequestBody Sweet sweet) {
			adminService.updateSweet(sweet);
		}
		
		@DeleteMapping(path="/deleteSweet/{id}")
		public void deleteSweet(@PathVariable int id) {
			adminService.deleteSweet(id);
		}
		
		@GetMapping(path = "/getsweetbyid/{id}", produces = "application/json")
		public Optional<Sweet> getSweetById(@PathVariable int id) {
			return  adminService.getSweetById(id);
		}
		
		@GetMapping(path = "/getall", produces = "application/json")
		public List<Customer> getall() {
			return customerService.getAllCustomer();
		}
		
		@GetMapping(path = "/getorderbycartid/{id}", produces = "application/json")
		public List<OrderDetails> getOrderByCartId(@PathVariable int id) {
			return orderService.findByCartId(id);

		}
		
		@GetMapping(path = "/seeAllOrders", produces = "application/json")
		public List<OrderDetails> seeAllOrders(){
			return orderService.getAll();

		}
	}


