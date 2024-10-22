package main;

import java.util.Scanner;

import entidades.Interfaz;
import entidades.Muniemon;

public class MuniemonMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Muniemon muniemon = null;
		
		int seleccion = 0;
		do {
			Interfaz.openingFuncion("Bienvenido al menu");
			System.out.println("Seleccione lo que desea hacer");
			System.out.println("1.Dar de alta Muniemon");
			System.out.println("2.Mostrar Muniemon");
			System.out.println("3.Salir del programa");
			seleccion = sc.nextInt();
			if (seleccion == 1) {
				muniemon = creacionMuniemon(sc);
			} else if (seleccion == 2) {
				if (muniemon != null) {
					System.out.println(muniemon.toString());
				} else {
					System.out.println("No existe ningún muniemon");
				}
			} else if (seleccion != 3) {
				System.err.println("No existe esta opción, por favor seleccione"
						+ " 1, 2 o 3");
			}
		} while (seleccion != 3);

		Interfaz.endingFuncion("l programa");
		
	}

	//Crea un muniemon (para usuario)
	public static Muniemon creacionMuniemon(Scanner sc) {
		Muniemon muniemon = new Muniemon();
		Interfaz.openingFuncion("Creación de muniemon");
		
		System.out.println("Reglas para la creación:");
		System.out.println();
		System.out.println("1.El nombre no podrá contener carácteres raros");
		System.out.println();
		System.out.println("2.Tendrás un total de 99 puntos para añadir"
				+ " en cualquiera de las estadísticas que deseas, por lo que"
				+ " calcula bien donde quieres aplicarlos.");
		System.out.println("Existen 3 estadísticas, vida, defensa y ataque");
		System.out.println();
		System.out.println("3.Los muniemons pueden tener hasta 2 elementos como"
				+ " máximo");
		System.out.println();
		System.out.println("4.DIVIÉRTETE");
		System.out.println();
		
		muniemon.asignacionNombreMuniemon();
		muniemon.asignacionStatsMuniemon();
		muniemon.asignacionElementosMuniemon();
		
		Interfaz.endingFuncion(" la creación de tu muniemon");
		
		return muniemon;
		
	}

	
}
