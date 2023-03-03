package colecciones.lfca;

import java.util.*;

public class MisColecciones {

	public static void main(String[] args) {
		wrapperClass();
	}
	
	public void listasCollections() {
		List miLista = new ArrayList();
		
	}
	private void imprimir(Collection collection) {
		for (Object elementos : collection) {
			
		}
		
	}
	static void wrapperClass() {
		//byte, short, char, long, float, int, double 
		
		byte numeroB = 12; 
		System.out.println("Tamaño de un byte" + Byte.SIZE);
		System.out.println("Valor Max" + Byte.MAX_VALUE);
		System.out.println("Valor Min" + Byte.MIN_VALUE);
		System.out.println("---> " + numeroB);
		
		int numero1= 214748364;
		System.out.println("Tamaño de un entero bytes" + Integer.BYTES);
		System.out.println("Tamaño de un entero" + Integer.SIZE);
		System.out.println("Valor Max" + Integer.MAX_VALUE);
		System.out.println("Valor Min" + Integer.MIN_VALUE);
		System.out.println("---> " + numero1);

		byte numeroC = 123; 
		System.out.println("Tamaño de un short" + Short.SIZE);
		System.out.println("Valor Max" + Short.MAX_VALUE);
		System.out.println("Valor Min" + Short.MIN_VALUE);
		System.out.println("---> " + numeroC);
		
		byte numeroD = 124; 
		System.out.println("Tamaño de un long" + Long.SIZE);
		System.out.println("Valor Max" + Long.MAX_VALUE);
		System.out.println("Valor Min" + Long.MIN_VALUE);
		System.out.println("---> " + numeroD);
		
		byte numeroE = 125; 
		System.out.println("Tamaño de un Float" + Float.SIZE);
		System.out.println("Valor Max" + Float.MAX_VALUE);
		System.out.println("Valor Min" + Float.MIN_VALUE);
		System.out.println("---> " + numeroE);
		
		byte numeroF = 125; 
		System.out.println("Tamaño de un Double" + Double.SIZE);
		System.out.println("Valor Max" + Double.MAX_VALUE);
		System.out.println("Valor Min" + Double.MIN_VALUE);
		System.out.println("---> " + numeroF);
		
		
	}
	//Investigar tamaños de un primitivo short
	
	
}
