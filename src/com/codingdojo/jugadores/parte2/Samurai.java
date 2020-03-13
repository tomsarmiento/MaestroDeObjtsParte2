package com.codingdojo.jugadores.parte2;

public class Samurai extends Human{
	{
		setHealth(200);
		
	}
	public void golpeMortal(Object h) {
		((Human) h).health=0;
		health/=2;
		System.out.println("Samurai just killed "+h.getClass().getSimpleName()+"!");
	}
	public void meditar() {
		health*=2;
		System.out.println("Samurai is meditating, health increased by "+(health)+" points");
	}
}
