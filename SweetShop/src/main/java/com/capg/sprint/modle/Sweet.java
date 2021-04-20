package com.capg.sprint.modle;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sweet {
	@Id
	private int sId;
	private String sName;
	private double sPrice;
	private int sQty;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getsPrice() {
		return sPrice;
	}
	public void setsPrice(double sPrice) {
		this.sPrice = sPrice;
	}
	public int getsQty() {
		return sQty;
	}
	public void setsQty(int sQty) {
		this.sQty = sQty;
	}
	@Override
	public String toString() {
		return "Sweets [sId=" + sId + ", sName=" + sName + ", sPrice=" + sPrice + ", sQty=" + sQty + "]";
	}
	public Sweet(int sId, String sName, double sPrice, int sQty) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sPrice = sPrice;
		this.sQty = sQty;
	}
	public Sweet() {
		super();
	}
	

}
