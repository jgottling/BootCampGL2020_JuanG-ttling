package com.globallogic.mod1ex4.forExercises;

public class ForEx5 {
	public static void main( String[] args ) {
		
		int counter = 0;
		
		for (int i=0; i<1001; i++){
			if (i%20 == 0) counter ++;
		}
		
		System.out.println(counter);
		
		System.exit(0);
	}
}
