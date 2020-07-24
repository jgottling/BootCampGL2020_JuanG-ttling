package com.globallogic.mod1ex6.models;

public abstract class Persona {
	private String nombre;
	private int numeroDeHijos;
	private boolean casado;
	private int dni;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNumeroDeHijos() {
		return numeroDeHijos;
	}
	public void setNumeroDeHijos(int numeroDeHijos) {
		this.numeroDeHijos = numeroDeHijos;
	}
	
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	public abstract String toString();
}