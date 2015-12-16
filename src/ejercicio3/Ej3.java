package ejercicio3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("introduzca un número del 1 al 99: ");
		byte num = scan.nextByte();

		if (num / 10 == 0) {
			System.out.println("El número tiene un dígito.");
		}else if (num / 100 == 0) {
			System.out.println("El número tiene 2 dígitos.");
		} else {
System.err.println("Introduce un número de dos dígitos como máximo.");
		}{
			
		}
	}

}
