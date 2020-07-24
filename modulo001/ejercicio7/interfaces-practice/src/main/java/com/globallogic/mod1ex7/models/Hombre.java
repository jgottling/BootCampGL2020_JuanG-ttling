package com.globallogic.mod1ex7.models;

import com.globallogic.mod1ex7.interfaces.InterfaceAnimal;
import com.globallogic.mod1ex7.interfaces.InterfacePersona;

public class Hombre implements InterfaceAnimal, InterfacePersona {

	@Override
	public void hablar() {
		 System.out.println("Las personas hablan mucho"); 
	}

	@Override
	public void dormir() {
		System.out.println("El hombre duerme muchas horas"); 
	}

	@Override
	public void sonidoAnimal() {
		System.out.println("El hombre no hace sonidos de animal"); 
	}
	
	public static void main( String[] args ) {
		Hombre someone = new Hombre();
		
		someone.dormir();
		someone.hablar();
		someone.sonidoAnimal();
		someone.come();
		
		System.exit(0);
	}

}