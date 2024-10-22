package entidades;

public class Procesador {
	
	String marca;
	String modelo;
	int numeroNucleos;
	double precio;
	
	public Procesador() {
		super();
	}
	
	public Procesador(String marca, String modelo, int numeroNucleos, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroNucleos = numeroNucleos;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", numeroNucleos=" + numeroNucleos + ", precio="
				+ precio + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroNucleos() {
		return numeroNucleos;
	}

	public void setNumeroNucleos(int numeroNucleos) {
		this.numeroNucleos = numeroNucleos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
