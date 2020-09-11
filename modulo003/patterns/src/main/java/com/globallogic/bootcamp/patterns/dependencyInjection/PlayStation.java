package com.globallogic.bootcamp.patterns.dependencyInjection;

public class PlayStation {
	private Game videogame;
	
	public PlayStation(Game someGame) {
		this.videogame = someGame;
	}

	public Game getVideogame() {
		return videogame;
	}

	public void setVideogame(Game videogame) {
		this.videogame = videogame;
	}
	
	public String askMyGame() {
				
		return (videogame == null) ?
				"¡Estoy vacío!" : 
				"El videojuego que estoy corriendo es: " + videogame.getTitle();
	}
}
