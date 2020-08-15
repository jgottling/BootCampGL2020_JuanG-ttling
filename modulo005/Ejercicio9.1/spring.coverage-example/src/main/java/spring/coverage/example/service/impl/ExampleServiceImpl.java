package spring.coverage.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.coverage.example.controller.ExampleController;
import spring.coverage.example.model.Example;
import spring.coverage.example.service.ExampleService;

@Service
public class ExampleServiceImpl implements ExampleService {

	private final static int ID = 633452;
	private final static String NAME = "Ejemplo de Covertura";
	private static final int VALUE = 473632;

	private final static int ID_DOS = 743492;
	private final static String NAME_DOS = "Segundo Ejemplo de Covertura";
	private static final int VALUE_DOS = 2455632;

	@Override
	public Example getById(int id) {
		return Example.builder().id(ID).name(NAME).value(VALUE).build();
	}

	@Override
	public List<Example> getAllExamples() {

		List<Example> result = new ArrayList<>();
		
		Example example = Example.builder().id(ID).name(NAME).value(VALUE).build();
		result.add(example);
		Example e2 = Example.builder().id(ID_DOS).name(NAME_DOS).value(VALUE_DOS).build();
		result.add(e2);
		
	    if (result.isEmpty()) {
			return null;
		}else {
			
		}
			
		return result;
	}
	
//	public List<Example> getAllExampless() {
//
//		List<Example> result = new ArrayList<>();
//		
//		Example example = Example.builder().id(ID).name(NAME).value(VALUE).build();
//		result.add(example);
//		Example e2 = Example.builder().id(ID_DOS).name(NAME_DOS).value(VALUE_DOS).build();
//		result.add(e2);
//		
//	    if (result.isEmpty()) {
//			return null;
//		}
//		return result;
//	}

	@Override
	public Boolean createExample(Example example) {
		if (example.getId() <= 0)
			throw new UnsupportedOperationException();

		System.out.println("Save example id: " + example.getId() );
		
		return Boolean.TRUE;
	}

}
