package actividades;

public class Coche {
	
	long id;
	String marca;
	String modelo;
	double precioBase;
	String fechaDeMatriculacion;
	double kilometros;
	
	public Coche() {
		super();
		String marca = "";
		String modelo = "";
	}

	public Coche(int id, String marca, String modelo, double precioBase, String fechaDeMatriculacion, double kilometros) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.fechaDeMatriculacion = fechaDeMatriculacion;
		this.kilometros = kilometros;
	}

	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precioBase=" + precioBase + ", fechaDeMatriculacion=" + fechaDeMatriculacion + ", kilometros=" + kilometros + "]";
	}
	
	public void precioBase() {
		System.out.println("El precio base es " + this.precioBase);
	}
	
	public void anioDeMatriculacion() {
		System.out.println("Tu coche se matriculó en el año " + this.fechaDeMatriculacion.substring(6, 10));
	}
	
	public void fechaBisiesto() {
		int añoDeMatriculacion = Integer.parseInt(this.fechaDeMatriculacion.substring(6,10));
		if (añoDeMatriculacion % 4 == 0) {
			System.out.println("Lo compraste en un año bisiesto");
		} else {
			System.out.println("No lo compraste en un año bisiesto");
		}
	}
	
	public double precio() {
		double precioBase = this.precioBase;
		if (this.kilometros >= 0) {
			precioBase = this.precioBase;
		} else if (this.kilometros > 10000) {
			precioBase = this.precioBase * 80 / 100;
		} else if (this.kilometros > 50000) {
			precioBase = this.precioBase / 2;
		} else if (this.precioBase == 0 || this.kilometros < 0) {
			System.out.println("Troll");
			precioBase = 0;
		}
		return precioBase;
	}
	
	public boolean esPrimo() {
		boolean esPrimo = true;
		if (this.kilometros <= 1) {
			System.out.println("Voy a ahorrarle a tu pc la operación y decirte que, uno sí es primo de uno :)");
		} else if (this.kilometros == 0) {
			System.out.println("Ere bobo");
		} else if (this.kilometros < 0) {
			System.out.println("Y yo me llamo Juan");
		} else {
			for (int i = (int)this.kilometros - 1; i > 1; i--) {
				if (this.kilometros % i != 0) {
					esPrimo = false;
				}
			}
		}
		return esPrimo;
	}
	
	public double faltaPara200000() {
		double faltaPara200000 = 0;
		if (this.kilometros < 0) {
			System.out.println("ErI BoBo");
		} else if (this.kilometros < 200000) {
			faltaPara200000 = 200_000 - this.kilometros;
		} else {
			System.out.println("Tu coche ya tiene o superó los 200.000km");
		}
		return faltaPara200000;
	}

	public int numeroDeCaracteres() {
		int numeroDeCaracteres = this.modelo.length() + this.marca.length();
		return numeroDeCaracteres;
	}
	
	public double diferenciaDeKM(double kilometros) {
		double diferenciaDeKM = this.kilometros - kilometros;
		return diferenciaDeKM;
	}
	
	public double diferenciaDePrecio(double precio) {
		double diferenciaDePrecio = this.precioBase - precio;
		return diferenciaDePrecio;
	}
	
}
