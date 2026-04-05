package com.Dhruv.BillingSystem.controllers;

import com.Dhruv.BillingSystem.DTO.customer.CustomerDTO;
import com.Dhruv.BillingSystem.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> createCustomer(CustomerDTO customerDTO){
        return ResponseEntity.ok(customerService.createCustomer(customerDTO));
    }

    @GetMapping
    public ResponseEntity<?> getAllCustomers(){
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @GetMapping("/{phoneNumber}")
    public ResponseEntity<?> getCustomerByPhoneNumber(@PathVariable String phoneNumber){
        return ResponseEntity.ok(customerService.getCustomerByPhoneNumber(phoneNumber));
    }

    @PutMapping
    public ResponseEntity<?> updateCustomerByPhoneNumber(CustomerDTO customerDTO){
        return ResponseEntity.ok(customerService.updateCustomerByPhoneNumber(customerDTO));
    }

    @DeleteMapping("/{phoneNumber}")
    public ResponseEntity<?> deleteCustomer(@PathVariable String phoneNumber){
        return ResponseEntity.ok(customerService.deleteCustomerByPhoneNumber(phoneNumber));
    }
}
