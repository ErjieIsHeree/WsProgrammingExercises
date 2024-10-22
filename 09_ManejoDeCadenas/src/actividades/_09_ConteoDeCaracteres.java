package actividades;

import java.util.Scanner;

public class _09_ConteoDeCaracteres {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una frase");
		String frase = sc.nextLine();
		
		System.out.println("Vamos a contar cuantos caracteres hay presente en tu frase.\r\n"
				+ "Qué caracter te interesaría saber la cantidad?\r\n"
				+ "Ten en cuenta que las mayúsculas también se diferencian de las minúsculas");
		char letra = sc.next().charAt(0);
		
		System.out.println("Tienes " + contador(frase, letra) + " " + letra);
		
	}
	
	public static int contador(String frase, char letra) {
		int cantidad = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				cantidad++;
			}
		}
		
		return cantidad;
	}

}
