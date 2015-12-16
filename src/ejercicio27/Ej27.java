package ejercicio27;

import java.util.*;

public class Ej27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número del 1 al 10: ");
		int num = scan.nextInt();
		System.out.println("Tabla del " + num);
		int multiplicacion = 0;
		
		for (int i = 1; i <= 12; i++) {
			
			multiplicacion = num * i;
			System.out.println(num + " × " + i + " = " + multiplicacion);
		} 

	}

}
