package com.globallogic.bootcampgl.vehiculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.globallogic.bootcampgl.vehiculo.model.Tipo;
import com.globallogic.bootcampgl.vehiculo.service.TipoService;

@RestController
@RequestMapping("/tipos")
public class TipoController {

	@Autowired
	TipoService tipoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Object> getTipos() {
		
		return new ResponseEntity<>(tipoService.getTipos(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> createTipo(@RequestBody Tipo newTipo) {
		tipoService.createTipo(newTipo);
		return new ResponseEntity<String>("Tipo CREADO exitosamente", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<String> updateTipo(@PathVariable("id") String id, @RequestBody Tipo tipo) {
		tipoService.updateTipo(id, tipo);
		return new ResponseEntity<String>("Tipo ACTUALIZADO correctamente", HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteTipo(@PathVariable("id") String id) {
		tipoService.deleteTipo(id);
		return new ResponseEntity<String>("Tipo BORRADO exitosamente", HttpStatus.OK);
	}

}
