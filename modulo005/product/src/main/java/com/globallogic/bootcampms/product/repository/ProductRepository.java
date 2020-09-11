package com.globallogic.bootcampms.product.repository;

import com.globallogic.bootcampms.product.models.Product;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProductRepository {

	public Product getById(String id) {
		return Product.builder().id(id).name("Clavos").build();
	}
}
