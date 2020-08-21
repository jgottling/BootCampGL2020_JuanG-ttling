package com.globallogic.bootcampgl.vehiculo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.bootcampgl.vehiculo.dtos.ModeloDTO;
import com.globallogic.bootcampgl.vehiculo.model.Modelo;
import com.globallogic.bootcampgl.vehiculo.repository.ModeloRepository;
import com.globallogic.bootcampgl.vehiculo.service.ModeloService;
import com.globallogic.bootcampgl.vehiculo.utils.ModeloMapper;

@Service
public class ModeloServiceImpl implements ModeloService {

	@Autowired
	private ModeloRepository repository;
	
	@Autowired
	private ModeloMapper mapper;
	
	@Override
	public List<ModeloDTO> getModelos() {
				
		return mapper.mapFromModelsToDTOs((List<Modelo>) repository.findAll());
	}

	@Override
	public void createModelo(ModeloDTO newModelo) {
		
		
		repository.save(mapper.mapFromDTOtoEntity(newModelo));

	}

	@Override
	public void updateModelo(String id, ModeloDTO modeloDTO) {
		
		Modelo modelo = mapper.mapFromDTOtoEntity(modeloDTO);
		
		repository.deleteById(Integer.valueOf(id));
		modelo.setCodigo(Integer.valueOf(id));
		repository.save(modelo);
	}

	@Override
	public void deleteModelo(String id) {
		repository.deleteById(Integer.valueOf(id));
	}

}
