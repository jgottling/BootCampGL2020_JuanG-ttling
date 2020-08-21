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
import com.globallogic.bootcampgl.vehiculo.dtos.ModeloDTO;
import com.globallogic.bootcampgl.vehiculo.model.Modelo;
import com.globallogic.bootcampgl.vehiculo.repository.ModeloRepository;

import com.globallogic.bootcampgl.vehiculo.service.impl.ModeloServiceImpl;
import com.globallogic.bootcampgl.vehiculo.utils.ModeloMapper;

@ExtendWith(MockitoExtension.class)
public class ModeloTests {
	@Mock
	ModeloRepository repository;
			
	@Mock
	ModeloMapper mapper;
	
	@InjectMocks
	ModeloServiceImpl service;

	
	@Test
	@DisplayName("Get all modelos")
	void test1() {
		List<ModeloDTO> list = new ArrayList<ModeloDTO>();
		ModeloDTO m1 = new ModeloDTO();
		ModeloDTO m2 = new ModeloDTO();
		ModeloDTO m3 = new ModeloDTO();
		ModeloDTO m4 = new ModeloDTO();
		
		list.add(m4);
		list.add(m3);
		list.add(m2);
		list.add(m1);
		
		when(service.getModelos()).thenReturn( list);
		assertEquals(4, service.getModelos().size());
	}
	
	@Test
	@DisplayName("Update modelo")
	void test2() {
		ModeloDTO modeloDTO = new ModeloDTO();
		Modelo modelo = new Modelo();
		
		when(mapper.mapFromDTOtoEntity(modeloDTO)).thenReturn(modelo);
		
		service.updateModelo("1", modeloDTO);
		
		verify(repository).deleteById(Integer.valueOf("1"));
	}
	
	@Test
	@DisplayName("Create modelo")
	void test3() {
		ModeloDTO modeloDTO = new ModeloDTO();
		Modelo modelo = new Modelo();
		
		when(mapper.mapFromDTOtoEntity(modeloDTO)).thenReturn(modelo);
		
		service.createModelo(modeloDTO);
		
		verify(repository).save(modelo);
	}
	
	@Test
	@DisplayName("Delete modelo")
	void test4() {
		service.deleteModelo("2");
		
		verify(repository).deleteById(2);
	}
}
