package com.globallogic.mod1ex5.models;

public class Heladera extends Electrodomestico {

	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	
//	public Heladera() {
//		super();
//	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isTieneFreezer() {
		return tieneFreezer;
	}

	public void setTieneFreezer(boolean tieneFreezer) {
		this.tieneFreezer = tieneFreezer;
	}

	public double getCapacidadFreezer() {
		return capacidadFreezer;
	}

	public void setCapacidadFreezer(double capacidadFreezer) {
		this.capacidadFreezer = capacidadFreezer;
	}
	
	public void encender() {
		System.out.println("Encendiendo heladera");
	}
	
	
}
