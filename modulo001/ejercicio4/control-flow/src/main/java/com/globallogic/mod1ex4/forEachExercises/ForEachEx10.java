package com.globallogic.mod1ex4.forEachExercises;

public class ForEachEx10 {
	
	public static void main( String[] args ) {
		String[] daysOfWeek = {
							"Lunes", "Martes", "Miércoles",
							"Jueves", "Viernes", "Sábado", "Domingo"
							};
		
		for (String day : daysOfWeek) {
			System.out.println("Día de la semana " + day );
		}
				
		System.exit(0);
	}
}
