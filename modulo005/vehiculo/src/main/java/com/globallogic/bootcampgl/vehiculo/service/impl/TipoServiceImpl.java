package com.globallogic.bootcampgl.vehiculo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.bootcampgl.vehiculo.dtos.TipoDTO;
import com.globallogic.bootcampgl.vehiculo.model.Tipo;
import com.globallogic.bootcampgl.vehiculo.repository.TipoRepository;
import com.globallogic.bootcampgl.vehiculo.service.TipoService;
import com.globallogic.bootcampgl.vehiculo.utils.TipoMapper;

@Service
public class TipoServiceImpl implements TipoService {

	@Autowired
	private TipoRepository repository;
	
	@Autowired
	private TipoMapper mapper;
	
	@Override
	public List<TipoDTO> getTipos() {
		
		return mapper.mapFromModelsToDTOs((List<Tipo>) repository.findAll());
	}

	@Override
	public void createTipo(TipoDTO newTipo) {
		repository.save(mapper.mapFromDTOtoEntity(newTipo));

	}

	@Override
	public void updateTipo(String id, TipoDTO tipoDTO) {
		
		Tipo tipo = mapper.mapFromDTOtoEntity(tipoDTO);
		
		repository.deleteById(Integer.valueOf(id));
		tipo.setCodigo(Integer.valueOf(id));
		repository.save(tipo);

	}

	@Override
	public void deleteTipo(String id) {
		repository.deleteById(Integer.valueOf(id));

	}

}
