package com.capg.sprint.modle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue
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
	public Admin(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", password=" + password + "]";
	}
	public Admin() {
		super();
	}
}
