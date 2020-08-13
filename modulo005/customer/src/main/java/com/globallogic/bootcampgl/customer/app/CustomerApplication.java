package com.globallogic.bootcampgl.customer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.globallogic.bootcampgl.customer.models.Customer;

@SpringBootApplication
public class CustomerApplication implements CommandLineRunner {

	@Autowired
	private Customer myCustomer;
	
	@Bean
	public Customer getCustomer() {
		return Customer.builder()
				.nombre("José").apellido("Pérez").dni(234567890l).id(12342l)
				.build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\nCustomer:" + myCustomer.toString());
	}

}
