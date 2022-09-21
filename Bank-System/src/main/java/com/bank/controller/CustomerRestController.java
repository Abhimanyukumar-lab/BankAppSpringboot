package com.bank.controller;

import com.bank.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class CustomerRestController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/get-all-account")
    public ResponseEntity<List<?>> getAllAccounts(){
        return ResponseEntity.ok(customerService.allAccounts());
    }

    @PutMapping("/Deposit-withdrawal")
    public ResponseEntity<String> depositWithdrawlAmmount(@RequestParam String amount, @RequestParam Long id){
        customerService.withdrawAmmount(amount,id);
        return ResponseEntity.ok("Amount Withdrawl");
    }

    @PutMapping("/fd-Opening")
    public ResponseEntity<String> fdOpening(@RequestParam String amount,@RequestParam Long id){
        customerService.fdOpening(amount,id);
        return ResponseEntity.ok("FD Opening Successful");
    }

    @PutMapping("/od-Opening")
    public ResponseEntity<String> fodOpening(@RequestParam String amount,@RequestParam Long id){
        customerService.odOpening(amount,id);
        return ResponseEntity.ok("FD Opening Successful");
    }

}
