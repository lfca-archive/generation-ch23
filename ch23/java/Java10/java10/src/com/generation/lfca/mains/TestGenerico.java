package com.generation.lfca.mains;

import com.generation.lfca.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(55);
		ClaseGenerica<String> caracteresObj = new ClaseGenerica<String>("Prueba");
		
		intObj.claseTipo();
		caracteresObj.claseTipo();

	}

}