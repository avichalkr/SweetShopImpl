package com.capg.sprint.modle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class UserLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserLogin(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", password=" + password +"]";
	}
	
	
}
