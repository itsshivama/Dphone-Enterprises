package com.dphone.referral.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.dphone.referral.entity.ReferralEntity;

public interface ReferralDao extends JpaRepository<ReferralEntity, Integer>{

	@Query("SELECT r FROM ReferralEntity r WHERE r.userId = ?1")
	List<ReferralEntity> getByUserId(int userId);

	@Query("SELECT r from ReferralEntity r")
	List<ReferralEntity> getAllReferrals();

	@Query("SELECT CASE WHEN COUNT(*)>0 THEN TRUE ELSE FALSE END FROM ReferralEntity r WHERE r.referral_code = ?1")
	Boolean isValidReferral(String referralCode);


//	@Query("select referralEntity from ReferralEntity where referral.userId=?1")
//	List<ReferralEntity> userReferralList(int userId);
//	
//	
//	@Query("select referral from Referral where referral referral.referralCode=?1 and referral.firstName=?2 and referral.lastName=?3")
//	List<ReferralEntity> redeemReferral(String referralCode, String firstName, String lastName);


}