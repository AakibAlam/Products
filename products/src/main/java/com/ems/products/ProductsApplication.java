package com.ems.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication {

	public static void main(String[] args) {
		// execution starts from here and it simply runs the springboot application.
		// localhost:8080 is the default link to our website. 
		SpringApplication.run(ProductsApplication.class, args);
	}

}
