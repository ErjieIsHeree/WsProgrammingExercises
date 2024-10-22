package main;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Equipo;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Equipo equipoA = creadorDeEquipo(sc);
		Equipo equipoB = creadorDeEquipo(sc);
		
		ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
		listaEquipos.add(equipoA);
		listaEquipos.add(equipoB);
		
		for (Equipo s : listaEquipos) {
			System.out.println("------------------1------------------");
			s.toString();
			System.out.println();
			System.out.println("------------------2------------------");
			s.mostrarJugadores();
			System.out.println();
			System.out.println("------------------3------------------");
			System.out.println("Dime un nombre y comprobaré si existe un jugador"
					+ "con el mismo nombre");
			String jugador = sc.nextLine();
			if (s.existeJugador(jugador)) {
				System.out.println("Si existe");
			} else {
				System.out.println("No existe");
			}
			System.out.println();
			System.out.println("------------------4------------------");
			System.out.println("Hay " + s.cantidadJugadores() + " en el equipo");
			System.out.println();
			System.out.println("------------------5------------------");
			System.out.println("El equipo es apto para jugar?");
			if (s.esApto()) {
				System.out.println("Es apto");
			} else {
				System.out.println("No es apto");
			}
			System.out.println();
			System.out.println("------------------6------------------");
			System.out.println("Los equipos A y B tienen los mismos jugadores?");
			if (s.esIgual(equipoB.listaJugadores)) {
				System.out.println("Son iguales");
			} else {
				System.out.println("No son iguales");
			}
			System.out.println();
			System.out.println("------------------7------------------");
			System.out.println("El equipo " + s + " es igual/el "
					+ "mismo al segundo equipo?");
			if (s.esIgual(equipoB)) {
				System.out.println("Son iguales");
			} else {
				System.out.println("No son iguales");
			}
		}
				
	}
	
	public static Equipo creadorDeEquipo(Scanner sc) {
		
		//Creador nombre
		System.out.println("Dime el nombre del equipo");
		String nombreEquipo = sc.nextLine();
		
		//Creador lista de jugadores
		ArrayList<String> listaJugadores = new ArrayList<String>();
		boolean introduceMasJugadores = true;
		do {
			System.out.println("Dime un jugador del equipo");
			String respuesta = sc.nextLine();
			listaJugadores.add(respuesta);
			System.out.println("Quieres introducir otro jugador? (S/N)");
			respuesta = sc.nextLine();
			if (respuesta.equalsIgnoreCase("n")) {
				introduceMasJugadores = false;
			}
		} while (introduceMasJugadores);
		
		//Creador equipo
		Equipo equipo = new Equipo(nombreEquipo, listaJugadores);
		return equipo;
	}
	
}