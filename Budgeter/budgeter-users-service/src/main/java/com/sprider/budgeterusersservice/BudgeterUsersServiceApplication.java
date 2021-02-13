package com.sprider.budgeterusersservice;

import com.sprider.budgeterusersservice.Services.BudgeterUserDetailsService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableEurekaClient
public class BudgeterUsersServiceApplication {

	@Bean
	public UserDetailsService userDetailsService(){
		return new BudgeterUserDetailsService();
	}

	@Bean 
	public BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	public static void main(String[] args) {
		SpringApplication.run(BudgeterUsersServiceApplication.class, args);
	}

}
