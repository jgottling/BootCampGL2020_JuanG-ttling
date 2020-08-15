package com.globallogic.bootcampms.customer.models;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Value("${customer.id}")
	private Long id;
	
	@Value("${customer.dni}")
	private Long dni;
	
	@Value("${customer.name}")
	private String nombre;
	
	@Value("${customer.apellido}")
	private String apellido;
	
	@Override
	public String toString() {
		return "\nNombre: " + nombre + " " + apellido + "\n" +
				"DNI: " + dni + "\n" + 
				"ID: " + id;
	}
}
