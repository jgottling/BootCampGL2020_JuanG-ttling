package com.globallogic.mod1ex5.models;

public class Televisor extends Electrodomestico{
	private double pulgadas;
	private String resolucion;
	
//	public Televisor() {
//		super();
//	}

	public double getPulgadas() {
		return pulgadas;
	}



	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}



	public String getResolucion() {
		return resolucion;
	}



	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}


	public void cambiarCanal(int canal) {
		System.out.println("Cambiando al canal " + canal);
	}
	
	public void encender() {
		System.out.println("Encendiendo televisor");
	}
}
