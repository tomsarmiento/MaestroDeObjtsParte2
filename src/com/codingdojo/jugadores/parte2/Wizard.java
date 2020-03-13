package com.codingdojo.jugadores.parte2;

public class Wizard extends Human{
	{
	setHealth(50);
	setIntelligence(8);
	
	
	}
	public void curar(Object h) {
		((Human) h).health+=intelligence;
		System.out.println("Wizard just healed "+h.getClass().getSimpleName()+" in "+intelligence+" points");
	}
	public void bolaDeFuego(Object h) {
		((Human) h).health-=(3*intelligence);
		System.out.println("Wizard damaged "+h.getClass().getSimpleName()+" in "+(3*intelligence)+" points");
	}
}
