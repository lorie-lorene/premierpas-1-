package com.openf.premierpas;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableEurekaServer
@EnableFeignClients
public class PremierpasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PremierpasApplication.class, args);
	}
// @Bean
// CommandLineRunner start (BillRepository billR,ProductItemRepository prodR,
// CustomerService service, InventoryService serviceProduct){
// 	return args->{
// 			Customer c1=service.findCustomerById(1L);
// 			System.out.println("************");
// 			System.out.println("id"+ c1.getId());
// 			System.out.println("name"+c1.getName());
// 			System.out.println("email"+c1.getEmail());
// 			System.out.println("************");
// 			Product p1=serviceProduct.findProductById(1L);
// 			Bill bill1=billR.save(new Bill(null,new Date(),c1.getId(),null));
// 			prodR.save(new ProductItem(null,p1.getId(),p1.getPrice(),30,bill1));
// 			prodR.save(new ProductItem(null,2L,800.0,30,bill1));
// 			prodR.save(new ProductItem(null,3L,800.0,30,bill1));
// 	};
// }
}
