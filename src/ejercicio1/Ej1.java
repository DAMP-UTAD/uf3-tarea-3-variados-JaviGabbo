package ejercicio1;

import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce otro n�mero: ");
		int num2 = scan.nextInt();

		if (num1 > num2) {
			int suma = num1 + num2;
			int resta = num1 - num2;
			System.out.println("La suma es: " + suma);
			System.out.println("La resta es: " + resta);
		} else {
			int multiplicacion = num1 * num2;
			double division = num1 / num2;
			System.out.println("La multiplicaci�n es: " + multiplicacion);
			System.out.println("La divisi�n es: " + division);
		}
	}

}
