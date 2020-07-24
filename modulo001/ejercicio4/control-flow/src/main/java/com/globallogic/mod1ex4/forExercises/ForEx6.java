package com.globallogic.mod1ex4.forExercises;

public class ForEx6 {
	public static void main( String[] args ) {
		
		String[] daysOfWeek = {
		                       "Lunes", "Martes", "Miércoles",
		                       "Jueves", "Viernes", "Sábado", "Domingo"};
				
		for (int i=0; i<7; i++){
			System.out.println("Día de la semana: " + daysOfWeek[i]);	
		}
				
		System.exit(0);
	}
}
