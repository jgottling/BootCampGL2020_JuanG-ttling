package com.globallogic.mod1ex8;

public class Exceptions2 {

	public static void main(String[] args) {
    	try {
    		
    		int num[] = null;
    	      
    		System.out.println(num.toString());
 		
    	} catch (NullPointerException e) {
    		
    		System.out.println("Se produjo una excepción: null");
    	
    	} finally {
    	            
            System.exit(0);
    	}
	}
}
