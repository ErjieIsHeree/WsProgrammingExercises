package actividades;

import java.util.Scanner;
import java.util.HashMap;

public class ObjetosPersona {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Persona> hashMapPersonas = new HashMap<>();
		boolean encendido = true;
		
		do {
			mostrarMenu();
			System.out.println("Elige del 1 - 4");
			String eleccion = sc.nextLine();
			if (eleccion.equals("1")) {
				Persona persona = crearPersona(sc);
				if (hashMapPersonas.containsKey(persona.getNombre())) {
					System.out.println("Ya tienes a alguien registrado como " +
						persona.getNombre());
					System.out.println("¿Quieres sobreescribirlo? (True/False)");
					boolean sobreescribir = sc.nextBoolean();
					if (sobreescribir) {
						hashMapPersonas.put(persona.getNombre(), persona);
					} else {
						System.out.println("No se ha añadido a " +
								persona.getNombre());
					}
				} else {
					hashMapPersonas.put(persona.getNombre(), persona);
				}
			} else if (eleccion.equals("2")) {
				hashMapPersonas.forEach((k,v) ->
						System.out.println(v.toString()));
			} else if (eleccion.equals("3")) {
				System.out.println("Introduce el nombre de la persona a la que"
						+ " quieres buscar");
				String nombre = sc.nextLine().toUpperCase();
				System.out.println(hashMapPersonas.get(nombre.toUpperCase()
						.toString()));
			} else if (eleccion.equals("4")) {
				encendido = false;
			}
		} while (encendido == true);
		
	}

	public static void mostrarMenu() {
		System.out.println("1.Introducir persona");
		System.out.println("2.Mostrar personas");
		System.out.println("3.Buscar persona por nombre");
		System.out.println("4.Cerrar programa");
	}
	
	public static Persona crearPersona(Scanner sc) {
		Persona persona = new Persona();
		
		System.out.println("Dime el nombre de la persona");
		persona.setNombre(sc.nextLine().toUpperCase());
		System.out.println("Dime la edad de la persona");
		persona.setEdad(sc.nextInt());
		System.out.println("Dime el peso de la persona");
		persona.setPeso(sc.nextDouble());
		sc.nextLine();
		
		return persona;
	}

}
