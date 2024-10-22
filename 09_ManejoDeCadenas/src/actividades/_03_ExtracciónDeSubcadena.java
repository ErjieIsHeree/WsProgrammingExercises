package actividades;

import java.util.Scanner;

public class _03_ExtracciónDeSubcadena {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Dime una frase");
		String frase = ab.nextLine();
		
		int posicionA = 0;
		int posicionB = 0;
		String subFrase = frase;
		
		do {
			System.out.println("Dime una posición de tu cadena");
			posicionA = ab.nextInt();
			System.out.println("Dime otra");
			posicionB = ab.nextInt();
			
			if (posicionA == posicionB) {
				System.out.println("Dos posiciones distintas >:C");
			} else if (posicionA < posicionB) {
				subFrase = frase.substring(posicionA - 1, posicionB);
			} else if (posicionA > posicionB) {
				subFrase = frase.substring(posicionB - 1, posicionA);
			}  
		} while (posicionA == posicionB);
		
		System.out.println(subFrase);
		
	}

}
