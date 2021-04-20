package com.capg.sprint.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.sprint.modle.Sweet;
import com.capg.sprint.service.SweetServiceImpl;

@RestController
@RequestMapping("/sweet")
public class SweetController {
	
	@Autowired
	private SweetServiceImpl sweetService;
	
	@PostMapping(path="/add",consumes="application/json")
	public void add(@RequestBody Sweet sweet) {
		sweetService.addSweet(sweet);
	}
	
	@GetMapping(path = "/getall", produces = "application/json")
	public List<Sweet> getallSweets() {
		return sweetService.getAllSweets();

	}
	
	@PostMapping(path="/update",consumes="application/json")
	public void updateSweet(@RequestBody Sweet sweet) {
		sweetService.updateSweet(sweet);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public void deleteSweet(@PathVariable int id) {
		sweetService.deleteSweet(id);
	}
	
	@GetMapping(path = "/getsweetbyid/{id}", produces = "application/json")
	public Optional<Sweet> getSweetById(@PathVariable int id) {
		return sweetService.getSweetById(id);

	}
	
	
	
}
