package com.frank.springcloud.eureka7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMainApplication7001 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMainApplication7001.class, args);
	}

}
