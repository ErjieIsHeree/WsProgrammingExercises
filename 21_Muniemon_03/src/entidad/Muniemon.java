package entidad;

import java.util.Scanner;

import entidad.Muniemon;
import enumerador.TipoElemento;

public class Muniemon {
	
	Scanner sc = new Scanner(System.in);
	
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private int velocidad;
	private TipoElemento tipoElemento;
	
	public Muniemon() {
		super();
	}
	
	public Muniemon(String nombre, int vida, int ataque, int defensa, int velocidad, TipoElemento tipoElemento) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.tipoElemento = tipoElemento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public TipoElemento getTipoElemento() {
		return tipoElemento;
	}

	public void setTipoElemento(TipoElemento tipoElemento) {
		this.tipoElemento = tipoElemento;
	}

	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", velocidad=" + velocidad + ", tipoElemento=" + tipoElemento + "]";
	}
	
	//Asigna nombre al muniemon
	public void asignacionNombreMuniemon() {
		
		Interfaz.openingFuncion("Asignación de nombre");
		
		System.out.println("¿Qué nombre deseas darle a tu muniemon?");
		System.out.println();
		this.nombre = sc.nextLine();
		
		Interfaz.endingFuncion(" la asignación");
		
	}
	
	//Asigna estadísticas al muniemon
	public void asignacionStatsMuniemon() {
		
		Interfaz.openingFuncion("Asignación de Stats");
		
		int statsRestantes = 99;
		int apliStats = 0;
		boolean aplicadoCorrectamente = false;
		
		//Asignación de vida
		do {
			System.out.println();
			System.out.println("¿Cuántos puntos deseas aplicar en vida?");
			System.out.println("(Pon 0 si no te quedan puntos que añadir)");
			System.out.println();
			apliStats = sc.nextInt();
			System.out.println();
			if (apliStats >= 0 && apliStats <= statsRestantes) {
				this.vida = 1 + apliStats;
				statsRestantes -= apliStats;
				aplicadoCorrectamente = true;
			} else {
				System.out.println("Error, no se puede introducir esta cantidad"
						+ " de puntos");
				mostrarStats();
			}
		} while (!aplicadoCorrectamente);
		
		//Asignación de ataque
		aplicadoCorrectamente = false;
		do {
			System.out.println();
			System.out.println("¿Cuántos puntos deseas aplicar en ataque?");
			System.out.println("(Pon 0 si no te quedan puntos que añadir)");
			System.out.println();
			apliStats = sc.nextInt();
			System.out.println();
			if (apliStats >= 0 && apliStats <= statsRestantes) {
				this.ataque = 1 + apliStats;
				statsRestantes -= apliStats;
				aplicadoCorrectamente = true;
			} else {
				System.out.println("Error, no se puede introducir esta cantidad"
						+ " de puntos");
				mostrarStats();
			}
		} while (!aplicadoCorrectamente);
		
		//Asignación de defensa
		aplicadoCorrectamente = false;
		do {
			System.out.println();
			System.out.println("¿Cuántos puntos deseas aplicar en defensa?");
			System.out.println("(Pon 0 si no te quedan puntos que añadir)");
			System.out.println();
			apliStats = sc.nextInt();
			System.out.println();
			if (apliStats >= 0 && apliStats <= statsRestantes) {
				this.defensa = 1 + apliStats;
				statsRestantes -= apliStats;
				aplicadoCorrectamente = true;
			} else {
				System.out.println("Error, no se puede introducir esta cantidad"
						+ " de puntos");
				mostrarStats();
			}
		} while (!aplicadoCorrectamente);
		
		//Asignación de defensa
		aplicadoCorrectamente = false;
		do {
			System.out.println();
			System.out.println("¿Cuántos puntos deseas aplicar en velocidad?");
			System.out.println("(Pon 0 si no te quedan puntos que añadir)");
			System.out.println();
			apliStats = sc.nextInt();
			System.out.println();
			if (apliStats >= 0 && apliStats <= statsRestantes) {
				this.velocidad = 1 + apliStats;
				statsRestantes -= apliStats;
				aplicadoCorrectamente = true;
			} else {
				System.out.println("Error, no se puede introducir esta cantidad"
						+ " de puntos");
				mostrarStats();
			}
		} while (!aplicadoCorrectamente);
		
		Interfaz.endingFuncion(" la asignación");
		
	}
	
	//Muestra solo las estadísticas de muniemon
	public void mostrarStats() {
		
		Interfaz.openingFuncion("Estadísticas " + this.nombre);
		
		System.out.println();
		System.out.println("Vida: 		" + this.vida);
		System.out.println();
		System.out.println("Ataque: 	" + this.ataque);
		System.out.println();
		System.out.println("Defensa:	" + this.defensa);
		System.out.println();
		System.out.println("Velocidad:	" + this.velocidad);
		System.out.println();
		int statsRestantes = 99;
		statsRestantes -= (this.vida - 1);
		statsRestantes -= (this.ataque - 1);
		statsRestantes -= (this.defensa - 1);
		statsRestantes -= (this.velocidad - 1);
		System.out.println("Stats restantes: " + statsRestantes);
		
		Interfaz.endingFuncion(" la muestra de stats");
		
	}
	
	//Asigna elementos al muniemon
	public void asignacionElementoMuniemon() {
		
		Interfaz.openingFuncion("Asignación de elemento");

		System.out.println();
		System.out.println("Elije de que elemento es tu muniemon");
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "-" + TipoElemento.values()[i]);
		}
		this.tipoElemento = TipoElemento.values()[(sc.nextInt() - 1)];
		
		Interfaz.endingFuncion(" la asignación");
		
	}
	
}
