package actividades;

import java.util.Scanner;

public class _08_Palindromo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una palabra palíndroma");
		String palabra = sc.nextLine();
		
		if (palindroma(palabra, palabraAlreves(palabra))) {
			System.out.println("Es una palabra palíndroma");
		} else {
			System.out.println("No es una palabra palíndroma");
		}
		
	}
	
	public static boolean palindroma(String palabra, char[] palabraAlreves) {
		boolean palindroma = true;
		
		for (int i = 0; i < palabra.length() / 2; i++) {
			if (palabra.charAt(i) != palabraAlreves[i]) {
				palindroma = false;
			}
		}	
		
		return palindroma;
	}
	
	public static char[] palabraAlreves(String palabra) {
		
		char[] palabraAlreves = new char[palabra.length()];

		for (int i = 0; i < palabra.length(); i++) {
			palabraAlreves[i] = palabra.charAt((palabra.length() - 1) - i);
		}
		
		return palabraAlreves;
	}
	
}
