package com.globallogic.mod1ex6.models;

public class Empleado extends Persona {
	private int id;
	private double sueldoBase;
	private int horasExtra;
	private static double precioHoraExtra = 4;
	private double tipoIRPF;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtra() {
		return horasExtra;
	}
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public static double getPrecioHoraExtra() {
		return precioHoraExtra;
	}
	public static void setPrecioHoraExtra(double precioHoraExtra) {
		Empleado.precioHoraExtra = precioHoraExtra;
	}

	public double getTipoIRPF() {
		return tipoIRPF;
	}
	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}
	
	public Empleado() {
		
	}
	
	public Empleado(int unDNI) {
		this.setDni(unDNI);
	}
	
	@Override
	public String toString() {
		return this.getId() + " " + this.getNombre() + "\n" +
		  "Sueldo Base: " + this.getSueldoBase() + "\n" +   
		  "Horas Extras: " + this.getHorasExtra()  + "\n" +
		  "Tipo IRPF: " + this. getTipoIRPF() + "\n" + 
		  "Casado: " + this.isCasado() + "\n" +
		  "Número de Hijos: " + this.getNumeroDeHijos() + "\n"  
		;
	}

	public double calcularMontoHorasExtra() {
		return Empleado.getPrecioHoraExtra() * this.getHorasExtra();
	}
	
	private double calcularSueldoBruto() {
		return this.getSueldoBase() + this.calcularMontoHorasExtra();
	}
	
	private double calcularRetencionIRPF() {
		return this.isCasado() ?
				this.getTipoIRPF() - 0.02 - this.getNumeroDeHijos() :
					this.getTipoIRPF() - this.getNumeroDeHijos();
	}
	
	public double getSalario() {
		return this.calcularSueldoBruto() * (1 - this.calcularRetencionIRPF()) + this.calcularMontoHorasExtra();
	}

}
