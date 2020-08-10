package coverage.example.model;

import java.util.List;

public class Star {

	private String name, color;
	private List<Planet> planets;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public List<Planet> getPlanets() {
		return planets;
	}
	public void setPlanets(List<Planet> planets) {
		this.planets = planets;
	}
	
	
	@Override
	public String toString() {
		return "Star [name=" + name + ", planets=" + planets + "]";
	}
	
   	
	
	
}
