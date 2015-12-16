package ejercicio2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca la nota 1: ");
		int nota1 = scan.nextInt();
		System.out.print("Introducza la nota 2: ");
		int nota2 = scan.nextInt();
		System.out.print("Introduzca la nota 3: ");
		int nota3 = scan.nextInt();

		int promedio = (nota1 + nota2 + nota3) / 3;

		if (promedio >= 7) {
			System.out.println("Promocionado.");
		} else {
			System.out.println("No promocionado.");
		}

	}

}
