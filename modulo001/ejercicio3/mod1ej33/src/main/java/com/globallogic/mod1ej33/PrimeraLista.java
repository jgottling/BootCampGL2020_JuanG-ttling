package com.globallogic.mod1ej33;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista 
{
    public static void main( String[] args )
    {
        
    	List<Character> letters = new ArrayList<Character>();
    	letters.add('A');
    	letters.add('B');
    	letters.add('C');
    	
    	System.out.println(letters);
    	
    	letters.add(0, 'X');
    	
    	System.out.println(letters);
    }
}
