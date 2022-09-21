package com.bank.service;

import com.bank.entity.Bank;
import com.bank.entity.Customer;
import com.bank.repository.BankRepository;
import com.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private BankRepository bankRepo;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer findAccount(String email, String password) {
        return customerRepository.findByEmail(email,password);
    }

    @Override
    public List<Bank> allAccounts() {
        return bankRepo.findAll();
    }

    @Override
    public void withdrawAmmount(String amount, Long id) {
         bankRepo.updateAmount(amount,id);
    }

    @Override
    public void fdOpening(String amount, Long id) {
        bankRepo.fdOpening(amount,id);
    }

    @Override
    public void odOpening(String amount, Long id) {
        bankRepo.odOpening(amount,id);
    }

    @Override
    public void createAccount(Customer customer) {
        customerRepository.save(customer);
    }
}
