package com.globallogic.bootcamp.patterns.delegation;

public class ElectricalAppliance {

	protected int power = 500;
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void turnOn() {
		consumePower(50);
	}
	
	public void consumePower(int amount) {
		this.power -= amount;
	}
}
