package com.globallogic.mod1ex7;

import com.globallogic.mod1ex7.interfaces.InterfaceAnimal;
import com.globallogic.mod1ex7.models.Perro;

public class MainAnimal 
{
    public static void main( String[] args )
    {
    	Perro dog = new Perro();
    	
    	dog.dormir();
    	dog.sonidoAnimal();
    	dog.come("perro");
    	InterfaceAnimal.camina("perro");
    	
    	System.exit(0);
    }
}
