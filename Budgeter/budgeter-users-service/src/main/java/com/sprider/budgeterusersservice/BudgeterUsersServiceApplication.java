package com.sprider.budgeterusersservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BudgeterUsersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgeterUsersServiceApplication.class, args);
	}

}
