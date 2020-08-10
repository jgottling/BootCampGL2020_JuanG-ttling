package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

public class LoteriaTest {

	Loteria myLottery;
	CartonGenerator myCarton;
	
	@BeforeEach
	void init() {
		myCarton = new CartonGenerator();
		myLottery = new Loteria(10.0f, 2, myCarton);
		
	}
	
	@Test
	@DisplayName("Loteria creation")
	void test(){
		assertNotNull(myLottery);
	}
	
	@Test
	@DisplayName("Pozo getter")
	void test1() {
		assertEquals(10.0f, myLottery.getPozo());
	}
	
	@Test
	@DisplayName("Boletos getter")
	void test2() {
		assertEquals(2, myLottery.getBoletos());
	}
	
	@Test
	@DisplayName("Ganadores getter")
	void test3() {
		assertEquals(0, myLottery.getGanadores());
	}
	
	@Test
	@DisplayName("hayGanadorUnico")
	void test4(){
		assertFalse(myLottery.hayGanadorUnico());
	}
	
	@Test
	@DisplayName("hayCuadrupleGanador")
	void test5(){
		assertFalse(myLottery.hayCuadrupleGanador());
	}
}
