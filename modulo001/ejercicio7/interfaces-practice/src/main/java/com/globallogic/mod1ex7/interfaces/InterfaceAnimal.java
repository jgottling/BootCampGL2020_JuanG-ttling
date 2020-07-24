package com.globallogic.mod1ex7.interfaces;

public interface InterfaceAnimal {

	public void dormir();
	public void sonidoAnimal();
	
	public default void come(String animal) {
		System.out.println("El " + animal + " se alimenta");
	}
	
	public static void camina(String animal) {
		System.out.println("El " + animal + " camina");
	}
	
}
