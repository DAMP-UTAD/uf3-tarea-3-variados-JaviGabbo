package ejercicio8;

import java.util.*;

public class Ej8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el d�a: ");
		int dia = scan.nextInt();
		System.out.print("introduce el n�mero de mes: ");
		int mes = scan.nextInt();
		System.out.println("Introduce el a�o: ");
		int year = scan.nextInt();

		int day = 25;
		int month = 12;

		if (dia == day && mes == month) {
			System.out.println("�Es Navidad!");
		} else {
			System.out.println("No es Navidad.");
		}
	}

}
