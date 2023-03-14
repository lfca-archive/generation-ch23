package pruebasunit.lfca.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import pruebasunit.lfca.app.Calculadora;

class CalculadoraTest {
private Calculadora ct;
private Calculadora ct1 = null;

	@BeforeEach 
	public void configurandoBefore() {
		// TODO Auto-generated method stub
		ct = new Calculadora();
		System.out.println("Ejecutando Before --> configurandoBefore()");

	}
	
	@AfterEach
	public void configurandoAfter() {
		ct = null;
		// TODO Auto-generated method stub
		System.out.println("Ejecutando AfterEach()--->configurandoAfter()");
		System.out.println("------*****");
	}
	
	@Test
	public void calculadoraNull() {
		//si assert null si existe un caso de prueba, regresa valores booleanos
		assertNull(ct1, "La clase es una instancia no nula");
		System.out.println("ejecutando primer test ---> calculadora ");
	}
	
	@Test
	public void calculadoraNotNull() {
		//si assert null si existe un caso de prueba, regresa valores booleanos
		assertNotNull(ct, "La clase esta instanciada");
		System.out.println("ejecutando segundo test ---> calculadora");
	}
	
	/*PRUMERAS PRUEBAS*/
	
	/*
	 * 1. Indicar que se va a evaluar
	 * 2. Indica rlo que se va a realizar 
	 * 3. Realizar con el assert indicado
	 */

	public void primerosAssert() {
	int ResultadoEsperado =10;
	int resultadoActual
	resultadoActual = ct.sumar(6,4);
	assertEquals(resultadoEsperado, resultadoActual);
	System.out.println("Ejecutando tercer test ----> primerosAssert");
	}
	@Test
	public void sumaTest() {
		Calculadora calculadora = new Calculadora();
		assertEquals(20, calculadora.sumar(10,10));
		System.out.println("Ejecutando cuarto test ----> primerosAssert()");
	}
}
	/*************** TIPOS TEST ***********************/
@Test
public void tiposAsserts() {
	assertTrue(1 == 1);
	assertEquals("Generation","Generation");
	assertNull(ct);
	/*assertSame: comprobar que son iguales?*/
	Calculadora c1 = new Calculadora();
	Calculadora c2 = new Calculadora();
	Calculadora c3 = new Calculadora();
	Calculadora c4 = c1;
	assertSame(c2,c3);
	/*c2 y c3 están declarados con la misma clase, pero no son iguales*/
	/*pero en el caso de c4, si son lo mismo*/
	
	/*assertnotsame: comprobar que no son iguales*/
	assertNotSame(c1,c3); 
	/*En este caso, saldrán que no son iguales, ya que es lo contrario a assertSame*/
	
}

@Test
public void validandoSuma() {
	assertEquals(11, ct.sumar(5,6));
}

@Test
public void validandoResta() {
	assertEquals(50, ct.restar(56,6));
}

@Test
public void validanndoRestaNegativa() {
	assertEquals(-10, ct.restar(1,20));
}
@Test
public void validandoDivision() {
	assertEquals(2, ct.dividir(10,5));
}

@Disabled("En espera")
@Test
public void validandoByZero() {
	assertThrows(ArithmeticException.class, () -> ct.divisionByZero(10,1), "No se puede dividir por cero");
}
/*Prueba Unitaria: prueba a una porcion de código, a un método en específico*/




