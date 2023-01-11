package com.sep.pcc.service;

import com.sep.pcc.exception.BankNotFoundException;
import com.sep.pcc.model.Bank;
import com.sep.pcc.repository.BankRepository;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    private final BankRepository repository;

    public BankService(BankRepository repository) {
        this.repository = repository;
    }

    public Bank findById(String id){
        return repository.findById(id).orElseThrow(() -> new BankNotFoundException(id));
    }
}
