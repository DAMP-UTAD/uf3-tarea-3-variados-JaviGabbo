package ejercicio6;

import java.util.*;

public class Ej6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int num = scan.nextInt();
		
		if (num / 10 == 0) {
			System.out.println("El número tiene 1 dígito.");

		}else if(num / 100 == 0 ){
			System.out.println("El número tiene 2 dígitos.");
		} else if(num / 1000 == 0){
			System.out.println("El número tiene 3 dígitos.");
		}else{
			System.err.println("El número tiene más de 3 dígitos");
		}

	}

}
