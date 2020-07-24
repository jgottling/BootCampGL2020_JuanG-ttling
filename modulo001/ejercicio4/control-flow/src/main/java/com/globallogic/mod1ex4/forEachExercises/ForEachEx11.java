package com.globallogic.mod1ex4.forEachExercises;

public class ForEachEx11 {
	
	public static void main( String[] args ) {
		String word = "Bootcamp 2020";
		
		for (char letter : word.toCharArray()) {
			System.out.println("Letra " + letter );
		}
				
		System.exit(0);
	}
}
