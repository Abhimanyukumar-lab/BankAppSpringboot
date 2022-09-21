package com.bank.controller;


import com.bank.service.ICustomerService;
import com.bank.service.IBankService;
import com.bank.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankRestController {

    @Autowired
    private IBankService bankService;
    @Autowired
    private ICustomerService customerService;

    @PostMapping("/create-account")
    public ResponseEntity<String> createAccount(@RequestBody Customer customer){
        customerService.createAccount(customer);
        return ResponseEntity.ok("Account Created");
    }

    @GetMapping("/get-account")
    public ResponseEntity<?> getSingleAccount(@RequestParam String email , @RequestParam String password){
         Customer customer = customerService.findAccount(email,password);
         if(customer.equals(null)){
             return ResponseEntity.ok("No User Found");
         }else{
             return ResponseEntity.ok(customer);
         }
    }

}
