package com.lfca.testers;

import com.lfca.classes.AlumnoB;
import com.lfca.classes.PersonaP;

public class TestPB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoB a = new AlumnoB(123, 8.5, "Armando", 20);
		PersonaP b = new PersonaP("Ingrid", 25);
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
		System.out.println(b.toString());
		a.mostrarDatos("Lara");

	}

}

