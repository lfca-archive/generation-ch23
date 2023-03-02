package control;
import java.util.Scanner;
public class EstructuraMultiple {
	Scanner datoScanner = new Scanner(System.in);
	public void vocal() {
		System.out.println("Introduzca una letra :");
		char letra = datoScanner.next().charAt(0);
		switch (letra) {
		case 'a': case 'A' :
		case 'e': case 'E' :
		case 'i': case 'I' :
		case 'o': case 'O' :
		case 'u': case 'U' :
			System.out.println("Es vocal");
			break;

		default:
			System.out.println("Nel no es vocal");
			break;
		}
	}
	public void nota() {
		System.out.println("Introdusca una nota");
		int nota = datoScanner.nextInt();
		switch (nota) {
		case 1:
			System.out.println("Reprobado");
			break;

		default:
			System.out.println("Aprovado");
			break;
		}
	}
	public void ternario() {
		int numero = 6;
		int numero2 = 5;
		boolean num = (numero<numero2) ? true : false;
		System.out.println("A es menor que b" + num);
	}
}
