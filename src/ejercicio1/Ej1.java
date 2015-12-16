package ejercicio1;

import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce otro número: ");
		int num2 = scan.nextInt();

		if (num1 > num2) {
			int suma = num1 + num2;
			int resta = num1 - num2;
			System.out.println("La suma es: " + suma);
			System.out.println("La resta es: " + resta);
		} else {
			int multiplicacion = num1 * num2;
			double division = num1 / num2;
			System.out.println("La multiplicación es: " + multiplicacion);
			System.out.println("La división es: " + division);
		}
	}

}
