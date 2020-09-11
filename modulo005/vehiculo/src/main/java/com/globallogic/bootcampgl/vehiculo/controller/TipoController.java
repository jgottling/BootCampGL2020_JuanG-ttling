package com.globallogic.bootcampgl.vehiculo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.vehiculo.dtos.TipoDTO;
import com.globallogic.bootcampgl.vehiculo.exceptions.EmptyValueException;
import com.globallogic.bootcampgl.vehiculo.service.TipoService;

@RestController
@RequestMapping("/tipos")
public class TipoController {

  @Autowired TipoService tipoService;

  @GetMapping
  public ResponseEntity<Object> getTipos() {
    return new ResponseEntity<>(tipoService.getTipos(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<String> createTipo(@RequestBody TipoDTO newTipo) {

    if (newTipo.getPuertas().equals("") || Objects.isNull(newTipo.getPuertas()))
      throw new EmptyValueException("puertas");

    tipoService.createTipo(newTipo);
    return new ResponseEntity<>("Tipo CREADO exitosamente", HttpStatus.CREATED);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<String> updateTipo(
      @PathVariable("id") String id, @RequestBody TipoDTO tipo) {
    tipoService.updateTipo(id, tipo);
    return new ResponseEntity<>("Tipo ACTUALIZADO correctamente", HttpStatus.OK);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<String> deleteTipo(@PathVariable("id") String id) {
    tipoService.deleteTipo(id);
    return new ResponseEntity<>("Tipo BORRADO exitosamente", HttpStatus.OK);
  }
}
