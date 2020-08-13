package com.globallogic.bootcampms.customer.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	private Long id;
	private Long dni;
	private String nombre;
	private String apellido;
	
	@Override
	public String toString() {
		return "\nNombre: " + nombre + " " + apellido + "\n" +
				"DNI: " + dni + "\n" + 
				"ID: " + id;
	}
}
