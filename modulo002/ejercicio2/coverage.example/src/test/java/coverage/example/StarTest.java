package coverage.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coverage.example.model.Planet;
import coverage.example.model.Star;

public class StarTest {
	
	Star myStar;
	Planet myPlanet1;
	Planet myPlanet2;
	List<Planet> myPlanets;
	
	@BeforeEach
	void init() {
		myStar = new Star();
		myStar.setName("star1");
		
		myPlanet1 = new Planet();
		myPlanet1.setName("planet1");
		
		myPlanet2 = new Planet();
		myPlanet2.setName("planet2");
		
		myPlanets = new ArrayList<Planet>();
		myPlanets.add(myPlanet1);
		myPlanets.add(myPlanet2);
		
		myStar.setPlanets(myPlanets);
	}
	
	@Test
	@DisplayName("Name getter")
	void test1() {
		assertEquals("star1", myStar.getName());
	}
	
	@Test
	@DisplayName("Name setter")
	void test2() {
		myStar.setName("otherName");
		assertEquals("otherName",myStar.getName());
	}
	
	@Test
	@DisplayName("Color getter")
	void test3() {
		assertNull(myStar.getColor());
	}
	
	@Test
	@DisplayName("Planets getter")
	void test4() {
		assertEquals(2, myStar.getPlanets().size());
	}
	
	@Test
	@DisplayName("Planets setter")
	void test5() {
		myStar.setPlanets(null);
		assertNull(myStar.getPlanets());
	}
	
	@Test
	@DisplayName("Star to string")
	void test6() {
		assertEquals("Star [name=star1, planets=[Planet [name=planet1], Planet [name=planet2]]]",
						myStar.toString());
	}

	
	
}
