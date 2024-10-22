package actividades;

import java.util.Scanner;

public class _01_LongitudDeUnaCadena {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Dime una frase");
		String frase = ab.nextLine();
		
		System.out.println("La longitud de la frase es de " + frase.length());
		
	}

}
