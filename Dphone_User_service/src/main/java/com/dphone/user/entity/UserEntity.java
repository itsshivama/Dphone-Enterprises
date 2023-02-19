package com.dphone.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import java.util.Collection;

import com.dphone.user.external.bean.ReferralBean;

@Entity
@Table(name = "user_details")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "first_name")
	private String fname;
	
	@Column(name = "last_name")
	private String lname;
	
	private String address;
	private String mobile;
	private String email;
	private String username;
	private String password;
	
	@Column(name = "ref_points")
	private int refPoints;
	
	@Column(name = "is_customer")
	private boolean isCustomer;
	
	@Transient
	private Collection<ReferralBean> referralBeans;

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserEntity(int userId, String fname, String lname, String address, String mobile, String email,
			String username, String password, int refPoints, boolean isCustomer,
			Collection<ReferralBean> referralBeans) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.username = username;
		this.password = password;
		this.refPoints = refPoints;
		this.isCustomer = isCustomer;
		this.referralBeans = referralBeans;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRefPoints() {
		return refPoints;
	}
	public void setRefPoints(int refPoints) {
		this.refPoints = refPoints;
	}
	public boolean isCustomer() {
		return isCustomer;
	}
	public void setCustomer(boolean isCustomer) {
		this.isCustomer = isCustomer;
	}
	public Collection<ReferralBean> getReferralBeans() {
		return referralBeans;
	}
	public void setReferralBeans(Collection<ReferralBean> referralBeans) {
		this.referralBeans = referralBeans;
	}
	
	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ ", mobile=" + mobile + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", refPoints=" + refPoints + ", isCustomer=" + isCustomer + ", referralBeans=" + referralBeans + "]";
	}
}
