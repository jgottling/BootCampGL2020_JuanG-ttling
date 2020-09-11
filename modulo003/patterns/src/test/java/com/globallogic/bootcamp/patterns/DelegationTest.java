package com.globallogic.bootcamp.patterns;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.globallogic.bootcamp.patterns.delegation.ElectricalOven;

public class DelegationTest {
	
	private ElectricalOven oven;
	
	@BeforeEach
	void init() {
    	oven = new ElectricalOven();

	}
	
	@Test
	@DisplayName("At first power is 500")
	void test1() {
		assertEquals(500, oven.getPower());
	}
	
	@Test
	@DisplayName("when turned on power drops to 425")
	void test2() {
		oven.turnOn();
		assertEquals(425, oven.getPower());
	}
	
	@Test
	@DisplayName("when led turned on power drops to 325")
	void test3() {
		oven.turnOn();
		oven.turnLed();
		assertEquals(325, oven.getPower());
	}
}
