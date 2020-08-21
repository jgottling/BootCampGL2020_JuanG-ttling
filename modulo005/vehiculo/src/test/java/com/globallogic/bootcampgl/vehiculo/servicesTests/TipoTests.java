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

import com.globallogic.bootcampgl.vehiculo.dtos.TipoDTO;
import com.globallogic.bootcampgl.vehiculo.model.Tipo;
import com.globallogic.bootcampgl.vehiculo.repository.TipoRepository;
import com.globallogic.bootcampgl.vehiculo.service.impl.TipoServiceImpl;
import com.globallogic.bootcampgl.vehiculo.utils.TipoMapper;


@ExtendWith(MockitoExtension.class)
public class TipoTests {
	@Mock
	TipoRepository repository;
	
	@Mock
	TipoMapper mapper;
	
	@InjectMocks
	TipoServiceImpl service;
	
	@Test
	@DisplayName("Get all tipos")
	void test1() {
		List<TipoDTO> list = new ArrayList<TipoDTO>();
		TipoDTO t1 = new TipoDTO();
		TipoDTO t2 = new TipoDTO();
		TipoDTO t3 = new TipoDTO();
		TipoDTO t4 = new TipoDTO();
		
		list.add(t4);
		list.add(t3);
		list.add(t2);
		list.add(t1);
		
		when(service.getTipos()).thenReturn( list);
		assertEquals(4, service.getTipos().size());
	}
	
	@Test
	@DisplayName("Update tipo")
	void test2() {
		TipoDTO tipoDTO = new TipoDTO();
		Tipo tipo = new Tipo();
		
		when(mapper.mapFromDTOtoEntity(tipoDTO)).thenReturn(tipo);
		
		service.updateTipo("1", tipoDTO);
		
		verify(repository).deleteById(Integer.valueOf("1"));
	}
	
	@Test
	@DisplayName("Create tipo")
	void test3() {
		TipoDTO tipoDTO = new TipoDTO();
		Tipo tipo = new Tipo();
		
		when(mapper.mapFromDTOtoEntity(tipoDTO)).thenReturn(tipo);
		
		service.createTipo(tipoDTO);
		
		verify(repository).save(tipo);
	}
	
	@Test
	@DisplayName("Delete tipo")
	void test4() {
		service.deleteTipo("2");
		
		verify(repository).deleteById(2);
	}
}
