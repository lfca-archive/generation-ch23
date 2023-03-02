package control;
import java.util.Scanner;

public class EstructuraIf {
	Scanner entradra = new Scanner(System.in);
	public void controlIf() {
		byte num = 6;
		if(num > 5) {
			System.out.println("pasaste we");
		}
		if(num == 5) {
			System.out.println("pasaste es 5");
		}
		else {
			System.out.println("no es 5");
		}
	}
	public void divisible() {
		System.out.println("Dame un numero");
		int dato1 = entradra.nextInt();
		System.out.println("Dame otro numero");
		int dato2 = entradra.nextInt();
		if((dato1%dato2)==0) {
			System.out.println("Si es divisible");
		}
		else {
			System.out.println("No es divisible");
		}
	}
	public void comparar() {
		System.out.println("Dame un numero");
		int dato3 = entradra.nextInt();
		System.out.println("Dame otro numero");
		int dato4 = entradra.nextInt();
		if (dato3<dato4) {
			System.out.println(dato4 + "Es mayor");
		}
		else {
			System.out.println(dato3 + "Es mayor");
		}
	}
	public void noes() {
		System.out.println("dame un numero");
		int dato = entradra.nextInt();
		if(dato>0) {System.out.println("Es mayor a 0");}
		else if(dato<0){System.out.println("Es menor a 0");}
		else {System.out.println("Es 0");}
	}
}
