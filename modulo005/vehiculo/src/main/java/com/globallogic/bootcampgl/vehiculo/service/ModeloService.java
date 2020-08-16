package com.globallogic.bootcampgl.vehiculo.service;

import java.util.List;
import com.globallogic.bootcampgl.vehiculo.model.Modelo;

public interface ModeloService {

	public List<Modelo> getModelos();
	public void createModelo(Modelo newModelo);
	public void updateModelo(String id, Modelo modelo);
	public void deleteModelo(String id);
	
}
