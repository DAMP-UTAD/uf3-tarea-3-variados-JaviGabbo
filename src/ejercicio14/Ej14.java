package ejercicio14;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo n�mero: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer n�mero: ");
		int num3 = scan.nextInt();

		if ((num1 > num2 && num1 > num3) && (num2 < num1 && num2 < num3)) {

			System.out.println("El n�mero mayor es: " + num1);
			System.out.println("El n�mero menor es: " + num2);

		} else if ((num1 > num2 && num1 > num3) && (num3 < num1 && num3 < num2)) {

			System.out.println("El n�mero mayor es: " + num1);
			System.out.println("El n�mero menor es: " + num3);

		} else if ((num2 > num1 && num2 > num3) && (num1 < num2 && num1 < num3)) {

			System.out.println("El n�mero mayor es: " + num2);
			System.out.println("El n�mero menor es: " + num1);

		} else if ((num2 > num1 && num2 > num3) && (num3 < num2 && num3 < num1)) {

			System.out.println("El n�mero mayor es: " + num2);
			System.out.println("El n�mero menor es: " + num3);

		} else if ((num3 > num1 && num3 > num2) && (num2 < num3 && num2 < num1)) {

			System.out.println("El n�mero mayor es: " + num3);
			System.out.println("El n�mero menor es: " + num2);

		} else if ((num3 > num1 && num3 > num2) && (num1 < num3 && num1 < num2)) {

			System.out.println("El n�mero mayor es: " + num3);
			System.out.println("El n�mero menor es: " + num1);

		}

	}

}
