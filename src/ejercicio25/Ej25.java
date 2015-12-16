package ejercicio25;

import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		int sumaMayores = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ") Introduce un número: ");
			int num = scan.nextInt();
			
			if (i > 5) {
				sumaMayores += num; 
				
			}
		}
		System.out.println("La suma de los últimos 5 valores ingresados es: " + sumaMayores);
	}

}
