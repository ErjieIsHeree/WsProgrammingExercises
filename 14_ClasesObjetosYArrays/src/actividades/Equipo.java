package actividades;

import java.util.Arrays;

public class Equipo {
	
	String nombre;
	String[] jugadores;
	
	public Equipo() {
	}
	
	public Equipo(String nombre, String[] jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	public void toStrin() {
		System.out.println("Equipo [nombre=" + nombre + ", jugadores=" +
				Arrays.toString(jugadores) + "]");
	}

	public void jugadores() {
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println(jugadores[i]);
		}
	}
	
	public boolean existeJugador(String jugador) {
		for (int i = 0; i < this.jugadores.length; i++) {
			if (this.jugadores[i].equalsIgnoreCase(jugador)) {
				return true;
			}
		}
		return false;
	}
	
	public int cantidadDeJugadores() {
		return this.jugadores.length;
	}
	
	public boolean aptoParaJugar() {
		if (cantidadDeJugadores() > 6) {
			return true;
		}
		return false;
	}
	
	public boolean listasIguales (Equipo segundoEquipo) {
		if (this.jugadores.length != segundoEquipo.jugadores.length) {
			return false;
		}
		boolean[] existenJugadores = new boolean[this.jugadores.length];
		for (int i = 0; i < this.jugadores.length; i++) {
			for (int j = 0; j < segundoEquipo.jugadores.length; j++) {
				if (this.jugadores[i].equalsIgnoreCase(segundoEquipo.jugadores[j])) {
					existenJugadores[i] = true;
				}
			}
		}
		for (int i = 0; i < this.jugadores.length; i++) {
			if (existenJugadores[i] == false) {
				return false;
			}
		}
		return true;
	}
	
	public boolean equiposIguales (Equipo segundoEquipo) {
		if (this.nombre.equalsIgnoreCase(segundoEquipo.nombre)
				&& listasIguales(segundoEquipo)) {
			return true;
		}
		return false;
	}
	
}
