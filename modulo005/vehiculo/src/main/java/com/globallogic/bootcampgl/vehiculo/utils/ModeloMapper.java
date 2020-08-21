package com.globallogic.bootcampgl.vehiculo.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.globallogic.bootcampgl.vehiculo.dtos.ModeloDTO;
import com.globallogic.bootcampgl.vehiculo.model.Modelo;

@Component
public class ModeloMapper {
	
	public Modelo mapFromDTOtoEntity(ModeloDTO modeloDTO) {
		return Modelo.builder().codigo(modeloDTO.getCodigo())
				.marca(modeloDTO.getMarca()).nombre(modeloDTO.getNombre()).build();
	}

	public List<ModeloDTO> mapFromModelsToDTOs(List<Modelo> modelos) {

		List<ModeloDTO> modelosDTO = new ArrayList<>();
					
		for(Modelo modelo: modelos) {
			ModeloDTO modeloDTO = mapFromEntityToDTO(modelo);	
			
			modelosDTO.add(modeloDTO);			
		}
		
		return modelosDTO;
	}
	
	public ModeloDTO mapFromEntityToDTO(Modelo modelo) {
		return ModeloDTO.builder().codigo(modelo.getCodigo())
				.marca(modelo.getMarca()).nombre(modelo.getNombre()).build();
	}
}
