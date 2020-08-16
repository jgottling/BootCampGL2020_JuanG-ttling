package com.globallogic.bootcampgl.vehiculo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.bootcampgl.vehiculo.model.Tipo;

@Repository
public interface TipoRepository extends CrudRepository<Tipo, Integer>{

}
