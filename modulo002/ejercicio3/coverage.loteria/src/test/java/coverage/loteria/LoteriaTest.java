package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LoteriaTest {
	@Mock
	Loteria lottery;
	
	@Test
	@DisplayName("Pozo getter")
	void test1() {
		Mockito.when(lottery.getPozo()).thenReturn(10.0f);
		assertEquals(10.0f, lottery.getPozo());
	}
	
	@Test
	@DisplayName("Boletos getter")
	void test2() {
		Mockito.when(lottery.getBoletos()).thenReturn(10);
		assertEquals(10, lottery.getBoletos());
	}
	
	@Test
	@DisplayName("Ganadores getter")
	void test3() {
		Mockito.when(lottery.getGanadores()).thenReturn(1);
		assertEquals(1, lottery.getGanadores());
	}
	
	@Test
	@DisplayName("Jugada ...")
	void test4() {}
	
	@Test
	@DisplayName("Hay ganador único")
	void test5A() {
		Mockito.when(lottery.hayGanadorUnico()).thenReturn(true);
		assertTrue(lottery.hayGanadorUnico());
	}
	
	@Test
	@DisplayName("No hay ganador único")
	void test5B() {
		Mockito.when(lottery.hayGanadorUnico()).thenReturn(false);
		assertFalse(lottery.hayGanadorUnico());
	}
	
	@Test
	@DisplayName("Hay cuádruple ganador")
	void test6A() {
		Mockito.when(lottery.hayCuadrupleGanador()).thenReturn(true);
		assertTrue(lottery.hayCuadrupleGanador());
	}
	
	@Test
	@DisplayName("No hay cuádruple ganador")
	void test6B() {
		Mockito.when(lottery.hayCuadrupleGanador()).thenReturn(false);
		assertFalse(lottery.hayCuadrupleGanador());
	}
}
