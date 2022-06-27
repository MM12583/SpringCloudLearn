package com.frank.springcloud.payment8002.service;

import org.apache.ibatis.annotations.Param;

import com.frank.springcloud.commonsapi.entities.Payment;

public interface PaymentService {
	
	public int create(Payment payment); //insert
	
	public Payment getPaymentById(@Param("id") Long id);
}
