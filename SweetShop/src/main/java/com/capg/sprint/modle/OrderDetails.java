package com.capg.sprint.modle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue
	private int orderId;
	
	private int cartId;
	private int sId;
	private int oQty;
	
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
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public int getoQty() {
		return oQty;
	}
	public void setOqty(int oqty) {
		oQty = oqty;
	}
	public OrderDetails(int cartId, int sId, int oqty) {
		super();
		this.cartId = cartId;
		this.sId = sId;
		oQty = oqty;
	}
	@Override
	public String toString() {
		return "OrderDetalis [orderId=" + orderId + ", cartId=" + cartId + ", sId=" + sId + ", Oqty=" + oQty + "]";
	}
	public OrderDetails() {
		super();
	}
	

}
