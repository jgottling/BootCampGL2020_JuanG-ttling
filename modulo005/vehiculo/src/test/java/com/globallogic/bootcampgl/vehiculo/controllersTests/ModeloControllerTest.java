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
import com.globallogic.bootcampgl.vehiculo.model.Modelo;
import com.globallogic.bootcampgl.vehiculo.service.ModeloService;

@ExtendWith(MockitoExtension.class)
public class ModeloControllerTest {
	

	  @Mock
	  private ModeloService modeloService;
	  
	  @InjectMocks
	  private ModeloController controller;
	  
	  private List<Modelo> modelosList;
	  
	  @BeforeEach
	  void setUp() {
		  this.modelosList = new ArrayList<Modelo>();
		  this.modelosList.add(new Modelo());
		  this.modelosList.add(new Modelo());
		  this.modelosList.add(new Modelo());
	  }
	  
	  @Test
	  @DisplayName("Received http get all")
	  private void test1() {
		  when(modeloService.getModelos()).thenReturn(modelosList);
			controller.getModelos();
			verify(modeloService).getModelos();

	  }
}
