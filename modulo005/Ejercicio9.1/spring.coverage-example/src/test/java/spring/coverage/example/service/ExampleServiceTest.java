package spring.coverage.example.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import spring.coverage.example.model.Example;
import spring.coverage.example.service.impl.ExampleServiceImpl;

@ExtendWith(SpringExtension.class)
public class ExampleServiceTest {

	@InjectMocks
	private ExampleServiceImpl exampleService;

	@Test
	void getAllExamplesTest() {

		List<Example> result = this.exampleService.getAllExamples();
		assertThat(result).isNotNull();
	}

}
