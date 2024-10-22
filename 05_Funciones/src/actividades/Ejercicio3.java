package actividades;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		int perimetroDelRectangulo = perimetroDelRectangulo(5, 8);
		System.out.println("El perímetro del rectángulo es " + perimetroDelRectangulo);
		
		perimetroDelRectangulo = perimetroDelRectangulo(8, 4);
		System.out.println("El perímetro del rectángulo es " + perimetroDelRectangulo);
		
	}
	
	public static int perimetroDelRectangulo(int ladoA, int ladoB) {
		
		int perimetroDelRectangulo = ladoA * 2 + ladoB * 2;
		return perimetroDelRectangulo;
		
	}

}
