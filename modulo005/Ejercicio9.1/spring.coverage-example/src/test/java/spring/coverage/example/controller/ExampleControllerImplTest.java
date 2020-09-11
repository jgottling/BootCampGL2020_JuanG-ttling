package spring.coverage.example.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import spring.coverage.example.model.Example;
import spring.coverage.example.service.ExampleService;

@ExtendWith(MockitoExtension.class)
public class ExampleControllerImplTest {

	@InjectMocks
	private ExampleController exampleController;
	
	@Mock
	private ExampleService exampleService;

	@Test
	void getExampleByIdTest() {

		final Example response = this.exampleController.getExampleById(2347);
		assertThat(response).isNull();

	}
}
