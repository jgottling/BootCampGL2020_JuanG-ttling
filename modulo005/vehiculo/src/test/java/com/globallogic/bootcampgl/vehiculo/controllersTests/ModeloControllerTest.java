package com.globallogic.bootcampgl.vehiculo.controllersTests;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.globallogic.bootcampgl.vehiculo.controller.ModeloController;
import com.globallogic.bootcampgl.vehiculo.dtos.ModeloDTO;
import com.globallogic.bootcampgl.vehiculo.service.ModeloService;

@ExtendWith(MockitoExtension.class)
public class ModeloControllerTest {

	  @Mock
	  ModeloService modeloService;
	  
	  @InjectMocks
	  ModeloController controller;
	  
	  List<ModeloDTO> modelosList;
	  
	  @BeforeEach
	  void setUp() {
		  this.modelosList = new ArrayList<ModeloDTO>();
		  this.modelosList.add(new ModeloDTO());
		  this.modelosList.add(new ModeloDTO());
		  this.modelosList.add(new ModeloDTO());
	  }
	  
	  @Test
	  @DisplayName("Received http get all")
	  void test1() {
		  when(modeloService.getModelos()).thenReturn(modelosList);
			
		  controller.getModelos();
			
		  verify(modeloService).getModelos();

	  }
}
