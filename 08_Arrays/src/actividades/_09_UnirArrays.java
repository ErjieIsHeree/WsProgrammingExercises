package actividades;

import java.util.Scanner;

public class _09_UnirArrays {

	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca cuántos números quiere introducir en el primer bloque");
		int cantidadDeNumerosAIntroducirA = ab.nextInt();
		System.out.println("Y en el segundo?");
		int cantidadDeNumerosAIntroducirB = ab.nextInt();
		
		int[] numerosAIntroducirA = new int[cantidadDeNumerosAIntroducirA];
		int[] numerosAIntroducirB = new int[cantidadDeNumerosAIntroducirB];
		
		for (int i = 0; i < numerosAIntroducirA.length; i++) {
			System.out.println("Dime los valores que quieres introducir en el primer bloque");
			int valores = ab.nextInt();
			numerosAIntroducirA[i] = valores;
		}
		
		for (int j = 0; j < numerosAIntroducirB.length; j++) {
			System.out.println("Dime los valores que quieres introducir en el segundo bloque");
			int valores = ab.nextInt();
			numerosAIntroducirB[j] = valores;
		}

		int[] sumaDeAYB = new int[numerosAIntroducirA.length + numerosAIntroducirB.length];
		
		for (int k = 0; k < sumaDeAYB.length - numerosAIntroducirB.length; k++) {
			sumaDeAYB[k] = numerosAIntroducirA[k];
		}
		
		for (int l = numerosAIntroducirA.length; l < sumaDeAYB.length - numerosAIntroducirA.length; l++) {
			sumaDeAYB[l] = numerosAIntroducirB[l - numerosAIntroducirA.length];
		}
		
		int sumaTotal = 0;
		
		for (int m = 0; m < sumaDeAYB.length; m++) {
			sumaTotal += sumaDeAYB[m];
		}
		
		System.out.println("La suma total de los números introducidos es " + sumaTotal);
		
	}
	
}
