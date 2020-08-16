package com.globallogic.bootcampgl.vehiculo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.globallogic.bootcampgl.vehiculo.model.Modelo;

@Repository
public interface ModeloRepository extends CrudRepository<Modelo, Integer>{

}
