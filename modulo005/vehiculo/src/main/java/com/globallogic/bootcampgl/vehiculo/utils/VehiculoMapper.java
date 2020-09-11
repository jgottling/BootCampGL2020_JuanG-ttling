package com.globallogic.bootcampgl.vehiculo.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.bootcampgl.vehiculo.dtos.ModeloDTO;
import com.globallogic.bootcampgl.vehiculo.dtos.TipoDTO;
import com.globallogic.bootcampgl.vehiculo.dtos.VehiculoDTO;
import com.globallogic.bootcampgl.vehiculo.model.Modelo;
import com.globallogic.bootcampgl.vehiculo.model.Tipo;
import com.globallogic.bootcampgl.vehiculo.model.Vehiculo;


@Component
public class VehiculoMapper {
	
	@Autowired
	private TipoMapper tipoMapper;
	
	@Autowired
	private ModeloMapper modeloMapper;

	public Vehiculo mapFromDTOtoEntity(VehiculoDTO vehiculoDTO) {
		Tipo tipo = tipoMapper.mapFromDTOtoEntity(vehiculoDTO.getTipo());
		Modelo modelo = modeloMapper.mapFromDTOtoEntity(vehiculoDTO.getModelo());
		
		return Vehiculo.builder().codigo(vehiculoDTO.getCodigo())
				.identificacion(vehiculoDTO.getIdentificacion()).tipo(tipo)
				.modelo(modelo).fechaProduccion(vehiculoDTO.getFechaProduccion())
				.build();
	}

	public List<VehiculoDTO> mapFromModelsToDTOs(List<Vehiculo> vehiculos) {

		List<VehiculoDTO> vehiculosDTO = new ArrayList<>();
					
		for(Vehiculo vehiculo: vehiculos) {
			VehiculoDTO vehiculoDTO = mapFromEntityToDTO(vehiculo);	
			
			vehiculosDTO.add(vehiculoDTO);			
		}
		
		return vehiculosDTO;
	}
	
	public VehiculoDTO mapFromEntityToDTO(Vehiculo vehiculo) {
		
		TipoDTO tipo = tipoMapper.mapFromEntityToDTO(vehiculo.getTipo());
		ModeloDTO modelo = modeloMapper.mapFromEntityToDTO(vehiculo.getModelo());
		
		return VehiculoDTO.builder().codigo(vehiculo.getCodigo())
				.identificacion(vehiculo.getIdentificacion()).tipo(tipo)
				.modelo(modelo).fechaProduccion(vehiculo.getFechaProduccion())
				.build();
	}
}
