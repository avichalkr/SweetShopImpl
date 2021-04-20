package com.capg.sprint.modle;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private int cId;
	private String cName;
	private String cPhone;
	private String cAddress;
	private String cPassword;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcPhone() {
		return cPhone;
	}
	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cPhone=" + cPhone + ", cAddress=" + cAddress
				+ ", cPassword=" + cPassword + "]";
	}
	public Customer(int cId, String cName, String cPhone, String cAddress, String cPassword) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cPhone = cPhone;
		this.cAddress = cAddress;
		this.cPassword = cPassword;
	}
	public Customer() {
		super();
	}
	

}
