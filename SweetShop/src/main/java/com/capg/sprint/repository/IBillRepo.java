package com.capg.sprint.repository;

import org.springframework.data.repository.CrudRepository;

import com.capg.sprint.modle.Bill;

public interface IBillRepo extends CrudRepository<Bill, Integer> {

}
