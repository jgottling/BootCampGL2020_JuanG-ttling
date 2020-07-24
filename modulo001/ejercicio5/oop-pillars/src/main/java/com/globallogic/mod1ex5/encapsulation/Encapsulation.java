package com.globallogic.mod1ex5.encapsulation;

import com.globallogic.mod1ex5.models.Gato;

public class Encapsulation {
	
    public static void main( String[] args )
    {
        Gato blackCat = new Gato();
        
        blackCat.setNombre("Salem");
        blackCat.setPatas(4);
        
        System.out.println("El gato se llama " + blackCat.getNombre());
        System.out.println("Tiene " + blackCat.getPatas() + " patas");
        
        System.exit(0);
    }
}
