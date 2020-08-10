package coverage.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coverage.example.model.Galaxy;

public class GalaxyTest {

	@Test
	@DisplayName("Galaxy constructor-name")
	void test1() {
		Galaxy galaxy1 = new Galaxy("galaxy1");
		assertEquals("galaxy1", galaxy1.name);
	}
	
	@Test
	@DisplayName("Galaxy constructor-stars")
	void test2() {
		Galaxy galaxy1 = new Galaxy("galaxy1");
		assertNotNull(galaxy1.stars);
	}
}
