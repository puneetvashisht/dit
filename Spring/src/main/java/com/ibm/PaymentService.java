package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository paymentRepo;

//	public PaymentService(PaymentRepository paymentRepo) {
//		this.paymentRepo = paymentRepo;
//	}
	
	
	
	public void payment(){
		this.paymentRepo.loadAccountDetails();
		System.out.println("payment process");
	}

	public PaymentRepository getPaymentRepo() {
		return paymentRepo;
	}


	public void setPaymentRepo(PaymentRepository paymentRepo) {
		this.paymentRepo = paymentRepo;
	}
	
	
	
	

}
