package actividades;

import java.util.Scanner;

public class _03_MayorElemento {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("¿Cuántos números quiere introducir?");
		int cantidad = ab.nextInt();
		
		int[] valores = new int[cantidad];
		int valorMayor = 0;
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduzca los números:");
			int valor = ab.nextInt();
			valores[i] = valor;
			System.out.println();
			System.out.println();
		}
		
		valorMayor = 0;
		
		for (int i = 0; i < cantidad; i++) {
			if (valorMayor < valores[i]) {
				valorMayor = valores[i];
			}
		}

		System.out.println("El mayor valor es " + valorMayor);
		
	}
		
}