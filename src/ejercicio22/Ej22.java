package ejercicio22;

import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, i = 1, total = 0;

		do {

			System.out.print(i + ") Ingrese un numero: ");
			num = scan.nextInt();
			if (num != 9999) {
				total += num;
			}

			i++;
		} while (num < 9999 && num != 9999);

		System.out.println("El valor de los números que has ingresado es: " + total);

		if (total == 0) {
			System.out.println("El número es 0.");
		} else if (total > 0) {
			System.out.println("El número es mayor que 0.");
		} else {
			System.out.println("El número es menor que 0.");
		}

	}
}