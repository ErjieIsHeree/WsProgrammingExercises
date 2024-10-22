package actividades;

public class Videojuego {
	
	long id;
	String nombre;
	int puntuacion;
	double precioEnEuros;
	String fechaDeCreacion;
	boolean esDeSegunda;
	
	//--------------------Constructores--------------------
	

	
	public Videojuego() {
		this.fechaDeCreacion = "01/01/1970";
	}
	
	public Videojuego(long id, String nombre, int puntuacion, double precioEnEuros, String fechaDeCreacion, boolean esDeSegunda) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precioEnEuros = precioEnEuros;
		this.fechaDeCreacion = fechaDeCreacion;
		this.esDeSegunda = esDeSegunda;
	}
	
	public Videojuego(String nombre, String fechaDeCreacion) {
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
	}
	
	public Videojuego(String nombre, double precioEnEuros) {
		this.nombre = nombre;
		this.precioEnEuros = precioEnEuros;
	}
	
	//-------------------Métodos---------------------------
	
	//--1--
	public void showAllData() {
		
		System.out.println("ID: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Puntuación: " + this.puntuacion);
		System.out.println("Precio (€): " + this.precioEnEuros);
		System.out.println("Fecha de creación: " + this.fechaDeCreacion);
		System.out.println("Es de segunda? " + this.esDeSegunda);
		
	}
	
	//--2--
	public void show2Data() {
		
		System.out.println("El nombre del juego es " + this.nombre);
		System.out.println("La puntuación del juego es " + this.puntuacion);
		
	}
	
	//--3--
	public void enLibras() {
		
		System.out.println("Su precio en libras es " + this.precioEnEuros * 2.205);
		
	}
	
	//--4--
	public void fecha() {
		
		System.out.println("Una fecha antes de recibir cambios " + this.fechaDeCreacion);
		String fechaFormato = this.fechaDeCreacion.replace('/', '-');
		System.out.println("Una fecha " + fechaFormato);
		
	}
	
	//--5--
	public void descuento() {
		
		if (esDeSegunda == true) {
			
			System.out.println("Felicidades! Este videojuego tiene descuento del 30% su precio final será " + this.precioEnEuros * 30 / 100);
			
		} else {
			
			System.out.println("No tienes descuento 'pringao'");
			
		}
		
	}
	
	//--6--
	public void esApto() {
		
		if (this.puntuacion >= 5) {
			
			System.out.println("Es apto");
			
		} else {
			
			System.out.println("No es apto");
			
		}
		
	}
	
	//--7--
	public void repeat() {
		
		System.out.println("Por encima de la nota del juego están los números");
		
		for (int i = this.puntuacion + 1; i <= 10; i++) {
			
			if (this.puntuacion == 10) {
				System.out.println("Tu juego alcanzó la puntuación máxima");
			} else {
				if (i == this.puntuacion)
					i++;
				System.out.print(i);
				if (i == 10)
					System.out.println();
			}
			
			if (i < 10) {
				System.out.print(" - ");
			}
		}
		
	}
	
	//--8--
	public boolean comparacion(String nombre, double precioEnEuros) {
		
		boolean cuestaMas = false;
		
		if (this.precioEnEuros < precioEnEuros) {
			System.out.println("El juego " + nombre + " cuesta más que " + this.nombre);
			cuestaMas = true;
		} else if (this.precioEnEuros > precioEnEuros) {
			System.out.println("El juego " + this.nombre + " cuesta más que " + nombre);
		} else {
			System.out.println("Ambos juegos cuestan lo mismo");
		}
		
		return cuestaMas;
	}

}
