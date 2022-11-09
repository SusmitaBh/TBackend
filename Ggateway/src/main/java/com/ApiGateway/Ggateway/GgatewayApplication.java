package com.ApiGateway.Ggateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GgatewayApplication.class, args);
	}

}
