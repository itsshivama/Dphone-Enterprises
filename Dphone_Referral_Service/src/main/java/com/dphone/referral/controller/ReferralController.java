package com.dphone.referral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dphone.referral.bean.ReferralBean;
import com.dphone.referral.service.ReferralServiceImpl;


@RestController
@RequestMapping("/referral")
public class ReferralController {
	
	@Autowired
	ReferralServiceImpl referralServiceImpl;
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public ResponseEntity<Boolean> createReferral(@RequestBody ReferralBean referralBean) {
		boolean status = referralServiceImpl.createReferral(referralBean);
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
	}
	
	@RequestMapping(value="/list/{userId}", method=RequestMethod.GET)
	public ResponseEntity<List<ReferralBean>> viewReferral(@PathVariable("userId") int userId){
		List<ReferralBean> list = referralServiceImpl.viewReferral(userId);
		
		if(list.isEmpty()) return new ResponseEntity<List<ReferralBean>>(list, HttpStatus.BAD_REQUEST);
		else return new ResponseEntity<List<ReferralBean>>(list, HttpStatus.OK);
		
	}
	
	@DeleteMapping(value="/delete/{referral_Id}")
	public ResponseEntity<Boolean> deleteReferral(@PathVariable("referral_Id") int referral_Id){
		
		boolean status = referralServiceImpl.deleteReferral(referral_Id);
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public ResponseEntity<Boolean> updateReferral(@RequestBody ReferralBean referralBean){
		
		boolean status = referralServiceImpl.updateReferral(referralBean);
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/show-all-referrals", method = RequestMethod.GET)
	public ResponseEntity<List<ReferralBean>> viewAllReferral() {
		List<ReferralBean> referralBeans = referralServiceImpl.viewAllReferral();
		return new ResponseEntity<List<ReferralBean>>(referralBeans, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{referralCode}/validate", method = RequestMethod.GET)
	public ResponseEntity<Boolean> isValidReferral(@PathVariable("referralCode") String referralCode) {
		Boolean validStatus = referralServiceImpl.isValidReferral(referralCode);
		return new ResponseEntity<Boolean>(validStatus, HttpStatus.OK);
	}
}

