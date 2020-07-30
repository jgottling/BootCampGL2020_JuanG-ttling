package coverage.example.model;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class Galaxy {

	public String name;
	public List stars;
	
	public Galaxy(String name)
	{
		this.name=name;
		stars= new ArrayList();
	}
	
	
}
