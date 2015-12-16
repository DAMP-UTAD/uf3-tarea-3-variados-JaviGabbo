package ejercicio31;

import java.util.Scanner;

public class Ej31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int positivos = 0, negativos = 0, multiplos = 0, pares = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.print(i + ") Introduce un número: ");
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

		System.out.println("Has ingresado " + positivos + " números positivos.");
		System.out.println("Has ingresado " + negativos + " números negativos.");
		System.out.println("Has ingresado " + multiplos + " múltiplos de 15.");
		System.out.println("El valor de los números ingresados que son pares es: " + pares);

	}

}
