package com.globallogic.bootcampms.customer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.globallogic.bootcampms.customer.models.Customer;


@SpringBootApplication
@PropertySource("classpath:application.properties")
public class CustomerApplication implements CommandLineRunner{
	
	@Autowired
	private Customer myCustomer;
	

	@Bean
	public Customer getCustomer() {
		return new Customer();
				
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	
	public void run(String... args) throws Exception {
		System.out.println("\nCustomer:" + myCustomer.toString());
	}
}
