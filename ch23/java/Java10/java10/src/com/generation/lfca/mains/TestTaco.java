package com.generation.lfca.mains;

import com.generation.lfca.clases.Taco;
import com.generation.lfca.clases.TacoQueto;

public class TestTaco {
	public static void main(String[] args) {
		Taco tq = new Taco("maiz", "carne", 5, "mediana", 15);
	
		TacoQueto tn = new TacoQueto();
		
		
		tq.setGuisado("pollo");
		System.out.println("Tu taco es de " + tq.getGuisado());
		
		tq.setPrecio(15.0);
		System.out.println("El taco te sale en: " + tq.getPrecio() + " pesos");
		
		tn.subirPrecio();
		
		tn.vender(3);
		System.out.println("Son " + tn.vender(3) + " pesos de 3 tacos ");
		
	
		System.out.println(tq.toString());
		
	}
}
