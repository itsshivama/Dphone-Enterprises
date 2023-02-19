package com.dphone.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DphoneCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DphoneCustomerServiceApplication.class, args);
		System.out.println("Customer Application Started");
	}

}
