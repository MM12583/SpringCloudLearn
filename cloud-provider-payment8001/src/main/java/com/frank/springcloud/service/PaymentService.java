package com.frank.springcloud.service;

import org.apache.ibatis.annotations.Param;

import com.frank.springcloud.entities.Payment;

public interface PaymentService {
	
	public int create(Payment payment); //insert
	
	public Payment getPaymentById(@Param("id") Long id);
}
