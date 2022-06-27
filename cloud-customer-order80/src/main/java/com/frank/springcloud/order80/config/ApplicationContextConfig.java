package com.frank.springcloud.order80.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
	
	@Bean
	@LoadBalanced // 負載均衡
	public RestTemplate geRestTemplate() {
		return new RestTemplate();
	}
}
