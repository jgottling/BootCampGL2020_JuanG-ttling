package com.globallogic.mod1ex8;

public class Exceptions1 
{
    public static void main( String[] args )
    {
    	try {
    		
    		int num[] = {1, 2, 3, 4};
    	      System.out.println(num[5]);
 		
   		
    	} catch (Exception e) {
    		
    		System.out.println("Se produjo una excepción: Esto es una Excepción");
    	
    	} finally {
    	
    		System.out.println( " Esto se ejecuta sin importar si se presentan errores" );
            
            System.exit(0);
    	}
        
    }
}
