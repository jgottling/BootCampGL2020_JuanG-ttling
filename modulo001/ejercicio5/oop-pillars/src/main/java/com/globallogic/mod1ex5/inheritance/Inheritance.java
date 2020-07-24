package com.globallogic.mod1ex5.inheritance;

import com.globallogic.mod1ex5.models.Electrodomestico;
import com.globallogic.mod1ex5.models.Heladera;

public class Inheritance {

    public static void main( String[] args )
    {
        Electrodomestico thing = new Electrodomestico();
        Heladera thing1 = new Heladera();

        thing.setColor("Blanco");
        thing1.setColor("Metal");
        
    	System.out.println(thing.getColor());
    	System.out.println(thing1.getColor());
    	
        System.exit(0);
    }
}
