package com.dphone.referral.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.dphone.referral.entity.ReferralEntity;

public interface ReferralDao extends JpaRepository<ReferralEntity, Integer>{


//	@Query("select referralEntity from ReferralEntity where referral.userId=?1")
//	List<ReferralEntity> userReferralList(int userId);
//	
//	
//	@Query("select referral from Referral where referral referral.referralCode=?1 and referral.firstName=?2 and referral.lastName=?3")
//	List<ReferralEntity> redeemReferral(String referralCode, String firstName, String lastName);


}