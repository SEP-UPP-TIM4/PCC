package com.sep.pcc.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentRequestService {

    private final PaymentRequestService repository;

    public PaymentRequestService(PaymentRequestService repository) {
        this.repository = repository;
    }
}
