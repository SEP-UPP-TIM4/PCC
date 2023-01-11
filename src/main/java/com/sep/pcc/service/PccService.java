package com.sep.pcc.service;

import org.springframework.stereotype.Service;

@Service
public class PccService {

    private final BankService bankService;

    private final PaymentRequestService paymentRequestService;

    public PccService(BankService bankService, PaymentRequestService paymentRequestService) {
        this.bankService = bankService;
        this.paymentRequestService = paymentRequestService;
    }
}
