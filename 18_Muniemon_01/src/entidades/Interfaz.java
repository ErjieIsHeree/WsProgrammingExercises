package entidades;

public class Interfaz {
	
	//Comienzo de una funcion
	public static void openingFuncion(String title) {
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println(title);
		System.out.println("--------------------------------");
		System.out.println();
	}
	
	//Finaliza una función
	public static void endingFuncion(String funcion) {
		System.out.println();
		System.out.println("Fin de" + funcion);
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
	}

}
