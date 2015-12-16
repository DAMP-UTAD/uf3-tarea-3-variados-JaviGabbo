package ejercicio11;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número 1: ");
		int num1 = scan.nextInt();
		System.out.print("introdduce un número 2: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce un número 3: ");
		int num3 = scan.nextInt();
		
		if (num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.println("Alguno de los números es menor a diez");
		}
	}
}
