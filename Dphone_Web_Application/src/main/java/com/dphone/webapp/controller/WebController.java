package com.dphone.webapp.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dphone.webapp.bean.UserBean;
import com.dphone.webapp.external.services.UserService;
import com.dphone.webapp.service.WebAppServiceImpl;

@RestController
public class WebController {
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	WebAppServiceImpl webAppServiceImpl;
	
	UserBean user = new UserBean();
	
	@Autowired
	UserService userService;
	
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
	
	@GetMapping("/referral")
	public ModelAndView referralView() {
		ModelAndView referralView = new ModelAndView();
		referralView.setViewName("referral.html");
		return referralView;
	}
	
	@PostMapping("/do-register")
	public ModelAndView doRegister(@RequestBody UserBean userBean) {
		//userBean.setPassword(passwordEncoder.encode(userBean.getPassword()));
		userService.addUser(userBean);
		ModelAndView mv = new ModelAndView("index.html");
		return mv;
	}
	
	@PostMapping("/do-login")
	public ModelAndView doLogin(@RequestBody UserBean userBean) {
		ModelAndView mv = new ModelAndView();
		boolean status = userService.isValidUser(userBean.getUsername()).getBody();
		if(status==true) {
			mv.setViewName("user.html");
			BeanUtils.copyProperties(userBean, user);
			mv.addObject("user", user);
		}
		else {
			mv.setViewName("404.html");
		}
		return mv;
	}
	
	
	
}
