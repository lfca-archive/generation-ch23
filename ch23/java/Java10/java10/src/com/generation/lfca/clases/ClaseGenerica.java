package com.generation.lfca.clases;

public class ClaseGenerica <T> {
	//Esta es la clase generica. Se define con uno o varios parámetros de tipo genérico.
	//Los parámetros de tipo genérico son tipos que se especifican al definir la clase, 
	//pero que no se concretan hasta que se crea una instancia de la clase.

		T obj;

		public ClaseGenerica(T obj) {
			this.obj = obj;
		}
		public void claseTipo() {
			System.out.println("El tipo T es: " + obj.getClass().getName());
		}
		
}
