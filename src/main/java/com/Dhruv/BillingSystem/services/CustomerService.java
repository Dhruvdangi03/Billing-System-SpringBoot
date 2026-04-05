package com.Dhruv.BillingSystem.services;

import com.Dhruv.BillingSystem.DTO.customer.CustomerDTO;
import com.Dhruv.BillingSystem.entities.Customer;
import com.Dhruv.BillingSystem.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        customer.setPhone(customerDTO.getPhone());
        customer.setIs_deleted(false);

        customerRepository.save(customer);
        return customer;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerByPhoneNumber(String phoneNumber) {
        return customerRepository.getCustomerByPhoneNumber(phoneNumber);
    }

    public Customer updateCustomerByPhoneNumber(CustomerDTO customerDTO) {
        Customer customer = getCustomerByPhoneNumber(customerDTO.getPhone());
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());

        customerRepository.save(customer);
        return customer;

    }

    public String deleteCustomerByPhoneNumber(String phoneNumber) {
        Customer customer = getCustomerByPhoneNumber(phoneNumber);
        customer.setIs_deleted(true);

        customerRepository.save(customer);
        return "Deleted Successfully";
    }
}
