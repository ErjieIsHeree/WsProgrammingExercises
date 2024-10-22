package main;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Coche;

public class MainCoches {
	
	private ArrayList<Coche> listaCoches = new ArrayList<Coche>();
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		MainCoches main = new MainCoches();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("        Bienvenidos       ");
		System.out.println("--------------------------");
		System.out.println("1.Crear coche");
		System.out.println("2.Mostrar coches");
		System.out.println("3.Mostrar contadorID");
		System.out.println("4.Resetear contadorID");
		System.out.println("5.Salir del programa");
		System.out.println();
		System.out.println("Elija una opción (1-5):");
		int eleccion = sc.nextInt();
		main.arrancarPrograma(eleccion);
		
	}
	
	public void arrancarPrograma(int eleccion) {
		
		do {
			if (eleccion == 1) {
				crearCoche();
			} else if (eleccion == 2) {
				listaCoches.toString();
			} else if (eleccion == 3) {
				listaCoches.get(0).mostrarContador();
			} else if (eleccion == 4) {
				listaCoches.get(0).resetContadorID();
			} else if (eleccion == 5) {
				System.out.println("Programa cerrado.");
			} else {
				System.out.println("Esta opción no existe, elija otra");
			}
		} while (eleccion != 5);
		
	}
	
	public void crearCoche() {
		
		Coche c = new Coche();
		
		System.out.println("Dime la matrícula del coche");
		String matricula = sc.nextLine();
		System.out.println("Dime la marca del coche");
		String marca = sc.nextLine();
		
		listaCoches.add(c);
		
	}

}
