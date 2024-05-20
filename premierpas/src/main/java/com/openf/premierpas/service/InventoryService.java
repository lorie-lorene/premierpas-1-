package com.openf.premierpas.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.openf.premierpas.model.Product;

@FeignClient(name="INVENTORY-SERVICE")
public interface InventoryService {
    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable (name="id") Long id);
        
}
