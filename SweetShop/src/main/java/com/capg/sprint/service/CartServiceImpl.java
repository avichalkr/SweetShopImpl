package com.capg.sprint.service;

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
	

}
