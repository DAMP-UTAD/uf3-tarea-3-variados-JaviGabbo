package ejercicio13;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el sueldo: ");
		int sueldo = scan.nextInt();
		System.out.print("Introdduce los años de antiguedad: ");
		int antig = scan.nextInt();
		
		
		if (sueldo < 500 && antig >= 10) {
			int porcentaje = (sueldo*20)/100;
			sueldo += porcentaje;
			System.out.println(sueldo);
			
		} else if(sueldo < 500 && antig < 10){
			
			int porcentaje = (sueldo*5)/100;
			sueldo += porcentaje;
			System.out.println(sueldo);
		} else{
			System.out.println(sueldo);
		}
	}

}
