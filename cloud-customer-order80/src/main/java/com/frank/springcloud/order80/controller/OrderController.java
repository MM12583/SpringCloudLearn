package com.frank.springcloud.order80.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.frank.springcloud.commonsapi.entities.CommonResult;
import com.frank.springcloud.commonsapi.entities.Payment;

@RestController
public class OrderController {
	
	private static final Logger log = 
			org.slf4j.LoggerFactory.getLogger(OrderController.class);
	
	public static final String PAYMENTURL = "http://localhost:8001";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/customer/payment")
	public CommonResult<Payment> create(Payment payment){
		return restTemplate.postForObject
				(PAYMENTURL + "/payment", payment, CommonResult.class);
	}
	
	@GetMapping(value = "/customer/payment/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable Long id){
		return restTemplate.getForObject
				(PAYMENTURL + "/payment/" + id, CommonResult.class);
	}
}



















