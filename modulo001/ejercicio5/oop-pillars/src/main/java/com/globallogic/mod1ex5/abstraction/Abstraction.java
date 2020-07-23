package com.globallogic.mod1ex5.abstraction;

import com.globallogic.mod1ex5.models.Berlina;

public class Abstraction {
    
	public static void main( String[] args )
    {
        Berlina myCar = new Berlina();
		
        myCar.avanzar();
        myCar.retoceder();
        
        System.exit(0);
    }
}
