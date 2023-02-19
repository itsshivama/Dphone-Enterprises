package com.dphone.referral.bean;

import java.util.Date;
import java.util.Objects;


public class ReferralBean {

	private int referral_id;
	
	private String first_name;
	
	private String last_name;
	
	private long mobile;
	
	private String email;
	
	private String referral_code;
	
	private int userId;
	
	private Date date_of_referral;
	
	private boolean status;

	public ReferralBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReferralBean(int referral_id, String first_name, String last_name, long mobile, String email,
			String referral_code, int userId, Date date_of_referral, boolean status) {
		super();
		this.referral_id = referral_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile = mobile;
		this.email = email;
		this.referral_code = referral_code;
		this.userId = userId;
		this.date_of_referral = date_of_referral;
		this.status = status;
	}

	public int getReferral_id() {
		return referral_id;
	}

	public void setReferral_id(int referral_id) {
		this.referral_id = referral_id;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReferral_code() {
		return referral_code;
	}

	public void setReferral_code(String referral_code) {
		this.referral_code = referral_code;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDate_of_referral() {
		return date_of_referral;
	}

	public void setDate_of_referral(Date date_of_referral) {
		this.date_of_referral = date_of_referral;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ReferralBean [referral_id=" + referral_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", mobile=" + mobile + ", email=" + email + ", referral_code=" + referral_code + ", userId=" + userId
				+ ", date_of_referral=" + date_of_referral + ", status=" + status + "]";
	}
}
