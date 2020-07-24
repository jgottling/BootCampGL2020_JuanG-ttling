package com.globallogic.mod1ex4.ifExercises;

import java.util.Scanner;

public class IfEx3 {
	public static void main( String[] args ) {
		double purchaseAmount;
				
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Ingrese el monto de la compra");
		
		purchaseAmount = input.nextDouble();

		
		if (purchaseAmount == 300)
			System.out.println("El descuento es de 20%");
		else if (purchaseAmount >= 300)
			System.out.println("El descuento es de 25%");
		else
			System.out.println("Sin descuentos, el total es: " + purchaseAmount);
		
		input.close();
		
		System.exit(0);
	}


}
