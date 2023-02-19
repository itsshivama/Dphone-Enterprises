package com.dphone.buying.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DphoneBuyingDetailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DphoneBuyingDetailServiceApplication.class, args);
		System.out.println("Buying Details Application Started");
	}
}
