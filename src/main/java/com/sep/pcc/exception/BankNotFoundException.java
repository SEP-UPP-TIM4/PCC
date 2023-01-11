package com.sep.pcc.exception;

public class BankNotFoundException extends RuntimeException{
    public BankNotFoundException(String id) {
        super("Bank with id: " + id + " not found!");
    }
}
