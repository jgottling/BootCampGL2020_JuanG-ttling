package hibernate.example.app;

import hibernate.example.daos.AlumnoDaoImpl;
import hibernate.example.models.Alumno;

public class ExampleApplication {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno("Jose", "Perez");
		Alumno alumno2 = new Alumno("Esteban", "Quito");
		Alumno alumno3 = new Alumno("Ulrica", "Godofreda");
		
		AlumnoDaoImpl dao = new AlumnoDaoImpl();
		
		System.out.println("\n Creando primer alumno...");
		dao.createAlumno(alumno1);
		
		System.out.println("\n Creando segundo alumno...");
		dao.createAlumno(alumno2);

		System.out.println("\n Creando tercer alumno");
		dao.createAlumno(alumno3);
	
		System.out.println("\n Buscando todos los alumnos...");
		System.out.println(dao.getAlumnos());
		
		System.out.println("\n Cambiando el nombre de Quito...");
		alumno2.setNombre("Estefano");
		dao.updateAlumno(alumno2);
		
		System.out.println("\n Buscando todos los alumnos...");
		System.out.println(dao.getAlumnos());
		
		System.out.println("\n Buscando y eliminando a Jose Perez...");
		dao.removeAlumno(alumno1);
		
		System.out.println("\n Buscando todos los alumnos...");
		System.out.println(dao.getAlumnos());
		
		System.exit(0);
	}

}
