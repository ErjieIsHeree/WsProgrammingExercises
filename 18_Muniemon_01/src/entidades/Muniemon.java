package entidades;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Interfaz;
import enumeradores.TipoElemento;

public class Muniemon {
	
	Scanner sc = new Scanner(System.in);
	
	private String nombre;
	private int vida = 1;
	private int ataque = 1;
	private int defensa = 1;
	private ArrayList<TipoElemento> listaTipoElemento;
	
	public Muniemon() {
		super();
	}
	
	public Muniemon(String nombre, int vida, int ataque, int defensa, ArrayList<TipoElemento> tipo) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.listaTipoElemento = tipo;
	}

	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", tipo=" + listaTipoElemento + "]";
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

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public ArrayList<TipoElemento> getTipo() {
		return listaTipoElemento;
	}

	public void setTipo(ArrayList<TipoElemento> tipo) {
		this.listaTipoElemento = tipo;
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
		
		Interfaz.endingFuncion(" la asignación");
		
	}
	
	//Muestra solo las estadísticas de muniemon
	public void mostrarStats() {
		
		Interfaz.openingFuncion("Estadísticas");
		
		System.out.println();
		System.out.println("Vida: 		" + this.vida);
		System.out.println();
		System.out.println("Ataque: 	" + this.ataque);
		System.out.println();
		System.out.println("Defensa:	" + this.defensa);
		System.out.println();
		int statsRestantes = 99;
		statsRestantes -= (this.vida - 1);
		statsRestantes -= (this.ataque - 1);
		statsRestantes -= (this.defensa - 1);
		System.out.println("Stats restantes: " + statsRestantes);
		
		Interfaz.endingFuncion(" la muestra de stats");
		
	}
	
	//Asigna elementos al muniemon
	public void asignacionElementosMuniemon() {
		
		ArrayList<TipoElemento> listaTipoElemento = new ArrayList<TipoElemento>();
		
		Interfaz.openingFuncion("Asignación de elementos");
		
		//Asignación de elementos------------------------------------------
		System.out.println("¿Cuántos elementos controla tu muniemon?"
				+ " (Solo puede controlar 1 o 2 elementos)");
		System.out.println();
		//Control cantidad de elementos------------------------------------
		int cantidadElementos = 0;
		do {
			cantidadElementos = sc.nextInt();
			if (cantidadElementos < 0 || cantidadElementos > 3) {
				System.out.println("El muniemon debe tener 1 o 2 elementos");
				System.out.println("Introduce cuántos elementos debe tener");
			}
		} while (cantidadElementos < 0 || cantidadElementos > 3);
		System.out.println();
		System.out.println();
		//Un solo elemento-------------------------------------------------
		System.out.println();
		if (cantidadElementos == 1) {
			System.out.println("Introduce el número del elemento que controla");
			for (int i = 0; i < TipoElemento.values().length; i++) {
				System.out.println(( i + 1 ) + "-" + TipoElemento.values()[i]);
			}
			int seleElem = sc.nextInt();
			listaTipoElemento.add(TipoElemento.values()[seleElem-1]);
		} else {
		
		//Dos elementos----------------------------------------------------
			//Primer elemento
			System.out.println();
			System.out.println("Introduce el número del primer elemento que"
					+ "controla");
			for (int i = 0; i < TipoElemento.values().length; i++) {
					System.out.println(( i + 1 ) + "-" + TipoElemento.values()[i]);
			}
			int seleElem = sc.nextInt();
			listaTipoElemento.add(TipoElemento.values()[seleElem - 1]);
			int seleElem2 = 0;
			//Segundo elemento
			do {
				System.out.println();
				System.out.println("Introduce el número del segundo elemento"
					+ "que controla");
				for (int i = 0; i < TipoElemento.values().length; i++) {
					System.out.println(( i + 1 ) + "-" + TipoElemento.values()[i]);
				}
				seleElem2 = sc.nextInt();
				listaTipoElemento.add(1, TipoElemento.values()[seleElem2 - 1]);
				if (seleElem == seleElem2) {
					System.out.println("Los elementos no pueden ser iguales, "
							+ "por favor selecciona otro");
				}
			} while (seleElem == seleElem2);
		}
		
		Interfaz.endingFuncion(" la asignación");
		
		this.listaTipoElemento = listaTipoElemento;
		
	}
	
}
