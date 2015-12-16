package ejercicio5;

import java.util.*;

public class Ej5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int num = scan.nextInt();

		if (num < 0) {
			System.out.println("El número es negativo.");
		} else if (num > 0) {
			System.out.println("El número es positivo.");
		} else {
			System.out.println("El numero es nulo.");
		}
	}

}
