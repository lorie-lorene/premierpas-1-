package com.openf.premierpas.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.openf.premierpas.model.Customer;

@FeignClient(value="CUSTOMER-SERVICE",url="http://localhost:8080/student")

public interface CustomerService {
    @GetMapping("/customer/{id}")
    public Customer findCustomerById(@PathVariable(name="id")Long id);
    
    @GetMapping("")
    String getStudent();

    @GetMapping("{id}")
    String getStudentById(@PathVariable (name="id") String id);
}
