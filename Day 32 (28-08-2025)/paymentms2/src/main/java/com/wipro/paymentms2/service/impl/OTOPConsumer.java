package com.wipro.paymentms2.service.impl;

import com.wipro.paymentms2.entity.Payment;
import com.wipro.paymentms2.repo.PaymentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OTOPConsumer {

    @Autowired
    private PaymentRepo paymentRepo;

    @KafkaListener(
        topics = "OTOP",
        groupId = "payment_service",
        containerFactory = "kafkaListenerContainerFactory"
    )
    public void receivePayment(Payment payment) {
        System.out.println("Message Received: " + payment);
        payment.setPaymentStatus(1); 
        paymentRepo.save(payment);
    }
}
