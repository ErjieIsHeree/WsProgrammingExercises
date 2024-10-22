package actividades;

import java.util.Scanner;

public class _02_Promedio {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("¿Cuántos números contiene la media que quiere hacer?");
		int cantidad = ab.nextInt();
		
		int[] valoresDeLaMedia = new int[cantidad];
		int sumaTotalDeLosValores = 0;
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduzca el " + (i + 1) + " valor:");
			int valor = ab.nextInt();
			valoresDeLaMedia[i] = valor;
			System.out.println();
		}
		
		for (int j = 0; j < cantidad; j++) {
			sumaTotalDeLosValores += valoresDeLaMedia[j];
		}
		
		int mediaFinal = sumaTotalDeLosValores / cantidad;
		System.out.println("La media final es: " + mediaFinal);
		
	}
		
}