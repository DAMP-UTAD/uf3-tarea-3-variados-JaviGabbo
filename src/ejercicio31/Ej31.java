package ejercicio31;

import java.util.Scanner;

public class Ej31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int positivos = 0, negativos = 0, multiplos = 0, pares = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.print(i + ") Introduce un n�mero: ");
			int num = scan.nextInt();

			if (num > 0) {
				positivos++;
			} else {
				negativos++;
			}

			if (num == 1 || num == 3 || num == 5 || num == 15) {
				multiplos++;
			}

			if (num % 2 == 0) {
				pares += num;
			}

		}

		System.out.println("Has ingresado " + positivos + " n�meros positivos.");
		System.out.println("Has ingresado " + negativos + " n�meros negativos.");
		System.out.println("Has ingresado " + multiplos + " m�ltiplos de 15.");
		System.out.println("El valor de los n�meros ingresados que son pares es: " + pares);

	}

}
