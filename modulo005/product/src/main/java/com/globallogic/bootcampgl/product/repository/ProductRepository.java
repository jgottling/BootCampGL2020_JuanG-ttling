package com.globallogic.bootcampgl.product.repository;

import com.globallogic.bootcampgl.product.models.Product;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProductRepository {

	public Product getById(String id) {
		return Product.builder().id(id).name("Clavos").build();
	}
}
