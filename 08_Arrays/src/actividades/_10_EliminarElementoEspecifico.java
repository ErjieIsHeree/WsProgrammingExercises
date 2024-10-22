package actividades;

import java.util.Random;
import java.util.Scanner;

public class _10_EliminarElementoEspecifico {
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenidos a BORRA MI NÚMERO!!!\r\n"
				+ "En el juego se aplicarán 10 números aleatorios de 20\r\n"
				+ "Si aciertas uno, se eliminará y me robarás ese número :C\r\n"
				+ "Así que mala suerte y que comience :D\r\n"
				+ "-------------------------------------------------------------------------------");
		
		Scanner ab = new Scanner(System.in);
		Random ac = new Random();
		
		int[] numerosRandom = new int[10];
		
		for (int i = 0; i < 10;) {
			int numeroRandom = ac.nextInt(20)+1;
			for (int k = 0; k < 10; k++) {
				if (numerosRandom[k] == numeroRandom) {
					k = 10;
				}
				if (k == 9) {
					numerosRandom[i] = numeroRandom;
					i++;
				}
			}
		}
		
		System.out.println("Dime un número del 1 al 20:");
		int numeroDeUsuario = ab.nextInt();
		for (int l = 0; l < 10; l++) {
			if (numerosRandom[l] == numeroDeUsuario) {
				System.out.println("Felicidades, ganaste :c");
				System.out.println("Los números fueron:");
				for (int m = 0; m < 10; m++) {
					System.out.print(numerosRandom[m]);
					if (m < 9) {
						System.out.print(" - ");
					}
				}
				l = 10;
			}
			if (l == 9) {
				System.out.println("Jaja, perdiste lelo!");
				for (int n = 0; n < 10; n++) {
					System.out.print(numerosRandom[n]);
					if (n < 9) {
						System.out.print(" - ");
					}
				}
			}
		}
		
	}

}
