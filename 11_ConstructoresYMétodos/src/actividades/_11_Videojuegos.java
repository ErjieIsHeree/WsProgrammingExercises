package actividades;

import java.util.Scanner;

public class _11_Videojuegos {
	
	public static void main(String[] args) {
		
		long id = 0L;
		String nombre = "Empty value";
		int puntuacion = 0;
		double precioEnEuros = 0;
		String fechaDeCreacion = "Empty value";
		boolean esDeSegunda = false;
		String yesNo = "no";
		
		Scanner sc = new Scanner(System.in);
		
		
		//ID
		System.out.println("¿Cuál es el id del juego?");
		id = sc.nextLong();
		sc.nextLine();
		System.out.println();
		
		//Nombre
		System.out.println("Dime el nombre del juego");
		nombre = sc.nextLine();
		System.out.println();
				
		//Puntuación
		System.out.println("¿Cuántos puntos le darías?");
		puntuacion = sc.nextInt();
		System.out.println();
		
		//Precio
		System.out.println("¿Cuánto cuesta?");
		precioEnEuros = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		
		//Fecha de creación
		System.out.println("¿Cuándo fue creado?");
		fechaDeCreacion = sc.nextLine();
		System.out.println();
		
		//Segunda mano?
		System.out.println("Es de segunda mano? (Yes/No)");
		yesNo = sc.nextLine();
		if (yesNo.equalsIgnoreCase("yes")) {
			esDeSegunda = true;
		} else if (yesNo.equalsIgnoreCase("no")) {
			esDeSegunda = false;
		}
		
		Videojuego vdjg = new Videojuego(id, nombre, puntuacion, precioEnEuros, fechaDeCreacion, esDeSegunda);
		Videojuego vdjg2 = new Videojuego();
		Videojuego namFec = new Videojuego(nombre, fechaDeCreacion);
		
		System.out.println("-------------------1-------------------");
		vdjg2.showAllData();
		System.out.println();
		
		System.out.println("-------------------2-------------------");
		namFec.show2Data();
		System.out.println();
		
		System.out.println("-------------------3-------------------");
		vdjg2.enLibras();
		System.out.println();
		
		System.out.println("-------------------4-------------------");
		vdjg2.fecha();
		System.out.println();
		
		System.out.println("-------------------5-------------------");
		vdjg2.descuento();
		System.out.println();
		
		System.out.println("-------------------6-------------------");
		vdjg2.esApto();
		System.out.println();
		
		System.out.println("-------------------7-------------------");
		vdjg2.repeat();
		System.out.println();
		
		System.out.println("-------------------8-------------------");
		System.out.println("Dime el nombre de otro juego");
		nombre = sc.nextLine();
		System.out.println("¿Cuánto cuesta?");
		precioEnEuros = sc.nextDouble();
		vdjg2.comparacion(nombre, precioEnEuros);
		System.out.println(vdjg2.comparacion(nombre, precioEnEuros));
		System.out.println();
		
		System.out.println("-------------------9-------------------");
		System.out.println("¿Cuál es el id del juego?");
		vdjg2.id = sc.nextLong();
		sc.nextLine();
		System.out.println("Dime el nombre del juego");
		vdjg2.nombre = sc.nextLine();
		System.out.println("¿Cuántos puntos le darías?");
		vdjg2.puntuacion = sc.nextInt();
		System.out.println("¿Cuánto cuesta?");
		vdjg2.precioEnEuros = sc.nextDouble();
		System.out.println("Es de segunda mano? (Yes/No)");
		yesNo = sc.nextLine();
		if (yesNo.equalsIgnoreCase("yes")) {
			vdjg2.esDeSegunda = true;
		} else if (yesNo.equalsIgnoreCase("no")) {
			vdjg2.esDeSegunda = false;
		}
		
		
		sc.close();
	}

}
