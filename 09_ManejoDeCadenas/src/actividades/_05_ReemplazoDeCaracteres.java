package actividades;

import java.util.Scanner;

public class _05_ReemplazoDeCaracteres {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Dime una frase");
		String frase = ab.nextLine();
		
		System.out.println("Todas las 'a' serán sustituidas\r\n"
				+ "Dime un caracter por la que los quieras sustituir");
		String caracter = ab.nextLine();
		System.out.println("La frase final es");
		System.out.println(frase.replace('a', caracter.charAt(0)));		
	}

}
