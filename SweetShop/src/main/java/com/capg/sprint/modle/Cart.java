package com.capg.sprint.modle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue
	private int cartId;
	private int cId;
	public Cart(int cId) {
		super();
		this.cId = cId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cId=" + cId + "]";
	}
	public Cart() {
		super();
	}
	
}
