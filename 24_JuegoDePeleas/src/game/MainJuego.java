package game;

import java.util.HashMap;
import java.util.Scanner;

public class MainJuego {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Personaje> hashMapPersonajes = new HashMap<>();
		
		System.out.println("Bienvenidos!");
		boolean encendido = true;
		do {
			mostrarMenu();
			System.out.println("Introduzca del 1-4 su eleccion");
			String eleccion = sc.nextLine();
			if (eleccion.equals("1")) {
				Personaje p = menuCrearPersonaje(sc);
				hashMapPersonajes.put(p.getNombre(), p);
			} else if (eleccion.equals("2")) {
				mostrarPersonajes(hashMapPersonajes);
			} else if (eleccion.equals("3")) {
				if (hashMapPersonajes.size() > 1) {
					System.out.println("¿Qué personajes quieres que"
							+ " combatan?");
					mostrarPersonajes(hashMapPersonajes);
					combate(hashMapPersonajes.get(sc.nextLine()),
							hashMapPersonajes.get(sc.nextLine()));
				} else {
					System.out.println("No tienes suficientes personajes");
				}
			} else if (eleccion.equals("4")) {
				encendido = false;
			}
		} while (encendido);
		System.out.println("Programa apagado");
	}
	
	public static void mostrarMenu() {
		System.out.println("1.Crear personaje");
		System.out.println("2.Mostrar personajes");
		System.out.println("3.Combatir personajes");
		System.out.println("4.Apagar programa");
	}
	
	public static Personaje menuCrearPersonaje(Scanner sc) {
		Personaje p1 = null;
		System.out.println("¿Qué personaje quieres crear?");
		System.out.println("1.Guerrero");
		System.out.println("2.Mago");
		System.out.println("3.Curandero");
		System.out.println("Introduce una opción del 1-3");
		String eleccion = sc.nextLine();
		
		if (eleccion.equals("1")) {
			p1 = crearPersonaje(sc, eleccion);
		} else if (eleccion.equals("2")) {
			p1 = crearPersonaje(sc, eleccion);
		} else if (eleccion.equals("3")) {
			p1 = crearPersonaje(sc, eleccion);
		}
		
		return p1;
	}
	
	public static Personaje crearPersonaje(Scanner sc, String eleccion) {
		Personaje p1 = null;
		
		if (eleccion.equals("1")) {
			p1 = new Guerrero();
		} else if (eleccion.equals("2")) {
			p1 = new Mago();
		} else if (eleccion.equals("3")) {
			p1 = new Curandero();
		}
		
		System.out.println("¿Cómo se llama tu personaje?");
		p1.setNombre(sc.nextLine());
		System.out.println("¿Cuánto daño de ataque tiene?");
		p1.setAtaque(sc.nextInt());
		sc.nextLine();
		System.out.println("¿Cuánta vida tiene tu personaje?");
		p1.setVida(sc.nextInt());
		sc.nextLine();
		System.out.println("¿Qué arma tiene tu personaje?");
		System.out.println("1.Espada");
		System.out.println("2.Arco");
		System.out.println("3.Hechizo");
		System.out.println("4.Rezo");
		System.out.println("Introduce del 1-4 la que desees");
		String eleccionArma = sc.nextLine();
		Arma arma = null;
		if (eleccionArma.equals("1")) {
			arma = new Espada();
		} else if (eleccionArma.equals("2")) {
			arma = new Arco();
		} else if (eleccionArma.equals("3")) {
			arma = new Hechizo();
		} else if (eleccionArma.equals("4")) {
			arma = new Rezo();
		}
		p1.setArma(arma);
		
		return p1;
	}
	
	public static void combate(Personaje p1, Personaje p2) {
		int ataqueP1 = p1.getAtaque();
		int vidaP1 = p1.getVida();
		int ataqueP2 = p2.getAtaque();
		int vidaP2 = p2.getVida();
		do {
			p1.Ataca(p2);
			if (p2.getVida() > 0)
				p2.Ataca(p1);
		} while (p1.getVida() > 0 && p2.getVida() > 0);
		if (p1.getVida() > 0) {
			System.out.println("Ha ganado " + p1.getNombre());
		} else if (p2.getVida() > 0) {
			System.out.println("Ha ganado " + p2.getNombre());
		}
		p1.setAtaque(ataqueP1);
		p1.setVida(vidaP1);
		p2.setAtaque(ataqueP2);
		p2.setVida(vidaP2);
	}
	
	public static void mostrarPersonajes(HashMap<String, Personaje> hM) {
		hM.forEach((k,v) -> {
			System.out.println(k + " " + v.toString());
		});
	}

}
