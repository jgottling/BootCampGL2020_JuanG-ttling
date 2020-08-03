package com.globallogic.bootcamp.patterns.singleton;

public class Currency {
	private String name;
	private static Currency instance;
	
	private Currency() {
		this.name = "ARS";
	}
	
	public static Currency getInstance() {
		if(instance == null) {
			instance = new Currency();
			
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
