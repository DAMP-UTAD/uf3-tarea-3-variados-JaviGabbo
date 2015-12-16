package ejercicio19;

public class Ej19 {

	public static void main(String[] args) {

		int contador = 1;
		int num = 0;
		int i = 8;
		
		while(num < 500){
			num = contador * i;
			System.out.println(num);
			contador++;
		}
		
	}

}


//Corregir por que el programa imprime 504