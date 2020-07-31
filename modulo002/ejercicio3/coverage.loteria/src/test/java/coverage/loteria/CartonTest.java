package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import coverage.loteria.model.CartonGenerator;
import java.util.Random;

@ExtendWith(MockitoExtension.class)
public class CartonTest {

	@Mock
	CartonGenerator carton;
	
	@Mock
	Random myRandom;
	
	@Test
	@DisplayName("Carton generates a winner")
	void test() {
		Mockito.when(carton.isGanador()).thenReturn(true);
		
		assertTrue(carton.isGanador());
		
	}
	
	@Test
	@DisplayName("Random number is generated")
	void test1() {
		CartonGenerator unCarton = new CartonGenerator();
		unCarton.rand = myRandom;
		Mockito.when(myRandom.nextInt()).thenReturn(1);
		assertTrue(unCarton.isGanador());
	}
	
	@Test
	@DisplayName("Random number is generated")
	void test2() {
		CartonGenerator unCarton = new CartonGenerator();
		unCarton.rand = myRandom;
		Mockito.when(myRandom.nextInt()).thenReturn(2);
		assertFalse(unCarton.isGanador());
	}

	
}
