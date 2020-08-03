package com.globallogic.bootcamp.patterns.dependencyInjection;

public class MainDepInj {

	public static void main( String[] args ) {
		Game residentEvil = new Game("Resident Evil");
		Game brawlhalla = new Game("Brawlhalla");
		
		PlayStation play = new PlayStation(residentEvil);
		
		System.out.println(play.askMyGame());
		
		play.setVideogame(brawlhalla);
		
		System.out.println(play.askMyGame());
		
		play.setVideogame(null);
		
		System.out.println(play.askMyGame());
		
        System.exit(0);
	}
}
