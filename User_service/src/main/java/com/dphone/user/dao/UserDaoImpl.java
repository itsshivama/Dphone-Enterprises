package com.dphone.user.dao;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.dphone.user.bean.UserBean;
import com.dphone.user.entity.UserEntity;
import com.dphone.user.external.bean.ReferralBean;
import com.dphone.user.external.service.ReferralService;

public class UserDaoImpl {
	@Autowired
	public UserDao userdao;
	
	@Autowired
	public ReferralService referralService;
	
	public int getUserId(String username) {
		try {
			return userdao.getUserId(username);
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}

	public UserBean addUser(UserBean userBean) {
		// TODO Auto-generated method stub
		try {
			UserEntity userEntity = new UserEntity();
			BeanUtils.copyProperties(userBean, userEntity);
			userdao.save(userEntity);
			
			userEntity = userdao.getReferenceById(userdao.getUserId(userBean.getUsername()));
			BeanUtils.copyProperties(userEntity, userBean);
			
			return userBean;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public UserBean updateUser(UserBean userBean) {
		// TODO Auto-generated method stub
		try {
			UserEntity oldUserEntity = userdao.getReferenceById(userdao.getUserId(userBean.getUsername()));
			
			userBean.setUserId(oldUserEntity.getUserId());
			userBean.setCustomer(oldUserEntity.isCustomer());
			userBean.setRefPoints(oldUserEntity.getRefPoints());
			userBean.setReferralBeans(oldUserEntity.getReferralBeans());
			
			UserEntity newUserEntity = new UserEntity();
			BeanUtils.copyProperties(userBean, newUserEntity);
			
			userdao.save(newUserEntity);
			
			UserBean updatedUserBean = new UserBean();
			BeanUtils.copyProperties(newUserEntity, updatedUserBean);
			return updatedUserBean;
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public UserBean showUserInfo(String username) {
		// TODO Auto-generated method stub
		try {
			int userId = userdao.getUserId(username);
			UserEntity userEntity = userdao.getReferenceById(userId);
			referralService.viewReferral(userId);
			
			List<ReferralBean> referralBeans = (List<ReferralBean>) referralService.viewReferral(userId).getBody();
			userEntity.setReferralBeans(referralBeans);
			
			UserBean userBean = new UserBean();
			BeanUtils.copyProperties(userEntity, userBean);
			return userBean;
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}	
	}

	public Boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		Boolean deleteStatus = false;
		try {
			int userId = userdao.getUserId(username);
			userdao.deleteById(userId);	
			deleteStatus = !userdao.existsById(userId);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return deleteStatus;
	}
	
	public Boolean isValidUser(String username) {
		// TODO Auto-generated method stub
		Boolean validStatus = false;
		try {
			int userId = userdao.getUserId(username);
			validStatus = userdao.existsById(userId);
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return validStatus;
	}

	public Integer getPoints(String username) {
		// TODO Auto-generated method stub
		Integer referralPoints = null;
		try {
			int userId = userdao.getUserId(username);
			referralPoints = userdao.getUserReferralPoints(userId);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return referralPoints;
	}

	public Boolean updatePoints(String username, int refPoints) {
		// TODO Auto-generated method stub
		Boolean updatePointStatus;
		try {
			int userId = userdao.getUserId(username);
			
			UserEntity userEntity = userdao.getReferenceById(userId);
			userEntity.setRefPoints(userEntity.getRefPoints() + refPoints);
			int prevPoints = userdao.getUserReferralPoints(userId);
			userdao.save(userEntity);
//			userdao.updateUserReferralPoints(userId, refPoints);
			int currPoints = userdao.getUserReferralPoints(userId);
			updatePointStatus = (currPoints == prevPoints + refPoints) ? true : false;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return updatePointStatus;
	}

	public UserBean getUser(String username) {
		// TODO Auto-generated method stub
		try {
			int userId = userdao.getUserId(username);
			
			UserEntity userEntity = userdao.getReferenceById(userId);
			UserBean userBean = new UserBean();
			BeanUtils.copyProperties(userEntity, userBean);
			
			return userBean;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	/*
	 * 
	 * Testing methpds below
	 * 
	 */
	
	public List<String> getUsername() {
		List<String> list = userdao.getUsername();
		return list;
	}




	
}
