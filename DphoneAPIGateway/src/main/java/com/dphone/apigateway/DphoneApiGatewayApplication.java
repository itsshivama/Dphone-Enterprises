package com.dphone.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DphoneApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DphoneApiGatewayApplication.class, args);
		System.out.println("API Gateway Started");
	}

}
