package com.frank.springcloud.payment8001.entities;

import java.io.Serializable;

public class Payment implements Serializable{
	
	private Long id; // BigInt in sql
	
	private String serial;
	
	public Payment() {}

	public Payment(Long id, String serial) {
		this.id = id;
		this.serial = serial;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	
	
}