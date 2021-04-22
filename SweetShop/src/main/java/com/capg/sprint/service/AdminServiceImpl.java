package com.capg.sprint.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.sprint.modle.Admin;
import com.capg.sprint.modle.Sweet;
import com.capg.sprint.modle.UserLogin;
import com.capg.sprint.repository.IAdminRepository;
import com.capg.sprint.repository.ISweetRepo;


@Service
public class AdminServiceImpl {
	
	@Autowired
	private IAdminRepository adminRepo;
	
	@Autowired
	private ISweetRepo sweetRepo;
	
	@Autowired
	private LoginServiceImpl loginService;
	public void addAdmin(Admin admin) {
		adminRepo.save(admin);
		loginService.addUser(new UserLogin(admin.getId(), admin.getPassword()));
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean validateUser(UserLogin user) {
		if(user.equals(loginService.getUserById(user.getId())))
			return true;
		return false;
	}
	
	public void addSweet(Sweet s) {
		sweetRepo.save(s);
	}

	public void updateSweet(Sweet s) {
		sweetRepo.save(s);
	}

	public void deleteSweet(int id) {
		sweetRepo.deleteById(id);
	}
	
	public Optional<Sweet> getSweetById(int id) {
		return sweetRepo.findById(id);
	}
	
	public List<Sweet> getAllSweets() {
		return (List<Sweet>) sweetRepo.findAll();
	}
}
	


