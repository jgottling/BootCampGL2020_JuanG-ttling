package com.globallogic.bootcampgl.vehiculo.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


import com.globallogic.bootcampgl.vehiculo.dtos.TipoDTO;
import com.globallogic.bootcampgl.vehiculo.model.Tipo;

@Component
public class TipoMapper {

	public Tipo mapFromDTOtoEntity(TipoDTO tipoDTO) {
		return Tipo.builder().codigo(tipoDTO.getCodigo())
				.categoria(tipoDTO.getCategoria()).puertas(tipoDTO.getPuertas())
				.build();
	}

	public List<TipoDTO> mapFromModelsToDTOs(List<Tipo> tipos) {

		List<TipoDTO> tiposDTO = new ArrayList<>();
					
		for(Tipo tipo: tipos) {
			TipoDTO tipoDTO = mapFromEntityToDTO(tipo);	
			
			tiposDTO.add(tipoDTO);			
		}
		
		return tiposDTO;
	}
	
	public TipoDTO mapFromEntityToDTO(Tipo tipo) {
		return TipoDTO.builder().codigo(tipo.getCodigo())
				.categoria(tipo.getCategoria()).puertas(tipo.getPuertas())
				.build();
	}

}
