package com.globallogic.bootcampgl.product.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.globallogic.bootcampgl.product.repository.ProductRepository;

@SpringBootApplication
public class ProductApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	
	@Bean
	public ProductRepository getProductRepository() {
		return new ProductRepository();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\nSearching product by id n°C-00221..." +
				productRepository.getById("C-00221").toString());
		
	}

}
