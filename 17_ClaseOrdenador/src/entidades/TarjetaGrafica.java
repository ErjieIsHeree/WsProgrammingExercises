package entidades;

public class TarjetaGrafica {
	
	String marca;
	String modelo;
	int nucleosCUDA;
	double precio;
	RAM ram;
	
	public TarjetaGrafica() {
		super();
	}

	public TarjetaGrafica(String marca, String modelo, int nucleosCUDA, double precio, RAM ram) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nucleosCUDA = nucleosCUDA;
		this.precio = precio;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "TarjetaGrafica [marca=" + marca + ", modelo=" + modelo + ", nucleosCUDA=" + nucleosCUDA + ", precio="
				+ precio + ", ram=" + ram + "]";
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

	public int getNucleosCUDA() {
		return nucleosCUDA;
	}

	public void setNucleosCUDA(int nucleosCUDA) {
		this.nucleosCUDA = nucleosCUDA;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}
	
}
