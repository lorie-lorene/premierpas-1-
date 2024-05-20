package com.openf.premierpas.controler;

import org.springframework.web.bind.annotation.RestController;

import com.openf.premierpas.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/customer")

public class TestFeign {
    @Autowired
    private CustomerService service;

    @GetMapping("/customerStudent")
    public String getStudent() {
        return service.getStudent();
    }
    @GetMapping("/customerStudent/{id}")
    public String getStudentById(@PathVariable String id) {
        return service.getStudentById(id);
    }
     @GetMapping("/customerDelete/{id}")
    public String getDelById(@PathVariable String id) {
        service.deleteById(id);
        return "deleted";
    }
}
