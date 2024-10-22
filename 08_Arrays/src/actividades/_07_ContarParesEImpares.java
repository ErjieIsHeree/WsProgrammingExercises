package actividades;

import java.util.Scanner;

public class _07_ContarParesEImpares {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("¿Cuántos valores quieres introducir?");
		int numeroDeValoresAIntroducir = ab.nextInt();
		
		int[] valoresDelUsuario = new int[numeroDeValoresAIntroducir];
		
		for (int i = 0; i < valoresDelUsuario.length; i++) {
			System.out.println("Introduzca los valores deseados:");
			int valor = ab.nextInt();
			valoresDelUsuario[i] = valor;
			System.out.println();
		}
		
		int cantidadDeNumerosPares = 0;
		int cantidadDeNumerosImpares = 0;
		int ceroOUno = 0;
		
		for (int j = 0; j < valoresDelUsuario.length; j++) {
			ceroOUno = valoresDelUsuario[j] % 2;
			if (ceroOUno == 0) {
				cantidadDeNumerosPares++;
			} else if (ceroOUno == 1) {
				cantidadDeNumerosImpares++;
			}
		}
		
		System.out.println("La cantidad de números pares es " + cantidadDeNumerosPares + " y la de impares es " + cantidadDeNumerosImpares);
		
	}

}
