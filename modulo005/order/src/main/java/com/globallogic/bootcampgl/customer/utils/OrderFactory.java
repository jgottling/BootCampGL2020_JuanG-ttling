package com.globallogic.bootcampgl.customer.utils;

import com.globallogic.bootcampgl.order.models.Order;

public class OrderFactory {

	public static Order getNewOrder() {
		return Order.builder()
				.productName("C-00221").count(1000l).customerId(12342l)
				.build();
	}
	
}
