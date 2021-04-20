package com.capg.sprint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.sprint.modle.Cart;

@Repository
public interface CartRepo extends CrudRepository<Cart, Integer> {
	public Cart findBycId(int cId);

}
