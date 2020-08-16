package com.globallogic.bootcampgl.vehiculo.service;

import java.util.List;


import com.globallogic.bootcampgl.vehiculo.model.Vehiculo;

public interface VehiculoService {

	public List<Vehiculo> getVehiculos();
	public void createVehiculo(Vehiculo newVehiculo);
	public void updateVehiculo(String id, Vehiculo vehiculo);
	public void deleteVehiculo(String id);
	
}
