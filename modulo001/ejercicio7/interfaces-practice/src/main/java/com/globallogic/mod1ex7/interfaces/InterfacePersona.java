package com.globallogic.mod1ex7.interfaces;

public interface InterfacePersona {
	public void hablar();
	public void dormir();
	public default void come() {
		System.out.println("Se ejecuta método de la clase Hombre"); 
	}
	
}
