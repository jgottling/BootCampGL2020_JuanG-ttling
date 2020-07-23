package com.globallogic.mod1ex5.models;

public class Cafetera extends Electrodomestico {

	private double litros;
	
//	public Cafetera() {
//		super();
//	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
	
	public void elegirSabor(String sabor) {
		System.out.println("Elegiste el sabor " + sabor);
	}
	
	public void encender() {
		System.out.println("Encendiendo cafetera");
	}
	
}
