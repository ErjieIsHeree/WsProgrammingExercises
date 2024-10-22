package actividades;

import java.util.Scanner;

public class _05_EliminarDuplicados {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		//1.Definiendo tamaño de array
		System.out.println("¿Cuántos números quiere introducir?");
		int cantidadDeValoresAIntroducir = ab.nextInt();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		
		//2.Creando array
		int[] array = new int[cantidadDeValoresAIntroducir];
		int cantidadDeValoresIntroducidos = 0;
		
		//3.Detector si el valor introducido ya está
		do {
			System.out.println("Introduzca el " + (cantidadDeValoresIntroducidos + 1 ) + " valor");
			int valor = ab.nextInt();
			
			for (int i = 0; i < array.length; i++) {
				if (array[i] == valor) {
					System.out.println("El número ya fue introducido");
					System.out.println("------------------------------------------------------------------------------");
					i = array.length;
				}
				if (i == array.length - 1) {
					array[cantidadDeValoresIntroducidos] = valor;
					cantidadDeValoresIntroducidos++;
					System.out.println("------------------------------------------------------------------------------");
				}
			}
		} while (cantidadDeValoresIntroducidos < cantidadDeValoresAIntroducir);
		
		//Mostrar en pantalla los valores introducidos con éxito
		System.out.println("Los valores introducidos son:");
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" - ");
			}
		}
		
	}
	
}
