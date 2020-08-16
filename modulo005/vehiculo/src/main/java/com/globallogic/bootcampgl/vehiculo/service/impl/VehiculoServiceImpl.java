package com.globallogic.bootcampgl.vehiculo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.bootcampgl.vehiculo.model.Vehiculo;
import com.globallogic.bootcampgl.vehiculo.repository.VehiculoRepository;
import com.globallogic.bootcampgl.vehiculo.service.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {

	@Autowired
	private VehiculoRepository repository;

	@Override
	public List<Vehiculo> getVehiculos() {

		return (List<Vehiculo>) repository.findAll();
	}

	@Override
	public void createVehiculo(Vehiculo newVehiculo) {
		repository.save(newVehiculo);
	}

	@Override
	public void updateVehiculo(String id, Vehiculo vehiculo) {
		repository.deleteById(Integer.valueOf(id));
		vehiculo.setCodigo(Integer.valueOf(id));
		repository.save(vehiculo);
	}

	@Override
	public void deleteVehiculo(String id) {
		repository.deleteById(Integer.valueOf(id));
	}

}
