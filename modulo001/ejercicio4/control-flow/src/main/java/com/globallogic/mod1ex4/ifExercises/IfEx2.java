package com.globallogic.mod1ex4.ifExercises;
import java.util.Scanner;

public class IfEx2 {
	public static void main( String[] args ) {
		Character letter1;
		Character letter2;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Ingrese la primera letra");
		
		letter1 = input.next().charAt(0);
		
		isUpper(letter1);
		
		System.out.println("Ingrese la segunda letra");
		
		letter2 = input.next().charAt(0);
		
		isUpper(letter2);
		
		input.close();
		
		System.exit(0);
	}
	
	public static void isUpper(char letter) {
		if (Character.isUpperCase(letter))
			System.out.println("La letra está en mayúscula");
		else System.out.println("La letra está en minúscula");
	}
}
