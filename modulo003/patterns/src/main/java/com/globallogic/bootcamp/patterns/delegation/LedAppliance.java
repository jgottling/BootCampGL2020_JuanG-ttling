package com.globallogic.bootcamp.patterns.delegation;

public class LedAppliance {

	private ElectricalOven myOven;
	
	public LedAppliance(ElectricalOven someOven) {
		this.myOven = someOven;
	}
	
	public void turnOn() {
		myOven.consumePower(100);
	}
}
