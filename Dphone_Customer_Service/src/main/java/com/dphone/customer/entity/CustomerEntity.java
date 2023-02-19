package com.dphone.customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "customer")

public class CustomerEntity {
	
	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long customer_id;
	private String first_name;
	private String last_name;
	private String email;
	private long mobile;
	
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerEntity(long customer_id, String first_name, String last_name, String email, long mobile) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.mobile = mobile;
	}

	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "CustomerBean [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}

	
}
