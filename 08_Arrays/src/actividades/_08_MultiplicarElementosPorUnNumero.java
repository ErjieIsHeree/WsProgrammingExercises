package actividades;

import java.util.Scanner;

public class _08_MultiplicarElementosPorUnNumero {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca cuántos números quiere introducir");
		int cantidadDeNumerosAIntroducir = ab.nextInt();
		
		int[] numerosAMultiplicar = new int[cantidadDeNumerosAIntroducir];
		
		for (int i = 0; i < cantidadDeNumerosAIntroducir; i++) {
			System.out.println("Introduzca un valor a introducir:");
			int valor = ab.nextInt();
			numerosAMultiplicar[i] = valor;
		}
		
		for (int j = 0; j < numerosAMultiplicar.length; j++) {
			System.out.println("La tabla de multiplicar de " + numerosAMultiplicar[j]);
			for (int k = 0; k <= 10; k++) {
				System.out.println(numerosAMultiplicar[j] + " * " + k + " = " + (numerosAMultiplicar[j] * k));
			}
		}
		
	}
	
}
