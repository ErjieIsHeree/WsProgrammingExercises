package actividades;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		mediaDeTres(5, 2, 8);
		mediaDeTres(2, 5, 9);
		
	}
	
	public static void mediaDeTres(int numeroA, int numeroB, int numeroC) {
		
		double mediaDeTres = (numeroA * numeroB * numeroC) / 3;
		System.out.println("La media es " + mediaDeTres);
		
	}

}
