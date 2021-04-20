package com.capg.sprint.modle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bill {
	@Id
	@GeneratedValue
	private int billId;
	private int orderId;
	private int cartId;
	
	public Bill() {
		super();
	}
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", orderId=" + orderId + ", cartId=" + cartId + "]";
	}
	public Bill(int billId, int orderId, int cartId) {
		super();
		this.billId = billId;
		this.orderId = orderId;
		this.cartId = cartId;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	

}
