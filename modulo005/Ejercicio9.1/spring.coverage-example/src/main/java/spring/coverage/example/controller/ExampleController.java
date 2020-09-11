package spring.coverage.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.coverage.example.model.Example;
import spring.coverage.example.service.ExampleService;

@RestController()
public class ExampleController {

	ExampleService exampleService;
	
	@Autowired
	public ExampleController(ExampleService exampleService) {
		this.exampleService = exampleService;
	}

	@GetMapping(path = "/example/{id}")
	public Example getExampleById(@PathVariable("id") int id) {
		return exampleService.getById(id);
	}
	
	@GetMapping(path = "/example")
	public List<Example> getAllExamples(){
		return exampleService.getAllExamples();
	}
	
	@PostMapping(path = "/example")
	public Boolean createExample(@RequestBody Example example)
	{
		try
		{
			return exampleService.createExample(example);
		} catch(Exception e)
		{			
		}
		
		return Boolean.FALSE;
	}
	
}
