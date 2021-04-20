package com.capg.sprint.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.sprint.modle.OrderDetails;
import com.capg.sprint.repository.OrderDetailsRepo;

@Transactional
@Service
public class OrderDetailsServiceImpl {
	
	@Autowired
	private OrderDetailsRepo orderRepo;
	
	public void putOrder(OrderDetails order) {
		orderRepo.save(order);
	}
	
	public void deleteOrder(int id) {
		orderRepo.deleteById(id);
	}
	
	public List<OrderDetails> getAll(){
		return (List<OrderDetails>) orderRepo.findAll();
	}
	
	public List<OrderDetails> findByCartId(int id){
		return orderRepo.findAllByCartId(id); 
	}
	
	
}
