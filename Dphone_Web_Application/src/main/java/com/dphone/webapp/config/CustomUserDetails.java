package com.dphone.webapp.config;

//import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.dphone.webapp.bean.UserBean;
//
//public class CustomUserDetails implements UserDetails{
//	
//	private UserBean userBean;
	
//	public CustomUserDetails(UserBean userBean) {
//		super();
//		this.userBean = userBean;
//	}
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(userBean.getUsername());
//		return List.of(simpleGrantedAuthority);
//	}
//
//	@Override
//	public String getPassword() {
//		
//		return userBean.getPassword();
//	}
//
//	@Override
//	public String getUsername() {
//		
//		return userBean.getUsername();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//}
