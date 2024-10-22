package actividades;

import java.util.Scanner;

public class _05_EliminarDuplicadosBienHecho {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("¿Cuántos números quieres introducir?");
		int cantidadDeNumerosAIntroducir = ab.nextInt();
		
		int[] arrayNumeros = new int[cantidadDeNumerosAIntroducir];
		int numeroAIntroducir = 0;
		
		for (int i = 0; i < cantidadDeNumerosAIntroducir; i++) {
			do {
			System.out.println("Dime el " + (i + 1) + " que quieres introducir\r\n"
					+ "No introduzcas 0");
			numeroAIntroducir = ab.nextInt();
			if (numeroAIntroducir == 0) {
				System.out.println("Dije un número distinto del 0 >:C");
				System.out.println("---------------------------------------------");
			} else {
				arrayNumeros[i] = numeroAIntroducir;
				System.out.println("---------------------------------------------");
			}
			} while (numeroAIntroducir == 0);
		}
		
		for (int j = 0; j < cantidadDeNumerosAIntroducir; j++) {
			for (int k = 0; k < cantidadDeNumerosAIntroducir; k++) {
				if (arrayNumeros[j] == arrayNumeros[k] && k != j) {
					arrayNumeros[j] = 0;
				}
			}
		}

		System.out.println("Los que aparezcan como 0, serán los números que hayas repetido");
		for (int l = cantidadDeNumerosAIntroducir - 1; l >= 0; l--) {
			System.out.print(arrayNumeros[l]);
			System.out.print(" - ");
		}
		
	}

}
