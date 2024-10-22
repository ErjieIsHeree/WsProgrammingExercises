package main;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Interfaz;
import entidad.Muniemon;

public class MainMuniemon {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Muniemon> listaMuniemons = new ArrayList<Muniemon>();
		Muniemon munieOne = null;
		Muniemon munieTwo = null;
		listaMuniemons.add(munieOne);
		listaMuniemons.add(munieTwo);
		
		int eleccion = 0;
		int cantidadCreaciones = 0;
		do {
			eleccion = mostrarMenu();
			if (eleccion == 1) {
				if (cantidadCreaciones == 0) {
					munieOne = creacionMuniemon();
					cantidadCreaciones++;
				} else if (cantidadCreaciones == 1) {
					munieTwo = creacionMuniemon();
					cantidadCreaciones++;
				} else {
					System.out.println("El límite de muniemons creable son 2");
				}
			} else if (eleccion == 2) {
				munieOne.mostrarStats();
				munieTwo.mostrarStats();
			} else if (eleccion == 3) {
				Combate combate = new Combate(munieOne, munieTwo);
				combate.empezarCombate();
			} else if (eleccion == 4) {
				System.out.println("Programa finalizado.");
			}
		} while (eleccion != 4);
	}
	
	public static int mostrarMenu() {
		System.out.println("");
		System.out.println("1.Dar de alta Muniemon (Solo podremos dar 2 Muniemons)");
		System.out.println("2.Mostrar Muniemons");
		System.out.println("3.Empezar combate");
		System.out.println("4.Salir del programa");
		System.out.println("Seleccione del 1-4 que opción desea");
		return sc.nextInt();
	}
	
	public static Muniemon creacionMuniemon() {
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
		muniemon.asignacionElementoMuniemon();

		Interfaz.endingFuncion(" la creación de tu muniemon");
		
		return muniemon;
	}

	
}
