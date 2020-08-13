package com.globallogic.bootcampgl.product.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private String id;
	private String name;
	
	@Override
	public String toString() {
		return "\nProduct: " + name + "\n" +
				"ProductID: " + id + "\n" ; 
	}
}
