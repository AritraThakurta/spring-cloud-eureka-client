package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan({"controller"})
@SpringBootApplication
public class SpringEurekaClientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientTestApplication.class, args);
	}
}
