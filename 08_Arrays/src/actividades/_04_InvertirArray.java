package actividades;

import java.util.Scanner;

public class _04_InvertirArray {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("¿Cuántos números quiere introducir?");
		int cantidad = ab.nextInt();
		
		int[] array = new int[cantidad];
		
		System.out.println(array.length);
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduzca los valores");
			int valor = ab.nextInt();
			array[i] = valor;
		}
		
		cantidad--;
		
		for (int i = cantidad; i >= 0; i--) {
			System.out.println("El " + (i + 1) + " valor es " + array[i]);
		}
		
	}

}