package com.globallogic.bootcampgl.order.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.globallogic.bootcampgl.customer.utils.OrderFactory;
import com.globallogic.bootcampgl.order.models.Order;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	@Autowired
	private Order myOrder;
	
	@Bean
	public Order getMyOrder() {
		return OrderFactory.getNewOrder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\nCurrent order: " + myOrder.toString());		
	}

}
