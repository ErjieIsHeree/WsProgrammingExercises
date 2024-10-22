package actividades;

public class _12_ConstructoresYMétodos2 {
	
	public static void main(String[] args) {
		
		Coche c1 = new Coche(9873424, "Nissan", "AG91713", 450, "25/05/2024", 400);
		Coche c2 = new Coche();
		
		System.out.println(c1.toString());
		c1.precioBase();
		c1.anioDeMatriculacion();
		c1.fechaBisiesto();
		System.out.println("El precio de tu coche con " + c1.kilometros + " es de " + c1.precio() + "€");
		System.out.println("Tu coche tiene una cantidad de kilómetros cuyo valor es primo? " + c1.esPrimo());
		if (c1.esPrimo() == true) {
			System.out.println("La cantidad de kilómetros de tu coche es una cantidad de valor primo");
		} else if (c1.esPrimo() == false) {
			System.out.println("La cantidad de kilómetros de tu coche es una cantidad de valor no primo");
		}
		if (c1.faltaPara200000() > 0) {
			System.out.println("Le faltan " + c1.faltaPara200000() + " kilómetros para llegar a 200.000km");
		} else {
			c1.faltaPara200000();
		}
		System.out.println("La marca y modelo de tu coche tiene " + c1.numeroDeCaracteres() + " caracteres");
		double diferenciaDeKM = c1.diferenciaDeKM(500);
		if (diferenciaDeKM < 0) {
			System.out.println("Tienen una diferencia de " + diferenciaDeKM * 1 + "KM");
		} else if (diferenciaDeKM == 0) {
			System.out.println("Tienen la misma cantidad de KM");
		} else {
			System.out.println("Tienen una diferencia de " + diferenciaDeKM + "KM");
		}
		double diferenciaDePrecio = c1.diferenciaDePrecio(500);
		if (diferenciaDePrecio < 0) {
			System.out.println("Tienen una diferencia de " + diferenciaDePrecio * 1 + " precio");
		} else if (diferenciaDePrecio == 0) {
			System.out.println("Cuestan lo mismo");
		} else {
			System.out.println("Tienen una diferencia de " + diferenciaDePrecio + " precio");
		}
		
	}

}
