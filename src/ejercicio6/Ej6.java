package ejercicio6;

import java.util.*;

public class Ej6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce un n�mero: ");
		int num = scan.nextInt();
		
		if (num / 10 == 0) {
			System.out.println("El n�mero tiene 1 d�gito.");

		}else if(num / 100 == 0 ){
			System.out.println("El n�mero tiene 2 d�gitos.");
		} else if(num / 1000 == 0){
			System.out.println("El n�mero tiene 3 d�gitos.");
		}else{
			System.err.println("El n�mero tiene m�s de 3 d�gitos");
		}

	}

}
