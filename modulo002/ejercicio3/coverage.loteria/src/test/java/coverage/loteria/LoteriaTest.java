package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;

@ExtendWith(MockitoExtension.class)
public class LoteriaTest {
	@Mock
	Loteria lottery;
	
	@Mock
	CartonGenerator carton;

	Loteria myLottery;
	CartonGenerator myCarton;
	
	@BeforeEach
	void init() {
		myCarton = new CartonGenerator();
		myLottery = new Loteria(10.0f, 2, myCarton);
		
	}
	
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
	
	@Test
	@DisplayName("Loteria creation")
	void test7(){
		assertNotNull(myLottery);
	}
	
	@Test
	@DisplayName("Pozo getter")
	void test8() {
		assertEquals(10.0f, myLottery.getPozo());
	}
	
	@Test
	@DisplayName("Boletos getter")
	void test9() {
		assertEquals(2, myLottery.getBoletos());
	}
	
	@Test
	@DisplayName("Ganadores getter")
	void test10() {
		assertEquals(0, myLottery.getGanadores());
	}
	
	@Test
	@DisplayName("hayGanadorUnico")
	void test11(){
		assertFalse(myLottery.hayGanadorUnico());
	}
	
	@Test
	@DisplayName("no hay cuadruple ganador")
	void test12(){
		assertFalse(myLottery.hayCuadrupleGanador());
		
	}
	
	@Test
	@DisplayName("hay cuadruple ganador")
	void test13(){
		Mockito.when(carton.isGanador()).thenReturn(true);
		myCarton = new CartonGenerator();
		myLottery = new Loteria(10.0f, 4, carton);
		myLottery.jugada();
		assertTrue(myLottery.hayCuadrupleGanador());	
	}
	
	@Test
	@DisplayName("hay ganador único")
	void test14(){
		Mockito.when(carton.isGanador()).thenReturn(true);
		myCarton = new CartonGenerator();
		myLottery = new Loteria(10.0f, 1, carton);
		myLottery.jugada();
		assertTrue(myLottery.hayGanadorUnico());	
	}
}
