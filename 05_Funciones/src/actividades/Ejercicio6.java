package actividades;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		System.out.println("Las operaciones suma, resta, multiplicacion y división con 5 y 8 son:");
		
		double suma = suma(5, 8);
		System.out.println("La suma es " + suma);
		
		double resta = resta(5, 8);
		System.out.println("La resta es " + resta);
		
		double multiplicacion = multiplicacion(5, 8);
		System.out.println("La perímetro del rectángulo es " + multiplicacion);
		
		double division = division(5, 8);
		System.out.println("La división es " + division);
		
	}
	
	public static double suma(int numeroA, int numeroB) {
		
		double suma = numeroA + numeroB;
		return suma;
		
	}
	
	public static double resta(int numeroA, int numeroB) {
		
		double resta = numeroA - numeroB;
		return resta;
		
	}
	
	public static double multiplicacion(int numeroA, int numeroB) {
		
		double multiplicacion = numeroA * numeroB;
		return multiplicacion;
		
	}
	
	public static double division(int numeroA, int numeroB) {
		
		double division = numeroA / numeroB;
		return division;
		
	}

}
