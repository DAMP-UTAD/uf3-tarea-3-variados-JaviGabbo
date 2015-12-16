package ejercicio30;

import java.util.*;

public class Ej30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce la coordenada x: ");
		int x = scan.nextInt();
		System.out.print("introdduce la coordenada y: ");
		int y = scan.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("1º Cuadrante.");
		} else if (x < 0 && y>0) {
			System.out.println("2º Cuadrante.");
		} else if (x < 0 && y < 0) {
			System.out.println("3º Cuadrante.");
		} else {
			System.out.println("4º Cuadrante.");
		}
		
		
	}

}
