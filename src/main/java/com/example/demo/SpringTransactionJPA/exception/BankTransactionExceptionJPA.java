package com.example.demo.SpringTransactionJPA.exception;

public class BankTransactionExceptionJPA  extends Exception{
    public BankTransactionExceptionJPA (String mes){
        super(mes);
    }
}
