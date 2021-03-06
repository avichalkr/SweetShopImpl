package com.capg.sprint.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.sprint.modle.UserLogin;
import com.capg.sprint.repository.ILoginRepository;
@Service
public class LoginServiceImpl {
	@Autowired
	private ILoginRepository loginRepo;
	
	public void addUser(UserLogin user) {
		loginRepo.save(user);
	}
	
	public Optional<UserLogin> getUserById(int id) {
		return loginRepo.findById(id);
	}
}
