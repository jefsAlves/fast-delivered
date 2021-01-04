package com.alvesjefs.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DeliveredConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveredConfigurationServerApplication.class, args);
	}

}
