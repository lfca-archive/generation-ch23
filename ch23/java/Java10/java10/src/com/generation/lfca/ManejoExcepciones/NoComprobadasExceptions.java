package com.generation.lfca.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.println("Introduzca un valor: ");
		int divisor;
		
		try {
			divisor = Integer.parseInt(dato.next());
			int division = 10/divisor;
			System.out.println("-->" + division);
		} catch (ArithmeticException e) {
			//e = objeto
			System.out.println("Capturando la exception " + e.getMessage());
		} catch(NumberFormatException nfe) {
			System.out.println("el dato es un caracter " + nfe.getMessage());
		} finally {
			System.out.println("Este block es opcional y se va a ejecutar con o sin la excepción");
		}
		//Cuando funcion es static no tenemos que llamar al objeto
		//Wrapper class encapsula a otra para darle más funcionalidad
		
		System.out.println("continuamos con el flujo de la aplicación");
		
	}
	
}
