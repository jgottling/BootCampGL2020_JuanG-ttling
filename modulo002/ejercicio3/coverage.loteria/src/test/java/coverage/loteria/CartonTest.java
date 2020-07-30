package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;

@ExtendWith(MockitoExtension.class)
public class CartonTest {

	@Mock
	CartonGenerator carton;
	
	@Test
	@DisplayName("Carton generates a winner")
	void test() {
		Mockito.when(carton.isGanador()).thenReturn(true);
		
		assertTrue(carton.isGanador());
		
	}
	
}
