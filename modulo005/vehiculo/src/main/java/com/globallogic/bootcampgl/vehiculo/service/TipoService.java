package com.globallogic.bootcampgl.vehiculo.service;

import java.util.List;

import com.globallogic.bootcampgl.vehiculo.model.Tipo;

public interface TipoService {

	public List<Tipo> getTipos();
	public void createTipo(Tipo newTipo);
	public void updateTipo(String id, Tipo tipo);
	public void deleteTipo(String id);
	
}
