package com.globallogic.debugapp;

import java.util.ArrayList;

public class Celula {
	private int numero;
	private Referente referente;
	private ArrayList<Alumno> alumnos;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Referente getReferente() {
		return referente;
	}
	
	public void setReferente(Referente referente) {
		this.referente = referente;
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
}
