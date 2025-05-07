package com.eureka_server.Fatema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FatemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FatemaApplication.class, args);
	}

}
