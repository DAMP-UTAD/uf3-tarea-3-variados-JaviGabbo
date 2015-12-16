package ejercicio16;

import java.util.*;

public class Ej16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce el número de personas con las que quieres calcular la media: ");
		int personas = scan.nextInt();

		int num = 1;
		double mediaAlturas = 0;

		while(num <= personas){	
			System.out.print("Introduzca la altura de la persona " + num + ": ");
			double altura = scan.nextDouble();
			mediaAlturas += altura;
			
			num++;
		}
		
		mediaAlturas = mediaAlturas / personas;
		System.out.println("La altura promedio de las personas es: " + mediaAlturas);
	}

}


