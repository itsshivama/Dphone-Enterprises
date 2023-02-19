package com.dphone.user.external.service;

import org.hibernate.mapping.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dphone.user.external.bean.ReferralBean;

@FeignClient(url = "http://localhost:8081/referral" ,name = "DPHONE-REFERRAL-SERVICE")
public interface ReferralService {

	// Retrieve all referrals of User
	@RequestMapping(value = "/referral/list/{userId}", method = RequestMethod.GET)
	ResponseEntity<List> viewReferral(@PathVariable("userId") int userId);
	
	// Create new referral
	@RequestMapping(value = "referral/new", method = RequestMethod.POST)
	ResponseEntity<Boolean> createReferral(@RequestBody ReferralBean referralBean);
}
