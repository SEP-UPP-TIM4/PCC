package com.sep.pcc.service;

import com.sep.pcc.dto.RequestDto;
import com.sep.pcc.dto.ResponseDto;
import com.sep.pcc.model.Bank;
import com.sep.pcc.model.PaymentRequest;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PccService {

    private final BankService bankService;

    private final ModelMapper modelMapper;

    private final PaymentRequestService paymentRequestService;

    private final RestTemplate restTemplate;

    private static final String BANK_URL = "http://localhost:9009/api/v1/payment/pcc";

    public PccService(BankService bankService, PaymentRequestService paymentRequestService, RestTemplate restTemplate) {
        this.bankService = bankService;
        this.paymentRequestService = paymentRequestService;
        this.restTemplate = restTemplate;
        this.modelMapper = new ModelMapper();
    }

    public ResponseDto forward(RequestDto dto){
        PaymentRequest paymentRequest = modelMapper.map(dto, PaymentRequest.class);
        paymentRequestService.save(paymentRequest);
        Bank bank = bankService.findById(dto.getPan().substring(0, 5));
        ResponseDto responseDto = restTemplate.postForObject(BANK_URL, dto, ResponseDto.class);
        paymentRequest.setSuccess(responseDto.isSuccess());
        paymentRequestService.save(paymentRequest);
        return responseDto;
    }

}
