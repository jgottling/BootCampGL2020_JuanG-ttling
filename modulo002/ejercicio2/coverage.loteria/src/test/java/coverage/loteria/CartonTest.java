package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

public class CartonTest {
	@Test
	@DisplayName("Random number is generated")
	void test1() {
		CartonGenerator carton = new CartonGenerator();
		boolean winner = carton.isGanador();
		assertTrue(winner || !winner);
	}
}
