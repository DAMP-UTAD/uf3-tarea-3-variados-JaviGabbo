package ejercicio29;

import java.util.Scanner;

public class Ej29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int equilatero = 0, isosceles = 0, escaleno = 0;

		System.out.print("Introduzca los triángulos que quiere analizar: ");
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
				System.out.println("El triangulo es equilátero.");

			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				isosceles++;
				System.out.println("El triángulo es isósceles.");

			} else {
				escaleno++;
				System.out.println("El triángulo es escaleno.");
			}

		}

		System.out.println("Hay " + equilatero + " triángulos equiláteros.");
		System.out.println("Hay " + isosceles + " triángulos isósceles.");
		System.out.println("Hay " + escaleno + " triángulos escalenos.");
		
		if (equilatero < isosceles && equilatero < escaleno) {
			System.out.println("El triángulo equilátero está en menor cantidad.");
		} else if (isosceles < equilatero && isosceles < escaleno) {
			System.out.println("El triángulo isósceles está en menor cantidad.");
		} else if (escaleno < isosceles && escaleno < equilatero){
			System.out.println("El triángulo escaleno está en menor cantidad.");
		}
		
	}

}
