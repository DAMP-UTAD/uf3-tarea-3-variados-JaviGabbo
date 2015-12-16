package ejercicio15;

import java.util.*;

public class Ej15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double nota = 0;
		int notaMayor = 0, notaMenor = 0, numNota = 1;

		while(numNota <= 10){
			System.out.print("Ingrese la nota " + numNota + ": ");
			nota = scan.nextDouble();

			if (nota >= 7) {
				notaMayor++;
			} else {
				notaMenor++;
			}
			
			numNota++;
		}
		
		System.out.println("El número de notas mayores o iguales a 7 es: " + notaMayor);
		System.out.println("El número de notas menores a 7 es: " + notaMenor);
	}

}



