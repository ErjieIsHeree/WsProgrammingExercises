package entidades;

public class Periferico {
	
	String tipo;
	String marca;
	double precio;
	
	public Periferico() {
		super();
	}

	public Periferico(String tipo, String marca, double precio) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Periferico [tipo=" + tipo + ", marca=" + marca + ", precio=" + precio + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
		
}
