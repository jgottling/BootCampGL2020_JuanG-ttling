package com.globallogic.bootcampgl.vehiculo.service;

import java.util.List;

import com.globallogic.bootcampgl.vehiculo.dtos.ModeloDTO;

public interface ModeloService {

	public List<ModeloDTO> getModelos();
	public void createModelo(ModeloDTO newModelo);
	public void updateModelo(String id, ModeloDTO modelo);
	public void deleteModelo(String id);
	
}
