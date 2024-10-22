package game;

public abstract class Personaje {
	
	private String nombre;
	private Arma arma;
	public int ataque;
	private int vida;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", arma=" + arma + ", ataque=" + ataque + ", vida=" + vida + "]";
	}

	public abstract void Ataca(Personaje p1);

}
