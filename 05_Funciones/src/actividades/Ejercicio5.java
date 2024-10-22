package actividades;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		double hypotenuseOfTheTriangle = hypotenuseOfTheTriangle(5, 8);
		System.out.println("La hipotenusa del triángulo es " + hypotenuseOfTheTriangle);
		
		hypotenuseOfTheTriangle = hypotenuseOfTheTriangle(8, 4);
		System.out.println("La hipotenusa del triángulo es " + hypotenuseOfTheTriangle);
		
	}
	
	public static double hypotenuseOfTheTriangle(int catetoA, int catetoB) {
		
		double hypotenuseOfTheTriangle = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
		return hypotenuseOfTheTriangle;
		
	}

}
