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

import com.globallogic.bootcampgl.vehiculo.dtos.VehiculoDTO;
import com.globallogic.bootcampgl.vehiculo.model.Vehiculo;
import com.globallogic.bootcampgl.vehiculo.repository.VehiculoRepository;
import com.globallogic.bootcampgl.vehiculo.service.impl.VehiculoServiceImpl;
import com.globallogic.bootcampgl.vehiculo.utils.VehiculoMapper;

@ExtendWith(MockitoExtension.class)
public class VehiculoTests {

	@Mock
	VehiculoRepository repository;
	
	@Mock
	VehiculoMapper mapper;
	
	@InjectMocks
	VehiculoServiceImpl service;
	
	@Test
	@DisplayName("Get all vehiculos")
	void test1() {
		List<VehiculoDTO> list = new ArrayList<VehiculoDTO>();
		VehiculoDTO v1 = new VehiculoDTO();
		VehiculoDTO v2 = new VehiculoDTO();
		VehiculoDTO v3 = new VehiculoDTO();
		VehiculoDTO v4 = new VehiculoDTO();
		
		list.add(v4);
		list.add(v3);
		list.add(v2);
		list.add(v1);
		
		when(service.getVehiculos()).thenReturn( list);
		assertEquals(4, service.getVehiculos().size());
	}
	
	@Test
	@DisplayName("Update vehiculo")
	void test2() {
		Vehiculo vehiculo = new Vehiculo();
		VehiculoDTO vehiculoDTO = new VehiculoDTO();
		
		when(mapper.mapFromDTOtoEntity(vehiculoDTO)).thenReturn(vehiculo);
		
		
		service.updateVehiculo("1", vehiculoDTO);
		
		verify(repository).deleteById(Integer.valueOf("1"));
	}
	
	@Test
	@DisplayName("Create vehiculo")
	void test3() {
		Vehiculo vehiculo = new Vehiculo();
		VehiculoDTO vehiculoDTO = new VehiculoDTO();
		
		when(mapper.mapFromDTOtoEntity(vehiculoDTO)).thenReturn(vehiculo);
		
		service.createVehiculo(vehiculoDTO);
				
		verify(repository).save(vehiculo);
	}
	
	@Test
	@DisplayName("Delete vehiculo")
	void test4() {
		service.deleteVehiculo("2");
		
		verify(repository).deleteById(2);
	}
	
}
