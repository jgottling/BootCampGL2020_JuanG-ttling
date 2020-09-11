package com.globallogic.bootcampgl.vehiculo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.bootcampgl.vehiculo.dtos.VehiculoDTO;
import com.globallogic.bootcampgl.vehiculo.model.Vehiculo;
import com.globallogic.bootcampgl.vehiculo.repository.VehiculoRepository;
import com.globallogic.bootcampgl.vehiculo.service.VehiculoService;
import com.globallogic.bootcampgl.vehiculo.utils.VehiculoMapper;

@Service
public class VehiculoServiceImpl implements VehiculoService {

	@Autowired
	private VehiculoRepository repository;
	
	@Autowired
	private VehiculoMapper mapper;

	@Override
	public List<VehiculoDTO> getVehiculos() {

		return  mapper.mapFromModelsToDTOs((List<Vehiculo>) repository.findAll());
	}

	@Override
	public void createVehiculo(VehiculoDTO newVehiculo) {
		repository.save(mapper.mapFromDTOtoEntity(newVehiculo));
	}

	@Override
	public void updateVehiculo(String id, VehiculoDTO vehiculoDTO) {
		
		Vehiculo vehiculo = mapper.mapFromDTOtoEntity(vehiculoDTO);
		
		repository.deleteById(Integer.valueOf(id));
		vehiculo.setCodigo(Integer.valueOf(id));
		repository.save(vehiculo);
	}

	@Override
	public void deleteVehiculo(String id) {
		repository.deleteById(Integer.valueOf(id));
	}

}
