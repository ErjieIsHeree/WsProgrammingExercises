package actividades;

import java.util.Scanner;

public class _01_SumaDeElementos {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca cuántos números quiere sumar");
		int cantidad = ab.nextInt();
		
		int[] elementos = new int[cantidad];
		int sumaTotal = 0;
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduzca un valor de la suma:");
			int valor = ab.nextInt();
			elementos[i] = valor;
			System.out.println();
		}
		
		for (int j = 0; j < elementos.length; j++) {
			sumaTotal += elementos[j];
		}
		
		System.out.println("El valor total de la suma es: " + sumaTotal);
		
	}

}
