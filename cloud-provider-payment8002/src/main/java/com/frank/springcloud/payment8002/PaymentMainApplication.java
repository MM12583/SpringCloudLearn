package com.frank.springcloud.payment8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentMainApplication.class, args);
	}

}
