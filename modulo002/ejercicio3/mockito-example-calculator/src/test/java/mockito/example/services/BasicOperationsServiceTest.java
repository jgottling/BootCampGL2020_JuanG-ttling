package mockito.example.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.services.impl.BasicOperationsServiceImpl;

@ExtendWith(MockitoExtension.class)
public class BasicOperationsServiceTest {

	@Spy
	BasicOperationsServiceImpl basicOperations = new BasicOperationsServiceImpl();
	
	@Test
	void test1() {
		assertEquals(2, spy(basicOperations).add(1, 1));
	}
}
