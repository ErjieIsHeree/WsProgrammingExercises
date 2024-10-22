package actividades;

import java.util.HashMap;
import java.util.Scanner;

public class NumerosTelefono {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMapNumeroTelefono = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce el nombre del propietario");
			String nombre = sc.nextLine();
			
			System.out.println("Introduce el nombre del propietario");
			Integer numero = sc.nextInt();
			sc.nextLine();
			
			hashMapNumeroTelefono.put(nombre, numero);
		}
		
		hashMapNumeroTelefono.forEach((k,v) ->{
			System.out.println("-----------------------");
			System.out.println("Nombre: " + k.toString());
			System.out.println("Numero: " + v.toString());
		});
		
	}

}
