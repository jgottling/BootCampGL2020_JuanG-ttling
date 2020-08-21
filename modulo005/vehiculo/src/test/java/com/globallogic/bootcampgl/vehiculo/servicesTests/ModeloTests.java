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

import com.globallogic.bootcampgl.vehiculo.model.Modelo;
import com.globallogic.bootcampgl.vehiculo.repository.ModeloRepository;

import com.globallogic.bootcampgl.vehiculo.service.impl.ModeloServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ModeloTests {
	@Mock
	ModeloRepository repository;
	
	@InjectMocks
	ModeloServiceImpl service;
	
	@Test
	@DisplayName("Get all modelos")
	public void test1() {
		List<Modelo> list = new ArrayList<Modelo>();
		Modelo m1 = new Modelo();
		Modelo m2 = new Modelo();
		Modelo m3 = new Modelo();
		Modelo m4 = new Modelo();
		
		list.add(m4);
		list.add(m3);
		list.add(m2);
		list.add(m1);
		
		when(service.getModelos()).thenReturn( list);
		assertEquals(4, service.getModelos().size());
	}
	
	@Test
	@DisplayName("Update modelo")
	public void test2() {
		Modelo modelo = new Modelo();
		service.updateModelo("1", modelo);
		
		verify(repository).deleteById(Integer.valueOf("1"));
	}
	
	@Test
	@DisplayName("Create modelo")
	public void test3() {
		Modelo modelo = new Modelo();
		service.createModelo(modelo);
		
		verify(repository).save(modelo);
	}
	
	@Test
	@DisplayName("Delete modelo")
	public void test4() {
		service.deleteModelo("2");
		
		verify(repository).deleteById(2);
	}
}
