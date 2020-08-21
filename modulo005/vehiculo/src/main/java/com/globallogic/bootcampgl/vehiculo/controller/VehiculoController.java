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

import com.globallogic.bootcampgl.vehiculo.dtos.VehiculoDTO;
import com.globallogic.bootcampgl.vehiculo.service.VehiculoService;

@RestController
public class VehiculoController{

	@Autowired
	VehiculoService vehiculoService;
	
	@GetMapping(value = "/vehiculos")
	  public ResponseEntity<Object> getVehiculos() {
	    return new ResponseEntity<>(vehiculoService.getVehiculos(), HttpStatus.OK);
	  }
	
	@PostMapping(value = "/vehiculos")
	public ResponseEntity<Object> createVehiculo(@RequestBody VehiculoDTO newVehiculo){
		vehiculoService.createVehiculo(newVehiculo);
		return new ResponseEntity<>("Vehiculo was CREATED sucessfully", HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/vehiculos/{id}")
	public ResponseEntity<Object> updateVehiculo(@PathVariable("id") String id, @RequestBody VehiculoDTO vehiculo){
		vehiculoService.updateVehiculo(id, vehiculo);
		return new ResponseEntity<>("Vehiculo was UPDATED sucessfully", HttpStatus.OK);

	}
	
	@DeleteMapping(value = "/vehiculos/{id}")
	public ResponseEntity<Object> deleteVehiculo(@PathVariable("id") String id){
		vehiculoService.deleteVehiculo(id);
		return new ResponseEntity<>("Vehiculo was DELETED sucessfully", HttpStatus.OK);

	}
}
