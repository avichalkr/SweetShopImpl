package com.capg.sprint.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.sprint.modle.Admin;

@Repository
public interface IAdminRepository extends CrudRepository<Admin,Integer> {
	
}