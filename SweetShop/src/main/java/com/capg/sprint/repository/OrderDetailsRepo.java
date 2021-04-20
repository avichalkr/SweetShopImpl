package com.capg.sprint.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.sprint.modle.OrderDetails;

@Repository
public interface OrderDetailsRepo extends CrudRepository<OrderDetails, Integer> {
	public List<OrderDetails> findAllByCartId(int cartId);

}
