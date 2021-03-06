package com.capg.sprint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.sprint.modle.Customer;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

}
