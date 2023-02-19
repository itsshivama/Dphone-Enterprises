package demo.dphone.customer.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CustomerServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceRegistryApplication.class, args);
		System.out.println("Server Started");
	}

}
