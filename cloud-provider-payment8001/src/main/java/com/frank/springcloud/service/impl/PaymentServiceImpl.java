package com.frank.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frank.springcloud.dao.PaymentRepo;
import com.frank.springcloud.entities.Payment;
import com.frank.springcloud.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentRepo paymentRepo;
	
	@Override
	public int create(Payment payment) {
		return paymentRepo.create(payment);
	}

	@Override
	public Payment getPaymentById(Long id) {
		return paymentRepo.getPaymentById(id);
	}

}











