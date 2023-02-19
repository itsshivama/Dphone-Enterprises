package com.dphone.user.bean;

import java.util.Collection;

import com.dphone.user.external.bean.ReferralBean;

public class UserBean {
	
	private int userId;
	private String fname;
	private String lname;
	private String address;
	private String mobile;
	private String email;
	private String username;
	private String password;
	private int refPoints;
	private boolean isCustomer;
	private Collection<ReferralBean> referralBeans;
	
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBean(int userId, String fname, String lname, String address, String mobile, String email,
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
		return "Username: " + username +
				"\nName: " + fname + " " + lname +
				"\nMobile: " + mobile +
				"\nEmail: " + email +
				"\nAddress: " + address +
				"\nPoints: " + refPoints +
				"\nCustomer: " + (isCustomer ? "Yes" : "No");
	}
}
