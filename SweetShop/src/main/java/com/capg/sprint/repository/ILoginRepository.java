package com.capg.sprint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.sprint.modle.UserLogin;
@Repository
public interface ILoginRepository extends CrudRepository<UserLogin,Integer> {


}
