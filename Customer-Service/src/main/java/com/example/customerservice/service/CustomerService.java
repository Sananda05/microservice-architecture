package com.example.customerservice.service;

import com.example.customerservice.entity.Customer;
import com.example.customerservice.repository.CustRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {
    @Autowired
    private CustRepository custRepository;

    public Customer saveCustomer(Customer customer){
        return custRepository.save(customer);
    }

    public Customer findCustomerById(String customerId){
        return custRepository.findCustomerById(customerId);
    }
}
