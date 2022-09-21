package com.bank.service;

import com.bank.entity.Bank;
import com.bank.entity.Customer;

import java.util.List;

public interface ICustomerService {
    Customer findAccount(String email, String password);
    List<Bank> allAccounts();
    void withdrawAmmount(String amount, Long id);
    void fdOpening(String amount, Long id);
    void odOpening(String amount, Long id);
    void createAccount(Customer customer);
}
