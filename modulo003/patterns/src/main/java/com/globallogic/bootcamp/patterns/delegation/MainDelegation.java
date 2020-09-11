package com.globallogic.bootcamp.patterns.delegation;

public class MainDelegation {
    public static void main( String[] args )
    {
    	ElectricalOven oven = new ElectricalOven();
        System.out.println( "Delegation practice" );
        System.out.println( "Oven power is: " + oven.getPower());
        
        oven.turnOn();
        System.out.println( "Oven power is: " + oven.getPower());
        
        oven.turnLed();
        System.out.println( "Oven power is: " + oven.getPower());
        
        System.exit(0);
    }
}
