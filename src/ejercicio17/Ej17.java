package ejercicio17;

import java.util.*;

public class Ej17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce el número de empleados: ");
		int empleados = scan.nextInt();
		
		int num = 1;
		int salarioAlto = 0, salarioBajo = 0;
		double importe = 0;
		
		
		while(num <= empleados){
			System.out.print("Introduzca el salario del empleado " + num + ": ");
			double salario = scan.nextDouble();
			
			importe += salario;
			
			if (salario >= 100 && salario < 300) {
				salarioBajo++;
			} else {
				salarioAlto++;
			}
			
			num++;
		}
		
		System.out.println("Hay " + salarioBajo + " personas que cobran entre $100 y $300.");
		System.out.println("Hay " + salarioAlto + " personas que cobran más de $300.");
		System.out.println("El importe de los sueldos al personal es de: $" + importe);
	}

}
