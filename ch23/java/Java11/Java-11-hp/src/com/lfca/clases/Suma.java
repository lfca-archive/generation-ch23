package com.lfca.clases;

public class Suma implements OperacionesAritmeticas, Mensajes{
	/*Va a implementar a interfaz*/
	/*Extense es herencia simple*/
	/*Al agregar extense es herencia multiple*/
	private double a; 
	private double b; 
	
	public Suma() {
		super();
	}

	public Suma(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void mensaje() {
		System.out.println("Hola soy una suma");
	}

	@Override
	public void mensajes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double resta() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}