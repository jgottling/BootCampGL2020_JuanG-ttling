package com.globallogic.bootcampms.order.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	private String productName;
	private Long count;
	private Long customerId;
	
	@Override
	public String toString() {
		return "\nProduct: " + productName + "\n" +
				"Count: " + count + "\n" + 
				"Customer ID: " + customerId;
	}
}
