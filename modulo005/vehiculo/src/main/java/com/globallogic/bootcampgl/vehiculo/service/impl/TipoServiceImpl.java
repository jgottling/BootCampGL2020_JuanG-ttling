package com.globallogic.bootcampgl.vehiculo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.bootcampgl.vehiculo.model.Tipo;
import com.globallogic.bootcampgl.vehiculo.repository.TipoRepository;
import com.globallogic.bootcampgl.vehiculo.service.TipoService;

@Service
public class TipoServiceImpl implements TipoService {

	@Autowired
	private TipoRepository repository;
	
	@Override
	public List<Tipo> getTipos() {
		
		return (List<Tipo>) repository.findAll();
	}

	@Override
	public void createTipo(Tipo newTipo) {
		repository.save(newTipo);

	}

	@Override
	public void updateTipo(String id, Tipo tipo) {
		repository.deleteById(Integer.valueOf(id));
		tipo.setCodigo(Integer.valueOf(id));
		repository.save(tipo);

	}

	@Override
	public void deleteTipo(String id) {
		repository.deleteById(Integer.valueOf(id));

	}

}
