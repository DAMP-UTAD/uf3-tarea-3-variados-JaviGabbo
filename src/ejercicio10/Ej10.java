package ejercicio10;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un n�mero 1: ");
		int num1 = scan.nextInt();
		System.out.print("introdduce un n�mero 2: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce un n�mero 3: ");
		int num3 = scan.nextInt();

		if (num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.println("Todos los n�meros son menores a 10.");
		}
	}
}
