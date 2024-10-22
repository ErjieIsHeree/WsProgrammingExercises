package actividades;

import java.util.Random;
import java.util.Scanner;

public class _06_BuscarElemento {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		Random ac = new Random();
		
		//Creando el array con números randoms
		int[] array = new int[10];
		
		for (int i = 0; i < 10;) {
			int numeroRandom = ac.nextInt(50)+1;
			for (int j = 0; j < 10; j++) {
				if (array[j] == numeroRandom) {
					j = 10;
				}
				if (j == 9) {
					array[i] = numeroRandom;
					i++;
				}
				
			}
			
		}
		
		//Interactuando con usuario
		System.out.println("Por favor introduzca un número del 1 al 50\r\n"
				+ "Si el número introducido ya está en el sistema, habrá perdido\r\n"
				+ "Hay 10 números introducidos, todos distintos de cada uno\r\n"
				+ "-------------------------------------------------------------------------------------------");
		int numeroDeUsuario = 0;
		
		do {
			System.out.println("Dime un número");
			numeroDeUsuario = ab.nextInt();
			if (numeroDeUsuario > 0 && numeroDeUsuario < 51) {
				for (int k = 0; k < 10; k++) {
					if (array[k] == numeroDeUsuario) {
						System.out.println("Jaja perdiste!");
						System.out.println("Los números eran:");
						for (int l = 0; l < 10; l++) {
							System.out.print(array[l]);
							if (l < 9) {
								System.out.print(" - ");
							}
						}
						k = 10;
					}
					if (k == 9) {
						System.out.println("Tuviste suerte esta vez");
						System.out.println("Los números eran:");
						for (int m = 0; m < 10; m++) {
							System.out.print(array[m]);
							if (m < 9) {
								System.out.print(" - ");
							}
						}
					}
				}
			} else {
				System.out.println("Ese número no está entre el 1 y el 50");
				System.out.println("-------------------------------------------------------------------------------------------");
			}
		} while (numeroDeUsuario > 50 && numeroDeUsuario < 1);
			
	}
	
}
