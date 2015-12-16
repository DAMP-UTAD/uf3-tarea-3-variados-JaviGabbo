package ejercicio7;

import java.util.*;

public class Ej7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca la  cantidad de respuestas totales: ");
		int total = scan.nextInt();
		System.out.print("Introduce la cantidad de respuestas acertadas por el alumno: ");
		int score = scan.nextInt();

		int porcentaje = (score * 100) / total;

		if (porcentaje >= 90) {
			System.out.println("Nivel máximo.");
		} else if (porcentaje >= 75 && porcentaje < 90) {
			System.out.println("Nivel medio.");
		} else if (porcentaje >= 50 && porcentaje < 75) {
			System.out.println("Nivel regular.");
		} else {
			System.out.println("Fuera de nivel.");
		}

	}
}
