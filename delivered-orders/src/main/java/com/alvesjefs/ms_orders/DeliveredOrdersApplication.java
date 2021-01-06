package com.alvesjefs.ms_orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class DeliveredOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveredOrdersApplication.class, args);
	}

}
