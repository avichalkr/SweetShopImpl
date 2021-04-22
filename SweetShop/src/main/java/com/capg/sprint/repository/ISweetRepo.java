package com.capg.sprint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.sprint.modle.Sweet;
@Repository
public interface ISweetRepo extends CrudRepository<Sweet, Integer>{
	Sweet findBySid(int sid);

}
