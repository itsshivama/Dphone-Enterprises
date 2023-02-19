package com.dphone.webapp.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dphone.webapp.bean.UserBean;

@FeignClient(url="http://localhost:8000/user",name="DPHONE-USER-SERVICE")
public interface UserService {
	
	@GetMapping("/get-user/{username}")
	UserBean getUser(@PathVariable String username); 
	
	@PostMapping("/add-user")
	UserBean addUser(@RequestBody UserBean userBean);

	@GetMapping("/{username}/user-validation")
	ResponseEntity<Boolean> isValidUser(@PathVariable String username);

}
