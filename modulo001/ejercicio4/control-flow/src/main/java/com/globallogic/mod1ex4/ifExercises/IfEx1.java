package com.globallogic.mod1ex4.ifExercises;
import java.util.Scanner;

public class IfEx1 {

	public static void main( String[] args ) {
		int number1;
		int number2;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Ingrese el primer número");
		
		number1 = input.nextInt();
		
		System.out.println("Ingrese el segundo número");
		
		number2 = input.nextInt();
		
		if (!((number1 + number2) <= 10))
			System.out.println("La suma de los números es mayor a 10");
		
		input.close();
		
		System.exit(0);
	}
}