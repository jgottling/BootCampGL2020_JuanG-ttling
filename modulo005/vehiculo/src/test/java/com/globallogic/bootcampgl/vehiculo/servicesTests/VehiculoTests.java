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

import com.globallogic.bootcampgl.vehiculo.model.Vehiculo;
import com.globallogic.bootcampgl.vehiculo.repository.VehiculoRepository;
import com.globallogic.bootcampgl.vehiculo.service.impl.VehiculoServiceImpl;

@ExtendWith(MockitoExtension.class)
public class VehiculoTests {

	@Mock
	VehiculoRepository repository;
	
	@InjectMocks
	VehiculoServiceImpl service;
	
	@Test
	@DisplayName("Get all vehiculos")
	public void test1() {
		List<Vehiculo> list = new ArrayList<Vehiculo>();
		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo();
		Vehiculo v3 = new Vehiculo();
		Vehiculo v4 = new Vehiculo();
		
		list.add(v4);
		list.add(v3);
		list.add(v2);
		list.add(v1);
		
		when(service.getVehiculos()).thenReturn( list);
		assertEquals(4, service.getVehiculos().size());
	}
	
	@Test
	@DisplayName("Update vehiculo")
	public void test2() {
		Vehiculo vehiculo = new Vehiculo();
		service.updateVehiculo("1", vehiculo);
		
		verify(repository).deleteById(Integer.valueOf("1"));
	}
	
	@Test
	@DisplayName("Create vehiculo")
	public void test3() {
		Vehiculo vehiculo = new Vehiculo();
		service.createVehiculo(vehiculo);
		
		verify(repository).save(vehiculo);
	}
	
	@Test
	@DisplayName("Delete vehiculo")
	public void test4() {
		service.deleteVehiculo("2");
		
		verify(repository).deleteById(2);
	}
	
}
