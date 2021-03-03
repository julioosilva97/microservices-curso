package com.julioosilva97.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.julioosilva97.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		
		return new Payment("Julio",100.0,days);
	}

}
