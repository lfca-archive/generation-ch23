package com.generation.lfca.ManejoExcepciones;

public class Division {
	private int numerador;
	private int denominador;
	
	
	public Division(int numerador, int denominador) {
	
		if (denominador == 0) {
			throw new OpExceptions("El denominador es un cero");
		}
		
		this.numerador = numerador;
		this.denominador = denominador;
	
	} 
	public void visualizarD() {
		System.out.println("El resultado de la division es: " +(this.numerador/this.denominador));
	}

}
