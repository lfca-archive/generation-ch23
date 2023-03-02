package control;
import java.util.Scanner;

public class Ordenar {
	Scanner eScanner = new Scanner(System.in);
	public void orden() {
		// TODO Auto-generated method stub
		System.out.println("Dame tres numeros");
		int n1 = eScanner.nextInt();
		int n2 = eScanner.nextInt();
		int n3 = eScanner.nextInt();
		String ordenString = "";
		if(n1 < n2 && n1 <n3) {
			if(n2<n3) {
				ordenString = ""+n1 + n2 + n3;
			}
			if(n3<n2){ordenString = ""+n1 + n3 + n2; }
		}
		if(n2 < n3 && n2 <n1) {
			if(n1<n3) {
				ordenString = ""+n2 + n1 + n3;
			}
			if(n3<n1){ordenString = ""+n2 + n3 + n1; }
		}
		if(n3 < n1 && n3 <n2) {
			if(n2<n1) {
				ordenString = ""+n3 + n2 + n1;
			}
			if(n1<n2){ordenString = ""+n3 + n1 + n2; }
		}
		System.out.println(ordenString);
	}
}
