package com.dphone.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DphoneEnterprisesWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DphoneEnterprisesWebAppApplication.class, args);
		System.out.println("Web Application Started");
	}

}
