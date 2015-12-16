package ejercicio24;

import java.util.Scanner;

public class Ej24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca el n� de veces que quiere realizar la operaci�n: ");
		int n = scan.nextInt();

		int trianguloGrande = 0;

		for (int i = 1; i <= n; i++) {
			System.out.println("TRI�NGULO " + i);
			System.out.print("Medida de la base: ");
			double base = scan.nextDouble();
			System.out.print("Altura: ");
			double altura = scan.nextDouble();

			System.out.println("La base del triangulo es: " + base);
			System.out.println("La altura del tri�ngulo es: " + altura);
			double superficie = (base * altura) / 2;
			System.out.println("La superficie del tri�ngulo es: " + superficie);

			if (superficie > 12) {
				trianguloGrande++;

			}
		}
		System.out.println("Cantidad de tri�ngulos cuya superficie es mayor a 12: " + trianguloGrande);
	}

}
