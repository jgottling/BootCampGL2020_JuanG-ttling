package com.globallogic.bootcamp.patterns.singleton;

public class Product {
	private String name;
	private static Product instance;
	
	private Product() {
		this.setName("Clavos");
	}
	
	public static Product getInstance() {
		if(instance == null) {
			instance = new Product();
			
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
