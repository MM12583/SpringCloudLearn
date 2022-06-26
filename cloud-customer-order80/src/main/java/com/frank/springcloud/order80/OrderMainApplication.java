package com.frank.springcloud.order80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderMainApplication.class, args);

	}

}
