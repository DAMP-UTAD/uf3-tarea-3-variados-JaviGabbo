package ejercicio29;

import java.util.Scanner;

public class Ej29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int equilatero = 0, isosceles = 0, escaleno = 0;

		System.out.print("Introduzca los tri�ngulos que quiere analizar: ");
		int numTriangulos = scan.nextInt();

		for (int i = 1; i <= numTriangulos; i++) {
			System.out.println("TRIANGULO " + i);
			System.out.print("Introduce el lado 1: ");
			int lado1 = scan.nextInt();
			System.out.print("Introduce el lado 2: ");
			int lado2 = scan.nextInt();
			System.out.print("Introduce el lado 3: ");
			int lado3 = scan.nextInt();

			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				equilatero++;
				System.out.println("El triangulo es equil�tero.");

			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				isosceles++;
				System.out.println("El tri�ngulo es is�sceles.");

			} else {
				escaleno++;
				System.out.println("El tri�ngulo es escaleno.");
			}

		}

		System.out.println("Hay " + equilatero + " tri�ngulos equil�teros.");
		System.out.println("Hay " + isosceles + " tri�ngulos is�sceles.");
		System.out.println("Hay " + escaleno + " tri�ngulos escalenos.");
		
		if (equilatero < isosceles && equilatero < escaleno) {
			System.out.println("El tri�ngulo equil�tero est� en menor cantidad.");
		} else if (isosceles < equilatero && isosceles < escaleno) {
			System.out.println("El tri�ngulo is�sceles est� en menor cantidad.");
		} else if (escaleno < isosceles && escaleno < equilatero){
			System.out.println("El tri�ngulo escaleno est� en menor cantidad.");
		}
		
	}

}
