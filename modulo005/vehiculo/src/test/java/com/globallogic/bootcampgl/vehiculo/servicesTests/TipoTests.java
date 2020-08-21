package com.globallogic.bootcampgl.vehiculo.servicesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.globallogic.bootcampgl.vehiculo.model.Tipo;
import com.globallogic.bootcampgl.vehiculo.repository.TipoRepository;
import com.globallogic.bootcampgl.vehiculo.service.impl.TipoServiceImpl;


@ExtendWith(MockitoExtension.class)
public class TipoTests {
	@Mock
	TipoRepository repository;
	
	@InjectMocks
	TipoServiceImpl service;
	
	@Test
	@DisplayName("Get all tipos")
	public void test1() {
		List<Tipo> list = new ArrayList<Tipo>();
		Tipo t1 = new Tipo();
		Tipo t2 = new Tipo();
		Tipo t3 = new Tipo();
		Tipo t4 = new Tipo();
		
		list.add(t4);
		list.add(t3);
		list.add(t2);
		list.add(t1);
		
		when(service.getTipos()).thenReturn( list);
		assertEquals(4, service.getTipos().size());
	}
	
	@Test
	@DisplayName("Update tipo")
	public void test2() {
		Tipo tipo = new Tipo();
		service.updateTipo("1", tipo);
		
		verify(repository).deleteById(Integer.valueOf("1"));
	}
	
	@Test
	@DisplayName("Create tipo")
	public void test3() {
		Tipo tipo = new Tipo();
		service.createTipo(tipo);
		
		verify(repository).save(tipo);
	}
	
	@Test
	@DisplayName("Delete tipo")
	public void test4() {
		service.deleteTipo("2");
		
		verify(repository).deleteById(2);
	}
}
