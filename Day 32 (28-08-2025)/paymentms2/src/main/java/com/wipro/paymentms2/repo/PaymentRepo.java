package com.wipro.paymentms2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.paymentms2.entity.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {

}
