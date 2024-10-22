package actividades;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		double mediaTotal = notaFinal(5, 5, 5, 5, 5);
		System.out.println("La media total de la nota es " + mediaTotal);
		
		mediaTotal = notaFinal(10, 10, 10, 10, 10);
		System.out.println("La media total de la nota es " + mediaTotal);
		
	}
	
	public static double notaFinal(double notaDelExamenParcial1, double notaDelExamenParcial2, double notaDelExamenParcial3, double notaDelExamenFinal, double notaDelTrabajo) {
		
		double mediaDeLosParciales = (notaDelExamenParcial1 + notaDelExamenParcial2 + notaDelExamenParcial3) / 3;
		double mediaTotalF = mediaDeLosParciales * 55 / 100 + notaDelExamenFinal * 30 / 100 + notaDelTrabajo * 15 / 100;
		return mediaTotalF;
		
	}

}
