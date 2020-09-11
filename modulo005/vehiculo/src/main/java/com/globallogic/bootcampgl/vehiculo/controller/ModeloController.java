package com.globallogic.bootcampgl.vehiculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.vehiculo.dtos.ModeloDTO;
import com.globallogic.bootcampgl.vehiculo.service.ModeloService;

@RestController
public class ModeloController {

  @Autowired ModeloService modeloService;

  @GetMapping(value = "/modelos")
  public ResponseEntity<Object> getModelos() {
    return new ResponseEntity<>(modeloService.getModelos(), HttpStatus.OK);
  }

  @PostMapping(value = "/modelos")
  public ResponseEntity<Object> createModelo(@RequestBody ModeloDTO newModelo) {
    modeloService.createModelo(newModelo);
    return new ResponseEntity<>("Modelo was CREATED sucessfully", HttpStatus.CREATED);
  }

  @PutMapping(value = "/modelos/{id}")
  public ResponseEntity<Object> updateModelo(
      @PathVariable("id") String id, @RequestBody ModeloDTO modelo) {
    modeloService.updateModelo(id, modelo);
    return new ResponseEntity<>("Modelo was UPDATED sucessfully", HttpStatus.OK);
  }

  @DeleteMapping(value = "/modelo/{id}")
  public ResponseEntity<Object> deleteModelo(@PathVariable("id") String id) {
    modeloService.deleteModelo(id);
    return new ResponseEntity<>("Modelo was DELETED sucessfully", HttpStatus.OK);
  }
}
