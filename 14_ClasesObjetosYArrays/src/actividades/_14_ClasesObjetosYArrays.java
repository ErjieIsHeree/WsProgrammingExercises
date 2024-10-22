package actividades;

import java.util.Scanner;

public class _14_ClasesObjetosYArrays {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Equipo equipoA = creadorDeEquipo(sc);
		Equipo equipoB = creadorDeEquipo(sc);
		
		Equipo[] equipos = new Equipo[2];
		equipos[0] = equipoA;
		equipos[1] = equipoB;
		
		for (int i = 0; i < 2; i++) {
			System.out.println();
			System.out.println("-----------Equipo 1----------");
			equipos[i].toStrin();
			equipos[i].jugadores();
			System.out.println("Dime el nombre de un jugador");
			String jugadorDeUsuario = sc.nextLine();
			System.out.println("El jugador que me mencionaste existe? " 
					+ equipos[i].existeJugador(jugadorDeUsuario));
			System.out.println("El equipo es apto para jugar? " 
					+ equipos[i].aptoParaJugar());
			int numeroEquipo = 0;
			if (i == 0) {
				numeroEquipo = 1;
			} else {
				numeroEquipo = 0;
			}
			System.out.println("Los equipos tienen los mismos jugadores? " 
					+ equipos[i].listasIguales(equipos[numeroEquipo]));
			System.out.println("Los equipos son iguales? " 
					+ equipos[i].equiposIguales(equipos[numeroEquipo]));
		}
		
	}
	
	public static String[] creadorDeJugadores(Scanner sc) {
		System.out.println("Cuántas personas hay en el equipo?");
		int tamanioEquipo = sc.nextInt();
		sc.nextLine();
		String[] jugadores = new String[tamanioEquipo];
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println("Dime el nombre del " + (i+1) + " jugador");
			jugadores[i] = sc.nextLine();
		}
		return jugadores;
	}
	
	public static String creadorDeNombre(Scanner sc) {
		System.out.println("Dime el nombre del equipo");
		return sc.nextLine();
	}
	
	public static Equipo creadorDeEquipo(Scanner sc) {
		String nombreDeEquipo = creadorDeNombre(sc);
		String[] jugadores = creadorDeJugadores(sc);
		return new Equipo(nombreDeEquipo, jugadores);
	}

}
