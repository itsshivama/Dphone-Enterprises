package com.dphone.user.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dphone.user.entity.UserEntity;

@Repository
public interface UserDao extends JpaRepository<UserEntity, Integer>{
	
	@Query("SELECT u.username FROM UserEntity u")
	public List<String> getUsername();

	@Query("SELECT CASE WHEN COUNT(*)>0 THEN TRUE ELSE FALSE END FROM UserEntity u WHERE u.username = ?1")
	public Boolean existsByUsername(String username);

	@Query("SELECT u.refPoints FROM UserEntity u WHERE u.userId = ?1")
	public Integer getUserReferralPoints(int userId);

	@Query("SELECT u.userId FROM UserEntity u WHERE u.username = ?1")
	public int getUserId(String username);

//	@Query("UPDATE UserEntity u SET u.refPoints = u.refPoints + ?2 WHERE u.userId = ?1")
//	public void updateUserReferralPoints(int userId, int refPoints);

}
