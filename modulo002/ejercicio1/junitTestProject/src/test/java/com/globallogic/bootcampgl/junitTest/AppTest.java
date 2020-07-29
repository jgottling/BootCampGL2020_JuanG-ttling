package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {


	public boolean weirdMethod(int limit) {
		
		int i;
		
		for (i = 0; i < limit; i++) {
			if (i == 3) break;
		}
		
		return i == 3;
	}
	
	@Test
	public void testEx7A(){
		assertTrue(weirdMethod(1), "Esta variable no es true");
	}
	
	@Test
	public void testEx7B(){
		assertFalse(weirdMethod(10), "Esta variable no es false");
	}
	
	
	public int sumar(int number1, int number2) {
		return number1 + number2;
	}
	
	@Test
	void testEx6A(){
		assertEquals(2, sumar(1,1), "El resultado está mal");
	}
	
	@Test
	void testEx4() {
		
		Long myVar = null;
		
		myVar = 1L;
		
		assertNotNull(myVar);  
	}
	
	@Test
	void testEx3A() {
		assertTrue(25 > 12);  
	}
	
	@Test
	void testEx3B() {
		assertFalse(25 > 27);  
	}

	@Test
	void testEx2() {
		assertTrue("Test".equals("Test") &&
				!("Test".equals("NoTest")));  
	}
	
	@Test
	void testEx1() {
		assertEquals("Test", "Test");  
	}
	
}
