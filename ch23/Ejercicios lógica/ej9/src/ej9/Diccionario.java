package ej9;
import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
	 public static void main(String[] args) {
	        // Crear el diccionario
	        HashMap<String, String> diccionario = new HashMap<>();
	        diccionario.put("perro", "dog");
	        diccionario.put("gato", "cat");
	        diccionario.put("casa", "house");
	        diccionario.put("coche", "car");
	        diccionario.put("manzana", "apple");
	        diccionario.put("plátano", "banana");
	        diccionario.put("árbol", "tree");
	        diccionario.put("lápiz", "pencil");
	        diccionario.put("libro", "book");
	        diccionario.put("sol", "sun");
	        diccionario.put("luna", "moon");
	        diccionario.put("hombre", "man");
	        diccionario.put("mujer", "woman");
	        diccionario.put("niño", "child");
	        diccionario.put("niña", "girl");
	        diccionario.put("familia", "family");
	        diccionario.put("amigo", "friend");
	        diccionario.put("trabajo", "work");
	        diccionario.put("escuela", "school");
	        diccionario.put("vida", "life");

	        // Solicitar palabra al usuario
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Escribe una palabra en español: ");
	        String palabra = sc.nextLine();

	        // Buscar la palabra en el diccionario
	        String traduccion = diccionario.get(palabra);

	        // Mostrar la traducción o un mensaje de error
	        if (traduccion != null) {
	            System.out.println("La traducción de \"" + palabra + "\" es \"" + traduccion + "\".");
	        } else {
	            System.out.println("La palabra \"" + palabra + "\" no se encuentra en el diccionario.");
	        }
	    }

}
