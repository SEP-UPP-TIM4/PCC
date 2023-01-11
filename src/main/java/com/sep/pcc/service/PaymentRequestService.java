package com.sep.pcc.service;

import com.sep.pcc.model.PaymentRequest;
import com.sep.pcc.repository.PaymentRequestRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentRequestService {

    private final PaymentRequestRepository repository;

    public PaymentRequestService(PaymentRequestRepository repository) {
        this.repository = repository;
    }

    public PaymentRequest save(PaymentRequest paymentRequest){
        return repository.save(paymentRequest);
    }
}
