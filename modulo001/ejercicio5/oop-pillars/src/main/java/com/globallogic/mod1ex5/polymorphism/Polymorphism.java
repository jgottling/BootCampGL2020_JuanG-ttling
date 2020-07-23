package com.globallogic.mod1ex5.polymorphism;

import com.globallogic.mod1ex5.models.Cafetera;
import com.globallogic.mod1ex5.models.Electrodomestico;
import com.globallogic.mod1ex5.models.Heladera;
import com.globallogic.mod1ex5.models.Televisor;

public class Polymorphism {

    public static void main( String[] args )
    {
        Electrodomestico thing = new Electrodomestico();
        Heladera thing1 = new Heladera();
        Cafetera thing2 = new Cafetera();
        Televisor thing3 = new Televisor();
        
        Electrodomestico[] houseThings = {thing, thing1, thing2, thing3};

    	System.out.println("Recorriendo lista de electrodomésticos");
    	
    	for(Electrodomestico someThing : houseThings) {
    		someThing.encender();
    	}
    	
        System.exit(0);
    }
}
