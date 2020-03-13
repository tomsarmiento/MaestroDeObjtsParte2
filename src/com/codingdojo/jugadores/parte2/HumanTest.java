package com.codingdojo.jugadores.parte2;

public class HumanTest {

	public static void main(String[] args) throws InterruptedException {
		
		Wizard w = new Wizard();
		Ninja n = new Ninja();
		Samurai s = new Samurai();
		
		w.attack(n);
		n.attack(w);
		s.attack(n);
		w.bolaDeFuego(s);
		s.golpeMortal(n);
		n.mostrarSalud("Ninja");
		w.curar(n);
		n.mostrarSalud("Ninja");
		System.out.println("Ninja says: Thanks for healing me! all good?");
		System.out.println("Wizard says: As long as you dont betray us!");
		System.out.println("Ninja says: Uh, sorry about that...");
		n.robar(w);
		n.escapar();
		

	}

}
