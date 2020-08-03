package com.globallogic.bootcamp.patterns;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.globallogic.bootcamp.patterns.singleton.Currency;
import com.globallogic.bootcamp.patterns.singleton.Order;

public class SingletonTest {
	@Test
	@DisplayName("Same object in two calls")
	void test1() {
		Currency instance1 = Currency.getInstance();
		Currency instance2 = Currency.getInstance();
		assertTrue(instance1.equals(instance2));
	}
	
	@Test
	@DisplayName("Different orders use the same currency")
	void test2() {
		Order order1 = new Order("order1", 33.33, Currency.getInstance());
		Order order2 = new Order("order2", 77.77, Currency.getInstance());
		assertTrue(order1.getCurrency().equals(order2.getCurrency()));
	}
}
