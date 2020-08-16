package com.globallogic.bootcampgl.vehiculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.vehiculo.model.Vehiculo;
import com.globallogic.bootcampgl.vehiculo.service.VehiculoService;

@RestController
public class VehiculoControllerImpl{

	@Autowired
	VehiculoService vehiculoService;
	
	@RequestMapping(value = "/vehiculo")
	  public ResponseEntity<Object> getVehiculos() {
	    return new ResponseEntity<>(vehiculoService.getVehiculos(), HttpStatus.OK);
	  }
	
	@RequestMapping(value = "/vehiculo", method = RequestMethod.POST)
	public ResponseEntity<Object> createVehiculo(@RequestBody Vehiculo newVehiculo){
		vehiculoService.createVehiculo(newVehiculo);
		return new ResponseEntity<>("Vehiculo was CREATED sucessfully", HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/vehiculo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateVehiculo(@PathVariable("id") String id, @RequestBody Vehiculo vehiculo){
		vehiculoService.updateVehiculo(id, vehiculo);
		return new ResponseEntity<>("Vehiculo was UPDATED sucessfully", HttpStatus.OK);

	}
	
	@RequestMapping(value = "/vehiculo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteVehiculo(@PathVariable("id") String id){
		vehiculoService.deleteVehiculo(id);
		return new ResponseEntity<>("Vehiculo was DELETED sucessfully", HttpStatus.OK);

	}
}
