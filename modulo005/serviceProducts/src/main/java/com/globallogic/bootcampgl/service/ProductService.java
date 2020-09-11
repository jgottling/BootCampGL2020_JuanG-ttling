package com.globallogic.bootcampgl.service;

import java.util.Collection;
import com.globallogic.bootcampgl.dto.ProductDTO;

/**
 * Product Service
 */
public interface ProductService {
	
	 public Collection<ProductDTO> getProducts();
	 public void createProduct(ProductDTO newProduct);
	 public void updateProduct(String id, ProductDTO newProduct);
	 public void deleteProduct(String id);

}
