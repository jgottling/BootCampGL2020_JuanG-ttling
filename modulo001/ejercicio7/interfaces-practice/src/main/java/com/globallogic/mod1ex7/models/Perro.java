package com.globallogic.mod1ex7.models;

import com.globallogic.mod1ex7.interfaces.InterfaceAnimal;

public class Perro implements InterfaceAnimal {

	@Override
	public void dormir() {
		System.out.println("zZzZzZzZzZzZz");
	}

	@Override
	public void sonidoAnimal() {
		System.out.println("El perro hace guau guau");
	}
}
