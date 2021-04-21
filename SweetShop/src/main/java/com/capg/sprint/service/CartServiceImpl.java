package com.capg.sprint.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.sprint.modle.Cart;
import com.capg.sprint.repository.CartRepo;

@Service
public class CartServiceImpl {
	@Autowired
	private CartRepo cartRepo;
	
	
	public void saveCart(Cart c) {
		cartRepo.save(c);
	}
	
	public Cart findByCid(int id) {
		return cartRepo.findBycId(id);
	}
	
	public Optional<Cart> getById(int id) {
		return cartRepo.findById(id);
	}
	

}
