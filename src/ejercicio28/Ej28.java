package ejercicio28;

import java.util.Scanner;

public class Ej28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cuad1 = 0, cuad2 = 0, cuad3 = 0, cuad4 = 0;

		System.out.print("Introduzca la cantidad de puntos a procesar: ");
		int numeros = scan.nextInt();

		for (int i = 1; i <= numeros; i++) {
			
			System.out.println("PUNTO " + i);
			System.out.print("Introduzca la coordenada x: ");
			int x = scan.nextInt();
			System.out.print("Introduzca la coordenada y: ");
			int y = scan.nextInt();

			if (x > 0 && y > 0) {
				cuad1++;

			} else if (x < 0 && y > 0) {
				cuad2++;
			} else if (x < 0 && y < 0) {
				cuad3++;
			} else {
				cuad4++;
			}
		}
		System.out.println("Se han ingresado " + cuad1 + " puntos en el 1º cuadrante.");
		System.out.println("Se han ingresado " + cuad2 + " puntos en el 2º cuadrante.");
		System.out.println("Se han ingresado " + cuad3 + " puntos en el 3º cuadrante.");
		System.out.println("Se han ingresado " + cuad4 + " puntos en el 4º cuadrante.");
	}
}