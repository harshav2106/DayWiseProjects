package com.wipro.paymentms2.service.impl;

import java.util.List;
import java.util.Optional;

import com.wipro.paymentms2.entity.Payment;
import com.wipro.paymentms2.repo.PaymentRepo;
import com.wipro.paymentms2.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    @Autowired
    private KafkaTemplate<String, Payment> kafkaTemplate;

    private static final String TOPIC = "OTOP";

    
    public void sendPayment(Payment payment) {
        kafkaTemplate.send(TOPIC, payment);  
    }

    
    @Override
    public Payment save(Payment payment) {
        Payment savedPayment = paymentRepo.save(payment);
        sendPayment(savedPayment); 
        return savedPayment;
    }

    @Override
    public List<Payment> findAll() {
        return paymentRepo.findAll();
    }

    @Override
    public Payment findById(int id) {
        Optional<Payment> paymentOpt = paymentRepo.findById(id);
        return paymentOpt.orElse(null);
    }

    @Override
    public void deleteById(int id) {
        paymentRepo.deleteById(id);
    }
}
