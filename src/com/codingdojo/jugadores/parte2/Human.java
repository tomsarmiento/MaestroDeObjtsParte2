package com.codingdojo.jugadores.parte2;

public class Human {
	int strength = 3;
	int intelligence = 3;
	int stealth = 3;
	int health = 100;
	
	//setters
	public void setStrength(int s) {
		strength = s;
	}
	public void setIntelligence(int i) {
		intelligence = i;
	}
	public void setStealth(int s) {
		stealth = s;
	}
	public void setHealth(int h) {
		health = h;
	}
	//atacar
	public void attack(Object human) throws InterruptedException {
		((Human) human).health-=strength;
		System.out.println(this.getClass().getSimpleName()+" just attacked "+human.getClass().getSimpleName());
	}
	
	public void mostrarSalud(String nombre) {
		System.out.println(nombre+"'s health is: "+health);
	}
}
