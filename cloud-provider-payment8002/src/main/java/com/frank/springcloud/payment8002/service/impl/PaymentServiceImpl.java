package com.frank.springcloud.payment8002.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frank.springcloud.commonsapi.entities.Payment;
import com.frank.springcloud.payment8002.dao.PaymentRepo;
import com.frank.springcloud.payment8002.service.PaymentService;

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











