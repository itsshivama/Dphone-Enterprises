package com.dphone.user.service;

import java.util.List;

import com.dphone.user.bean.UserBean;

public interface UserService {
	
	public String testService();

	public UserBean addUser(UserBean userBean);

	public UserBean updateUser(UserBean userBean);

	public UserBean showUserInfo(String username);

	public Boolean deleteUser(String username);

	public List<String> getUsername();

	public Boolean isValidUser(String username);

	public Integer getPoints(String username);

	public Boolean updatePoints(String username, int refPoints);

	public UserBean getUser(String username);
}
