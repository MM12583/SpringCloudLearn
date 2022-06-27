package com.frank.springcloud.payment8002.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.frank.springcloud.commonsapi.entities.Payment;

// mapper 不為SpringBean,須加Repository 才可Autowired, 否則用Resource
@Repository
@Mapper 
public interface PaymentRepo {
	
	public int create(Payment payment); //insert
	
	public Payment getPaymentById(@Param("id") Long id);
	
}
