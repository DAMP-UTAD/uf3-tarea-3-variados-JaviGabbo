package ejercicio33;

import java.util.Scanner;

public class Ej33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n, j, contador;
		boolean primo;
		contador = 0;

		System.out.print("Introduce un número: ");
		n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			primo = true;
			j = 2;

			while (j <= i - 1 && primo == true) {

				if (i % j == 0)
					primo = false;
				j++;
			}

			if (primo == true) {
				contador++;

			}

		}
		System.out.println(" Ente el 1 y el " + n + " hay " + contador + " números que son primos.");
	}

}
