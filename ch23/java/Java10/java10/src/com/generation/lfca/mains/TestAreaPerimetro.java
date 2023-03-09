package com.generation.lfca.mains;

import com.generation.lfca.clases.AreaPerimetro;
import com.generation.lfca.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		
		AreaPerimetro ap = new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();
		//fg.setArea(ap.areaCuadrado(5));
		//System.out.println("Area de Cuadrado---> " + fg.getArea());
		
		//fg.setPerimetro(ap.perimetroCuadrado(5));
		//System.out.println("Perimetro del cuadrado-->" + fg.getPerimetro());
		
		fg.setPerimetro(ap.perimetroCirculo(5));
		System.out.println("Perimetro del circulo--> " + fg.getPerimetro());
		
		fg.setPerimetro(ap.areaCirculo(4.5));
		System.out.println("Area del circulo--> " + fg.getArea());
		

	}
}
