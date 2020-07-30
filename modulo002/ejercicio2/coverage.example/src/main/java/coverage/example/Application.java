package coverage.example;

import coverage.example.model.Galaxy;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Esto es una prueba");
		System.out.println("mostrando la galaxia:"+ new Galaxy("ViaLactea").name);
	}
}
