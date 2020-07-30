package coverage.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coverage.example.model.Planet;

public class PlanetTest {
	
	Planet myPlanet;
	
	@BeforeEach
	void init () {
		myPlanet = new Planet();
		myPlanet.setName("planet1");
	}
	
	@Test
	@DisplayName("Name getter")
	void test1() {
		assertEquals("planet1", myPlanet.getName());
	}
	
	@Test
	@DisplayName("Name setter")
	void test2() {
		myPlanet.setName("otherName");
		assertEquals("otherName", myPlanet.getName());
	}
	
	@Test
	@DisplayName("Planet to string")
	void test3() {
		assertEquals("Planet [name=planet1]", myPlanet.toString());
	}
	
}
