package com.frank.springcloud.payment8001.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.frank.springcloud.payment8001.entities.CommonResult;
import com.frank.springcloud.payment8001.entities.Payment;
import com.frank.springcloud.payment8001.service.PaymentService;

@RestController
public class PaymentController {
	
	private static final Logger log = 
			org.slf4j.LoggerFactory.getLogger(PaymentController.class);
	
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping(value = "/payment") // post = create
	public CommonResult create(@RequestBody Payment payment){ // Client : Rest 傳 JSON
		int result = paymentService.create(payment);
		log.info("Insert result : " + result);

		return result > 0 ? new CommonResult(200, "Insert Success", result) : new CommonResult(404, "Insert Failed", null);
	}
	
	@GetMapping(value = "/payment/{id}") 
	public CommonResult getPaymentById(@PathVariable Long id){
		
		Payment payment = paymentService.getPaymentById(id);
		log.info("Get result : " + payment);

		return null == payment ? new CommonResult(404, "Get Failed", null) : new CommonResult(200, "Get Success", payment);
	}
}
























