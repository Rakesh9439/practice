package com.practics.aop.impl;

import com.practics.aop.PaymentService;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void makePayment() {


        // payment code

        // Simulating payment process
        System.out.println("Amount Debited...");
        // Business logic for payment
        System.out.println("Amount Credited...");
    }
}
