package com.globallogic.bootcampgl.vehiculo.service;

import java.util.List;

import com.globallogic.bootcampgl.vehiculo.dtos.VehiculoDTO;

public interface VehiculoService {

	public List<VehiculoDTO> getVehiculos();
	public void createVehiculo(VehiculoDTO newVehiculo);
	public void updateVehiculo(String id, VehiculoDTO vehiculo);
	public void deleteVehiculo(String id);
	
}
