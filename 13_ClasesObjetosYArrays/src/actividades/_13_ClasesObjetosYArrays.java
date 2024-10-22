package actividades;

import java.util.Scanner;

public class _13_ClasesObjetosYArrays {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el id de un usuario");
		long id = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Dime el nombre del usuario");
		String nombre = sc.nextLine();
		
		double[] valoraciones = new double[5];
		
		System.out.println("Dime 5 valoraciones que le darías");
		for (int i = 0; i < 5; i++) {
			valoraciones[i] = sc.nextDouble();
		}
		User u1 = new User(id, nombre, valoraciones);
		
		System.out.println("Dime el id de otro usuario");
		id = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Dime el nombre del usuario");
		nombre = sc.nextLine();
		
		valoraciones = new double[5];
		System.out.println("Dime 5 valoraciones que le darías");
		for (int i = 0; i < 5; i++) {
			valoraciones[i] = sc.nextDouble();
		}
		User u2 = new User(id, nombre, valoraciones);
		
		System.out.println("Dime el id del último usuario");
		id = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Dime el nombre del usuario");
		nombre = sc.nextLine();
		
		valoraciones = new double[5];
		System.out.println("Dime 5 valoraciones que le darías");
		for (int i = 0; i < 5; i++) {
			valoraciones[i] = sc.nextDouble();
		}
		User u3 = new User(id, nombre, valoraciones);
		
		User[] usuarios = new User[3];
		
		usuarios[0] = u1;
		usuarios[1] = u2;
		usuarios[2] = u3;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("El " + (i + 1) + "º usuario");
			System.out.println(usuarios[i].toString());
			System.out.println();
			System.out.println("La valoración media del usuario es " + usuarios[i].valMed());
			System.out.println();
			usuarios[i].valoraciones();
			System.out.println();
			System.out.println();
			System.out.println("Dime una valoración del 0 al 10");
			double valoracion = sc.nextDouble();
			System.out.println();
			System.out.println("Tu valoración está por debajo de otras " + usuarios[i].mejVals(valoracion) + " valoraciones");
			System.out.println();
			System.out.println("Tu valoración está por encima de la valoración media?");
			System.out.println(usuarios[i].mejQueValMed(valoracion));
			System.out.println();
			System.out.println("---------------------------------------------------------------------------------");
		}
		
	}

}
