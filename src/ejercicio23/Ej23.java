package ejercicio23;

import java.util.Scanner;

public class Ej23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int saldo = 0;
		int saldoAcreedores = 0;

		do {
			System.out.print("Introduce el nº de cuenta: ");
			int numeroCuenta = scan.nextInt();
			System.out.print("Introduce el saldo actual: ");
			int saldoActual = scan.nextInt();
			
			saldo = saldoActual;

			if (saldoActual > 0) {
				System.out.println("Acreedor");
				saldoAcreedores += saldo;
			} else if (saldoActual < 0) {
				System.out.println("Deudor");
			} else {
				System.out.println("Nulo");
			}		

		} while (saldo > 0);

		System.out.println("La suma total de los saldos acreedores es: " + saldoAcreedores);
	}

}
