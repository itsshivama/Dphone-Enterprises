package com.dphone.webapp.config;

//import org.bouncycastle.jce.provider.BrokenJCEBlockCipher.BrokePBEWithMD5AndDES;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.dphone.webapp.bean.UserBean;
//import com.dphone.webapp.external.services.UserService;
//
//public class UserDetailsServiceImpl implements UserDetailsService{
//
//	@Autowired
//	private UserService userService;
//	
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		
//		// fetching user details from user service
//		
//		UserBean userBean = userService.getUser(username);
//		if(userBean==null) {
//			throw new UsernameNotFoundException("Could not found user !");
//		}
//		
//		CustomUserDetails customUserDetails = new CustomUserDetails(userBean);
//		
//		return customUserDetails;
//	}
//
//}
