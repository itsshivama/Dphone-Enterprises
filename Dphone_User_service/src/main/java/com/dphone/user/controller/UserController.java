package com.dphone.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dphone.user.bean.UserBean;
import com.dphone.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	// Create new User - C
	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public ResponseEntity<UserBean> addUser(@RequestBody UserBean userBean) {
		UserBean userBean2 =  this.userService.addUser(userBean);
		return new ResponseEntity<UserBean>(userBean2, HttpStatus.OK);
	}

	// Update existing User - U
	@RequestMapping(value = "/update-user", method = RequestMethod.PUT)
	public ResponseEntity<UserBean> updateUser(@RequestBody UserBean userBean) {
		UserBean updatedUserBean = this.userService.updateUser(userBean);
		return new ResponseEntity<UserBean>(updatedUserBean, HttpStatus.OK);
	}
	
	// Get User data - R
	@RequestMapping(value = "/{username}/user-info", method = RequestMethod.GET)
	public ResponseEntity<UserBean> showUserInfo(@PathVariable("username") String username) {
		UserBean userBean = userService.showUserInfo(username);
		return new ResponseEntity<UserBean>(userBean, HttpStatus.OK);
	}
	
	// Delete User - D
	@RequestMapping(value = "/{username}/delete-user", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteUser(@PathVariable("username") String username){
		Boolean deleteStatus = this.userService.deleteUser(username);
		return new ResponseEntity<Boolean>(deleteStatus, HttpStatus.OK);
	}
	
	// User validation
	@RequestMapping(value = "/{username}/user-validation", method = RequestMethod.GET)
	public ResponseEntity<Boolean> isValidUser(@PathVariable("username") String username) {
		Boolean validStatus = this.userService.isValidUser(username);
		return new ResponseEntity<Boolean>(validStatus, HttpStatus.OK);
	}
	
	// Get User's points
	@RequestMapping(value = "/{username}/get-points", method = RequestMethod.GET)
	public ResponseEntity<Integer> getPoints(@PathVariable("username") String username) {
//		Object[] responseObject = (Object[]) new Object();
		Integer referralPoints = this.userService.getPoints(username);
//		Boolean referralPointsStatus = (referralPoints == (Integer)null) ? false : true;
//		
//		responseObject[0] = referralPointsStatus;
//		responseObject[1] = referralPoints;
		
		return new ResponseEntity<Integer>(referralPoints, HttpStatus.OK);
	}
	
	// Update User's points
	@RequestMapping(value = "/{username}/update-points/{refPoints}", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> updatePoints(@PathVariable("username") String username, @PathVariable("refPoints") int refPoints) {
		Boolean updatePointsStatus = this.userService.updatePoints(username, refPoints);
		return new ResponseEntity<Boolean>(updatePointsStatus, HttpStatus.OK);
	}
	
	// Get Userbean
	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public ResponseEntity<UserBean> getUser(@PathVariable("username") String username) {
		UserBean userbean = this.userService.getUser(username);
		return new ResponseEntity<UserBean>(userbean, HttpStatus.OK);
	}
	
	/*
	 * 
	 * 
	 * Testing endpoints below
	 * 
	 * 
	 */
	
	// Endpoint to be mapped to error 404 page, yet to be done
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String> homePage() {
		String responseString = "Service under maintenance";
		return new ResponseEntity<String>(responseString, HttpStatus.BAD_GATEWAY);
	}
	
	// Test endpoint
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "test function in api working fine";
	}
	
	// Test endpoint to test service layer
	@RequestMapping(value = "/test-service", method = RequestMethod.GET)
	public String testService() {
		return this.userService.testService();
	}
	
	// Test endpoint to test @Query
	@RequestMapping(value = "/show-all-user", method = RequestMethod.GET)
	public ResponseEntity<List<String>> getUsername() {
		List<String> list = this.userService.getUsername();
		return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}
}
