package com.capg.sprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.sprint.modle.OrderDetails;
import com.capg.sprint.service.OrderDetailsServiceImpl;

@RestController
@RequestMapping("/order")
public class OrderController {
	
		@Autowired
		private OrderDetailsServiceImpl orderService;
		
		@PostMapping(path="/add",consumes="application/json")
		public void add(@RequestBody OrderDetails order) {
			orderService.putOrder(order);
		}
		
		@GetMapping(path = "/getall", produces = "application/json")
		public List<OrderDetails> getallOrders() {
			return orderService.getAll();

		}
		
		
		@DeleteMapping(path="/delete/{id}")
		public void deleteOrder(@PathVariable int id) {
			orderService.deleteOrder(id);
		}
		
		@GetMapping(path = "/getorderbycartid/{id}", produces = "application/json")
		public List<OrderDetails> getOrderByCartId(@PathVariable int id) {
			return orderService.findByid(id);

		}
		

}
