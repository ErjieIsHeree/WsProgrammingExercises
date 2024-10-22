package entidad;

import java.util.ArrayList;

public class Equipo {
	
	public String nombre;
	public ArrayList<String> listaJugadores;

	public Equipo() {
		super();
	}

	public Equipo(String nombre, ArrayList<String> listaJugadores) {
		super();
		this.nombre = nombre;
		this.listaJugadores = listaJugadores;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaJugadores=" + listaJugadores + "]";
	}

	public void mostrarJugadores() {
		System.out.println(listaJugadores);
	}
	
	public boolean existeJugador(String jugador) {
		for (String s : listaJugadores) {
			if (jugador.equalsIgnoreCase(s)) {
				return true;
			}
		}
		return false;
	}
	
	public int cantidadJugadores() {
		return listaJugadores.size();
	}
	
	public boolean esApto() {
		if (cantidadJugadores() > 6) {
			return true;
		}
		return false;
	}
	
	public boolean esIgual(ArrayList<String> listaJugadores) {
		if (this.listaJugadores.size() == listaJugadores.size()) {
			return false;
		}
		for (String s : this.listaJugadores) {
			for (String s2 : listaJugadores) {
				if (s.equalsIgnoreCase(s2)) {
					continue;
				}
				return false;
			}
		}
		return true;
	}
	
	public boolean esIgual(Equipo equipo) {
		if (this.nombre.equalsIgnoreCase(equipo.nombre) && esIgual(listaJugadores)) {
			return true;
		}
		return false;
	}
	
}
