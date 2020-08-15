package com.globallogic.bootcampgl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.dto.ProductDTO;
import com.globallogic.bootcampgl.service.impl.ProductServiceImpl;

/**
 * Product Service Controller
 */
@RestController
public class ProductServiceController {
	
	@Autowired
	ProductServiceImpl productService;
	
	@RequestMapping(value = "/products")
	  public ResponseEntity<Object> getProduct() {
	    return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
	  }
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public ResponseEntity<Object> createProduct(@RequestBody ProductDTO newProduct){
		productService.createProduct(newProduct);
		return new ResponseEntity<>("Product was CREATED sucessfully", HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody ProductDTO product){
		productService.updateProduct(id, product);
		return new ResponseEntity<>("Product was UPDATED sucessfully", HttpStatus.OK);

	}
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteProduct(@PathVariable("id") String id){
		productService.deleteProduct(id);
		return new ResponseEntity<>("Product was DELETED sucessfully", HttpStatus.OK);

	}
}
