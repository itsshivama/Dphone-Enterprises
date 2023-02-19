package com.dphone.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dphone.user.bean.UserBean;
import com.dphone.user.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDaoImpl userDaoImpl;


	@Override
	public UserBean addUser(UserBean userBean) {
		// TODO Auto-generated method stub
		UserBean userBean2 = userDaoImpl.addUser(userBean);
		return userBean2;
	}

	@Override
	public UserBean updateUser(UserBean userBean) {
		// TODO Auto-generated method stub
		UserBean updatedUserBean = userDaoImpl.updateUser(userBean);
		return updatedUserBean;
	}

	@Override
	public UserBean showUserInfo(String username) {
		// TODO Auto-generated method stub
		UserBean userBean = userDaoImpl.showUserInfo(username);
		return userBean;
	}

	@Override
	public Boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		Boolean deleteStatus = userDaoImpl.deleteUser(username);
		return deleteStatus;
	}
	
	@Override
	public Boolean isValidUser(String username) {
		// TODO Auto-generated method stub
		Boolean validStatus = userDaoImpl.isValidUser(username);
		return validStatus;
	}

	@Override
	public Integer getPoints(String username) {
		// TODO Auto-generated method stub
		int referralPoints = userDaoImpl.getPoints(username);
		return referralPoints;
	}
	
	@Override
	public Boolean updatePoints(String username, int refPoints) {
		// TODO Auto-generated method stub
		Boolean updatePointStatus = userDaoImpl.updatePoints(username, refPoints);
		return updatePointStatus;
	}

	@Override
	public UserBean getUser(String username) {
		// TODO Auto-generated method stub
		UserBean userBean = userDaoImpl.getUser(username);
		return userBean;
	}

	/*
	 * 
	 * Testing methods below
	 * 
	 */
	
	@Override
	public String testService() {
		// TODO Auto-generated method stub
		return "testService working";
	}

	@Override
	public List<String> getUsername() {
		// TODO Auto-generated method stub
		List<String> list = userDaoImpl.getUsername();
		return list;
	}

}
