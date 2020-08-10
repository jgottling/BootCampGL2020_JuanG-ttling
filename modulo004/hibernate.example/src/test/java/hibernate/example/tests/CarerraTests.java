package hibernate.example.tests;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.h2.util.DateTimeUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.sun.istack.logging.Logger;

import hibernate.example.daos.CarreraDao;
import hibernate.example.daos.CorredorDao;
import hibernate.example.models.Carrera;
import hibernate.example.models.Corredor;

public class CarerraTests {
	private static CarreraDao carreraDao;
	private static CorredorDao corredorDao;
	
	@BeforeAll
	static void init() throws ParseException {
		Corredor corredor1 = new Corredor(2, "Sebastian Loeb");
		Corredor corredor2 = new Corredor(3, "Marcus Gronholm");
		Corredor corredor3 = new Corredor(7, "Carlos Sainz");
		Corredor corredor4 = new Corredor(11, "Carlos Sainz");
		Date fechaCarrera =new SimpleDateFormat("yyyy-MM-dd").parse("2020-07-17"); 
		Carrera carrera1 = new Carrera(fechaCarrera,"Gran Carrera Global");
		
		carrera1.addCompetidor(corredor1);
		
		corredorDao = new CorredorDao();
		carreraDao = new CarreraDao();

		carreraDao.createCarrera(carrera1);
		
		corredorDao.createCorredor(corredor1);
		corredorDao.createCorredor(corredor2);
		corredorDao.createCorredor(corredor3);
		corredorDao.createCorredor(corredor4);
		
		
	}
	
	@Test
	@DisplayName("Get Carrera")
	void test1() {
		assertEquals(
				"Carrera: {fecha: 2020-07-17 00:00:00.0, nombre: Gran Carrera Global, competidores: [{número:2, Nombre:Sebastian Loeb}, {número:2, Nombre:Sebastian Loeb}, ]}",
					carreraDao.getCarreraById(1l).toString());
	}
	
	@Test
	@DisplayName("Update Carrera")
	void test2() {
			Carrera carrera3 = new Carrera( new Date(), "Test");
			
			carreraDao.createCarrera(carrera3);
			
			carrera3.setNombre("TestUpdate");
			
			carreraDao.updateCarrera(carrera3);
			
						
			assertEquals("TestUpdate", carreraDao.getCarreraById(2l).getNombre());
	}
		
}
