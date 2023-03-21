package ej8;
import java.util.Scanner;


public class Main {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Solicitar 10 números al usuario y almacenarlos en un array
	        int[] numeros = new int[10];
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Ingrese un número: ");
	            numeros[i] = sc.nextInt();
	        }

	        // Ordenar los números primos al principio del array
	        int[] primos = new int[numeros.length];
	        int indicePrimos = 0;
	        int[] noPrimos = new int[numeros.length];
	        int indiceNoPrimos = 0;

	        for (int i = 0; i < numeros.length; i++) {
	            if (esPrimo(numeros[i])) {
	                primos[indicePrimos++] = numeros[i];
	            } else {
	                noPrimos[indiceNoPrimos++] = numeros[i];
	            }
	        }

	        // Unir los arrays primos y no primos en uno solo
	        int[] numerosOrdenados = new int[numeros.length];
	        System.arraycopy(primos, 0, numerosOrdenados, 0, indicePrimos);
	        System.arraycopy(noPrimos, 0, numerosOrdenados, indicePrimos, indiceNoPrimos);

	        // Mostrar el array original
	        System.out.println("Array original mostrando la posición del array más el valor:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println(i + " - " + numeros[i]);
	        }

	        // Mostrar el array con los números primos al principio
	        System.out.println("\nArray con los números primos en las primeras posiciones, " +
	                "mostrando la posición del array más el valor:");
	        for (int i = 0; i < numerosOrdenados.length; i++) {
	            System.out.println(i + " - " + numerosOrdenados[i]);
	        }
	    }

	    // Función que determina si un número es primo
	    public static boolean esPrimo(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
