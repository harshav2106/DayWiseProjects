package com.wipro.paymentms2.service;
import java.util.List;


import com.wipro.paymentms2.entity.Payment;


public interface PaymentService {
	List<Payment> findAll();
	Payment findById(int id);
	Payment save(Payment payment);
	void deleteById(int id);

}
