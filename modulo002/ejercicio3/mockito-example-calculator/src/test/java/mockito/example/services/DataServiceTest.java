package mockito.example.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DataServiceTest {
	
	@Mock
	DataService dataService;

	
	@Test
	@DisplayName("Test ListOfNumbers")
	void test() {
		int[] intArray = {1,2,3,} ; 
		Mockito.when(dataService.getListOfNumbers()).thenReturn(intArray);
		assertEquals(3, dataService.getListOfNumbers().length);
	}
}
