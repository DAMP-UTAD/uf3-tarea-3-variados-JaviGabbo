package ejercicio20;

import java.util.*;

public class Ej20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int l1, l2;
		int valorLista1 = 0, valorLista2 = 0;
		int lista1 = 1, lista2 = 1;
		
		System.out.println("LISTA 1");
		
		while(lista1 <= 15){
			System.out.print(lista1 + ") Ingrese valor de la lista 1: ");
			l1 = scan.nextInt();
			valorLista1 += l1;
			lista1++;
		}

		System.out.println("LISTA 2");
		
		while(lista2 <= 15){
			System.out.print(lista2 + ") Ingrese valor de la lista 2: ");
			l2 = scan.nextInt();
			valorLista2 += l2;
			lista2++;
		}

		if (valorLista1 > valorLista2) {
			System.out.println("Lista 1 mayor.");
		} else if (valorLista1 < valorLista2) {
			System.out.println("Lista 2 mayor.");
		} else {
			System.out.println("Listas iguales.");
		}

	}
}