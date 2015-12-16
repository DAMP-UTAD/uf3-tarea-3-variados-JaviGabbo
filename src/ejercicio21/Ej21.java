package ejercicio21;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n, num, i = 1, numPares = 0, numImpares = 0;
		System.out.print("Ingrese la cantidad de numeros que quiere analizar: ");
		n = scan.nextInt();

		while (i <= n) {
			System.out.print(i + ") Ingrese un numero: ");
			num = scan.nextInt();
			if (num % 2 == 0) {
				numPares++;
			}
			else {
				numImpares++;
			}
			i++;
		}

		System.out.println("La cantidad de números pares es: " + numPares);
		System.out.println("La cantidad de números impares es: " + numImpares);

	}

}
