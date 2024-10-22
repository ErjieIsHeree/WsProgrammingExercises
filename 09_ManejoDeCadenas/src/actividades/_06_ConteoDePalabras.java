package actividades;

import java.util.Scanner;

public class _06_ConteoDePalabras {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Dime una frase");
		String frase = ab.nextLine();
		
		String[] cantidadDePalabras = frase.split(" ");
		
		System.out.println("Tu frase tiene " + (cantidadDePalabras.length) + " palabras");
		
	}

}
