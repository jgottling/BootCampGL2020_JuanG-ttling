package com.globallogic.bootcampgl.vehiculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.vehiculo.model.Modelo;
import com.globallogic.bootcampgl.vehiculo.service.ModeloService;


@RestController
public class ModeloController {

	@Autowired
	ModeloService modeloService;
	
	@RequestMapping(value = "/modelos")
	  public ResponseEntity<Object> getModelos() {
	    return new ResponseEntity<>(modeloService.getModelos(), HttpStatus.OK);
	  }
	
	@RequestMapping(value = "/modelos", method = RequestMethod.POST)
	public ResponseEntity<Object> createModelo(@RequestBody Modelo newModelo){
		modeloService.createModelo(newModelo);
		return new ResponseEntity<>("Modelo was CREATED sucessfully", HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/modelos/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateModelo(@PathVariable("id") String id, @RequestBody Modelo modelo){
		modeloService.updateModelo(id, modelo);
		return new ResponseEntity<>("Modelo was UPDATED sucessfully", HttpStatus.OK);

	}
	
	@RequestMapping(value = "/vehiculo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteModelo(@PathVariable("id") String id){
		modeloService.deleteModelo(id);
		return new ResponseEntity<>("Modelo was DELETED sucessfully", HttpStatus.OK);

	}
}
