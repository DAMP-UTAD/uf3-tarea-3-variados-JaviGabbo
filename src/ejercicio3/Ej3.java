package ejercicio3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("introduzca un n�mero del 1 al 99: ");
		byte num = scan.nextByte();

		if (num / 10 == 0) {
			System.out.println("El n�mero tiene un d�gito.");
		}else if (num / 100 == 0) {
			System.out.println("El n�mero tiene 2 d�gitos.");
		} else {
System.err.println("Introduce un n�mero de dos d�gitos como m�ximo.");
		}{
			
		}
	}

}
