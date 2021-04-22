package com.capg.sprint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.sprint.modle.Sweet;
import com.capg.sprint.repository.ISweetRepo;

@Service
public class SweetServiceImpl {
	@Autowired
	private ISweetRepo sweetRepo;
	
	public void addSweet(Sweet s) {
		sweetRepo.save(s);
	}
	
	public void updateSweet(Sweet s) {
		sweetRepo.save(s);
	}
	
	public void deleteSweet(int id) {
		sweetRepo.deleteById(id);
	}
	
	public Sweet getSweetById(int id) {
		return sweetRepo.findBySid(id);
		
	}

	public List<Sweet> getAllSweets() {
		return (List<Sweet>) sweetRepo.findAll();
	}
	
}
