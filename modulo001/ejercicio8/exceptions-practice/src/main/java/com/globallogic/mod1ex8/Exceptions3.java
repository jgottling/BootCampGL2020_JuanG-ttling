package com.globallogic.mod1ex8;

public class Exceptions3 {
    public static void main( String[] args )
    {
    	try {
    		
    		int num[] = {1, 2, 3, 4};
    	      System.out.println(num[5]);
 		
    	} catch (ArrayIndexOutOfBoundsException e) {
    		System.out.println("Excepción: índice de array fuera de límites");
    	} finally {
            System.exit(0);
    	}
    }
}
