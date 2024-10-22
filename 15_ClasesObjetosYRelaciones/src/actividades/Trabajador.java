package actividades;

public class Trabajador {
	
	String nombre;
	String dni;
	double salario;
	
	public Trabajador() {
		super();
	}

	public Trabajador(String nombre, String dni, double salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni +
				", salario=" + salario + "]";
	}
	
	public boolean esValido() {
		if (this.dni.length() == 9) {
			return true;
		}
		return false;
	}
	
	public int ganaMas(Trabajador trabajador2) {
		if (this.salario > trabajador2.salario) {
			return 1;
		} else if (this.salario == trabajador2.salario) {
			return 0;
		}
		return 2;
	}
	
	public boolean sonTrabajadoresIguales(Trabajador trabajador2) {
		if (!this.nombre.equalsIgnoreCase(trabajador2.nombre)) {
			return false;
		} else if (!this.dni.equalsIgnoreCase(trabajador2.dni)) {
			return false;
		} else if (this.salario != trabajador2.salario) {
			return false;
		}
		return true;
	}
	
}
