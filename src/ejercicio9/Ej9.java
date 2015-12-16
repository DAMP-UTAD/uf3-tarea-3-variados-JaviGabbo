package ejercicio9;

import java.util.*;

public class Ej9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un número 1: ");
		int num1 = scan.nextInt();
		System.out.print("introdduce un número 2: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce un número 3: ");
		int num3 = scan.nextInt();

		if (num1 == num2 && num1 == num3 && num2 == num3) {
			int resultado = (num1 + num2) * num3;
			System.out.println(resultado);
		}

	}

}
