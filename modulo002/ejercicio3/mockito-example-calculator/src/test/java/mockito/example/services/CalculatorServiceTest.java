/**
 * 
 */
package mockito.example.services;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.customExceptions.CustomException;
import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
	@Mock
	BasicOperationsService basicOperationsService;
	
	@Mock
	DataService dataService;
	
	
	CalculatorServiceImpl myCalculator;
	
	@BeforeEach
	void init() {
		myCalculator = new CalculatorServiceImpl();
		myCalculator.setBasicOperationsService(basicOperationsService);
		myCalculator.setDataService(dataService);
	}
	
	@Test
	@DisplayName("Test sum")
	void test1() {
		Mockito.when(basicOperationsService.add(1, 1)).thenReturn((double) 2);
		assertEquals(2, myCalculator.calculateSum(1, 1));
		Mockito.verify(basicOperationsService, times(1)).add(1, 1);
	}
	
	@Test
	@DisplayName("Test substraction")
	void test2() {
		Mockito.when(basicOperationsService.substract(2, 1)).thenReturn((double) 1);
		assertEquals(1, myCalculator.calculateSubstraction(2, 1));
		Mockito.verify(basicOperationsService, times(1)).substract(2, 1);

	}
	
	@Test
	@DisplayName("Test division")
	void test3() {
		try {
			Mockito.when(basicOperationsService.divide(2, 2)).thenReturn((double) 1);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			assertEquals(1, myCalculator.calculateDivision(2, 2));
		} catch (CustomException e) {
			e.printStackTrace();
		}
		Mockito.verify(basicOperationsService, times(1)).divide(2, 2);
	}
	
	@Test
	@DisplayName("Test multiplication")
	void test4() {
		Mockito.when(basicOperationsService.multiply(2, 2)).thenReturn((double) 4);
		assertEquals(4, myCalculator.calculateMultiplication(2, 2));
		Mockito.verify(basicOperationsService, times(1)).multiply(2, 2);
	}
	
	@Test
	@DisplayName("Test average")
	void test5() {
		int[] intArray = {0} ; 
		Mockito.when(dataService.getListOfNumbers()).thenReturn(intArray);
		assertEquals(0, myCalculator.calculateAverage());
	}

	@Test
	@DisplayName("Test average modified")
	void test6() {
		int[] intArray = {1,2,3,4,5} ; 
		Mockito.when(dataService.getListOfNumbers()).thenReturn(intArray);
		assertEquals(3, myCalculator.calculateAverage());
	}
	
	@Test
	@DisplayName("Test average with null array")
	void test7() {
		Mockito.when(dataService.getListOfNumbers()).thenReturn(null);
		Assertions.assertThrows(NullPointerException.class, () -> myCalculator.calculateAverage());
	}
	
	@Test
	@DisplayName("Test division with custom exception")
	void test8() {
		Assertions.assertThrows(CustomException.class, () -> myCalculator.calculateDivision(2, 0));
		Mockito.verify(basicOperationsService, times(0)).divide(2, 0);
	}
	
	@Test
	@DisplayName("Test print result")
	void test9() {
		Mockito.when(basicOperationsService.add(1, 1)).thenReturn((double) 2);
		assertEquals("El resultado es: 2.0", myCalculator.printResult(myCalculator.calculateSum(1, 1)));
		Mockito.verify(basicOperationsService, times(1)).add(1, 1);
	}
	
	@ParameterizedTest
	@CsvSource({
		"2, true",
		"3, false",
		"5, false",
		"6, true"
	})
	@DisplayName("Parameterized test is odd?")
	void test10(int number, boolean expectedResult) {
		assertEquals(expectedResult, myCalculator.isOdd(number));
	}
	
	
}
