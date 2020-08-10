package coverage.example.model;

public class Planet {
	
	public String name;

	@Override
	public String toString() {
		return "Planet [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
