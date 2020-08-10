package com.globallogic.bootcamp.patterns.delegation;

public class ElectricalOven extends ElectricalAppliance {

	private LedAppliance myLed;
	
	public ElectricalOven() {
		
		this.myLed = new LedAppliance (this);
	}
	
	public void turnOn() {
		consumePower(75);
	}
	
	public void turnLed() {
		myLed.turnOn();
	}
}
