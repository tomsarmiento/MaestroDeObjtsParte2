package com.codingdojo.jugadores.parte2;

public class Ninja extends Human{
	{
		setStealth(10);
		
	}
	public void robar(Object h) {
		((Human) h).health-=stealth;
		health+=stealth;
		System.out.println("Ninja just stole "+stealth+" points of health from "+h.getClass().getSimpleName());
	}
	public void escapar() {
		health-=10;
		System.out.println("Ninja just escaped");
	}
}
