package com.globallogic.bootcampgl.vehiculo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.bootcampgl.vehiculo.model.Modelo;
import com.globallogic.bootcampgl.vehiculo.repository.ModeloRepository;
import com.globallogic.bootcampgl.vehiculo.service.ModeloService;

@Service
public class ModeloServiceImpl implements ModeloService {

	@Autowired
	private ModeloRepository repository;
	
	@Override
	public List<Modelo> getModelos() {
		return (List<Modelo>) repository.findAll();
	}

	@Override
	public void createModelo(Modelo newModelo) {
		repository.save(newModelo);

	}

	@Override
	public void updateModelo(String id, Modelo modelo) {
		repository.deleteById(Integer.valueOf(id));
		modelo.setCodigo(Integer.valueOf(id));
		repository.save(modelo);
	}

	@Override
	public void deleteModelo(String id) {
		repository.deleteById(Integer.valueOf(id));
	}

}
