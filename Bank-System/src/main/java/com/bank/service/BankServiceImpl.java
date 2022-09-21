package com.bank.service;

import com.bank.entity.Customer;
import com.bank.repository.BankRepository;
import com.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements IBankService{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BankRepository bankRepository;

    @Override
    public void createAccount(Customer customer) {

    }
}
