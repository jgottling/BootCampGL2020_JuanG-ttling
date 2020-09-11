package com.globallogic.bootcampgl.vehiculo.service;

import java.util.List;

import com.globallogic.bootcampgl.vehiculo.dtos.TipoDTO;

public interface TipoService {

	public List<TipoDTO> getTipos();
	public void createTipo(TipoDTO newTipo);
	public void updateTipo(String id, TipoDTO tipo);
	public void deleteTipo(String id);
	
}
