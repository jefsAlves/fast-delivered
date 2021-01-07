package com.alvesjefs.ms_users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DeliveredUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveredUsersApplication.class, args);
	}

}
