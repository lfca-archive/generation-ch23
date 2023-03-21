package ej6;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe una palabra o frase: ");
        String texto = scanner.nextLine();
        String textoAlReves = new StringBuilder(texto).reverse().toString();
        System.out.println("El texto al revés es: " + textoAlReves);
    }
}
