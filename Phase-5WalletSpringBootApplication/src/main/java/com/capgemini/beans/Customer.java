package com.capgemini.beans;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_Table")
public class Customer {
	@Id
	@Column(name = "mobile")
	private String mobileNumber;

	@Column(name = "name")
	private String customerName;

	@Embedded
	private Wallet wallet;
	

	public Customer() {
		super();
	}

	public Customer(String mobileNumber, String customerName, Wallet wallet) {
		super();
		this.mobileNumber = mobileNumber;
		this.customerName = customerName;
		this.wallet = wallet;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	
}
