package com.dphone.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.dphone.webapp.service.WebAppServiceImpl;

@RestController
public class WebController {
	
	@Autowired
	WebAppServiceImpl webAppServiceImpl;
	
	@GetMapping("/")
	public ModelAndView homeView() {
		ModelAndView homeView = new ModelAndView();
		homeView.setViewName("index.html");
		return homeView;
	}
	
	@GetMapping("/register")
	public ModelAndView registerView() {
		ModelAndView registerView = new ModelAndView("registration.html");
		return registerView;
	}
	
	
	@GetMapping("/user")
	public ModelAndView userHome() {
		ModelAndView userView = new ModelAndView();
		userView.setViewName("user.html");
		return userView;
	}
	
	@GetMapping("/referral/{username}")
	public ModelAndView referralView() {
		ModelAndView referralView = new ModelAndView();
		referralView.setViewName("referral.html");
		return referralView;
	}
}
