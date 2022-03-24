package com.example.demo.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiGwServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGwServerApplication.class, args);
	}

}
