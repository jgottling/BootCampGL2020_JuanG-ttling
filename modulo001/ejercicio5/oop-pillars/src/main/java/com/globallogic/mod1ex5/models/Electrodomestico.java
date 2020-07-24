package com.globallogic.mod1ex5.models;

public class Electrodomestico {
	private String marca;
	private double peso;
	private String color;
	
//	public Electrodomestico() {
//		encender();
//	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void  encender() {System.out.println("Encendiendo electrodoméstico");}
	
	
	
}
