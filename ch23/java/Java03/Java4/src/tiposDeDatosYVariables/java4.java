package tiposDeDatosYVariables;

public class java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}		
		
		boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
	/*Ejercicio 1 Verificar si un número es par y positivo*/
			      int num = 6;

			      if(num > 0 && num % 2 == 0) {
			         System.out.println(num + " es un número par y positivo.");
			      } else {
			         System.out.println(num + " no es un número par y positivo.");
			      }
			   

		
	/*Ejercicio 2 Verificar si un número está dentro de un rango específico*/

        int numero = 7;
        int rangoMinimo = 1;
        int rangoMaximo = 10;
        
        if(numero >= rangoMinimo && numero <= rangoMaximo) {
            System.out.println(numero + " está dentro del rango " + rangoMinimo + " a " + rangoMaximo);
        } else {
            System.out.println(numero + " está fuera del rango " + rangoMinimo + " a " + rangoMaximo);
        }
 

	
	/* Ejercicio 3 Verificar que un string es igual a otro o no*/
String str1 = "Hola";
String str2 = "hola";
if(str1.equals(str2)) {
    System.out.println("Los strings son iguales.");
} else {
    System.out.println("Los strings son diferentes.");
}

	}
	

}
