package com.openf.premierpas.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.DeleteExchange;

import com.openf.premierpas.model.Customer;

@FeignClient(value="CUSTOMER-SERVICE",url="http://localhost:8080/student")

public interface CustomerService {
    @GetMapping("/customer/{id}")
    public Customer findCustomerById(@PathVariable(name="id")Long id);
    
    @GetMapping("")
    String getStudent();

    @DeleteExchange("/delete/{id}")
    public void deleteById(@PathVariable (name="id") String id);

    @GetMapping("{id}")
    String getStudentById(@PathVariable (name="id") String id);
    /* il suffit d'importer les mapping de l'application serveur afin d'avoir ses données */
}
