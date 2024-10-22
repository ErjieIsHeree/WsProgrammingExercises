package actividades;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		int areaDelRectangulo = areaDelRectangulo(5, 8);
		System.out.println("El área del rectángulo es " + areaDelRectangulo);
		
		areaDelRectangulo = areaDelRectangulo(8, 4);
		System.out.println("El área del rectángulo es " + areaDelRectangulo);
		
	}
	
	public static int areaDelRectangulo(int ladoA, int ladoB) {
		
		int areaDelRectangulo = ladoA * ladoB;
		return areaDelRectangulo;
		
	}

}
