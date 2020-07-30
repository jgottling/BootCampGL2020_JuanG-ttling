package coverage.loteria;

import coverage.loteria.model.CartonGenerator;

public class Loteria {
	private float pozo;
	private int boletos;
	private int ganadores;
	private CartonGenerator cartonGenerator;
	
	
	public Loteria(float pozo, int boletos, CartonGenerator cartonGenerator) {
		this.pozo = pozo;
		this.boletos = boletos;
		this.cartonGenerator = cartonGenerator;
		this.ganadores = 0;
	}

	public float getPozo() {
		return pozo;
	}
	
	public int getBoletos() {
		return boletos;
	}
	
	public int getGanadores() {
		return ganadores;
	}

	public void jugada()
	{
		for(int i=0;i<boletos;i++)
		{
			if(cartonGenerator.isGanador()) {
				ganadores++;
			}
		}
	}
	
	public boolean hayGanadorUnico()
	{
		if(ganadores == 1)
			return true;
		else 
			return false;
	}
	
	public boolean hayCuadrupleGanador()
	{
		if(ganadores == 4)
			return true;
		else 
			return false;
	}			
}
