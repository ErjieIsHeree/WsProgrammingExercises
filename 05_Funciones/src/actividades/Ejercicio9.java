package actividades;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		
		sueldoTotal(1200, 20, 14);
		sueldoTotal(1500, 50, 30);
		
	}
	
	public static void sueldoTotal(double salarioBase, double horasExtras, double tiempoDeHorasExtras) {
		
		double sueldoTotal = salarioBase + horasExtras * tiempoDeHorasExtras;
		System.out.println("El sueldo total es " + sueldoTotal);
		
	}

}
