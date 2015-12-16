package ejercicio32;

import java.util.*;

public class Ej32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int m = 0, t = 0, n = 0;
		int promedioM = 0, promedioT = 0, promedioN = 0;

		System.out.println("Turno de mañana");
		for (int i = 1; i <= 50; i++) {
			System.out.print(i + ") Introduzca la edad del estudiante: ");
			int turnoM = scan.nextInt();

			m += turnoM;
		}
		promedioM = m / 50;
		System.out.println("El promedio de edad del turno de mañana es: "
				+ promedioM);

		System.out.println();

		System.out.println("Turno de tarde");
		for (int i = 1; i <= 60; i++) {
			System.out.print(i + ") Introduzca la edad del estudiante: ");
			int turnoT = scan.nextInt();

			t += turnoT;
		}
		promedioT = t / 60;
		System.out.println("El promedio de edad del turno de tarde es: "
				+ promedioT);

		System.out.println();

		System.out.println("Turno de noche");
		for (int i = 1; i <= 110; i++) {
			System.out.print(i + ") Introduzca la edad del estudiante: ");
			int turnoN = scan.nextInt();

			n += turnoN;
		}
		promedioN = n / 110;
		System.out.println("El promedio de edad del turno de noche es: "
				+ promedioN);

		System.out.println();

		if (promedioM > promedioT && promedioM > promedioM) {
			System.out.println("El turno de mañana tiene un promedio de edades mayor.");

		} else if (promedioT > promedioM && promedioT > promedioN) {
			System.out.println("El turno de tarde tiene un promedio de edades mayor.");
			
		} else {
			System.out.println("El turno de noche tiene un promedio de edades mayor.");
		}

	}

}
