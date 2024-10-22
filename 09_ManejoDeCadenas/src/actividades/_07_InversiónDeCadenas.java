package actividades;

import java.util.Scanner;

public class _07_InversiónDeCadenas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime algo");
		String input = sc.nextLine();
		
		for (int i = input.length(); i > 0; i--) {
			System.out.print(input.charAt(i - 1));
		}
		
	}

}
