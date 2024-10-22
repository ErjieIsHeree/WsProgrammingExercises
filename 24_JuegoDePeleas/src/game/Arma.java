package game;

public abstract class Arma {
	
	private String nombre;
	public final int ATAQUE = 10;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", ATAQUE=" + ATAQUE + "]";
	}

}
