package com.lfca.testers;

import com.lfca.clases.OperacionesAritmeticas;
import com.lfca.clases.Resta;
import com.lfca.clases.Suma;
import com.lfca.clases.Mensajes;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma s = new Suma (5,2);
		OperacionesAritmeticas ss = new Suma(10,3);
		Mensajes sss  = new Suma();
		Mensajes sr = new Resta(10,4);
		
		System.out.println("Suma es: " + s.sumar());
		System.out.println("Operaciones Aritmeticas: " + ss.sumar());
		s.mensaje();
		sss.mensajes();
		sr.mensajes();

	}

}
