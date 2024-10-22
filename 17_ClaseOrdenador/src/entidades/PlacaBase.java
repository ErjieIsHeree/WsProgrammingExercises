package entidades;

public class PlacaBase {
	
	String marca;
	double precio;
	String tipo;
	
	public PlacaBase() {
		super();
	}

	public PlacaBase(String marca, double precio, String tipo) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "PlacaBase [marca=" + marca + ", precio=" + precio + ", tipo=" + tipo + "]";
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
