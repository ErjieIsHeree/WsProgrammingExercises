package actividades;

import java.util.Scanner;

public class _02_MayñusculasYMinúsculas {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Dime una frase");
		String frase = ab.nextLine();
		
		System.out.println(frase.toUpperCase());
		System.out.println(frase.toLowerCase());
		
	}

}
