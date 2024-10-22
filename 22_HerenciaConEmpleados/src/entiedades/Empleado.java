package entiedades;

public class Empleado {
	
	/**
	 * El atributo contador llevará la cuenta de la cantidad de empleados que
	 * hay en la empresa, a su vez, dará el id de los empleados. Al crear la
	 * clase empleado se debera asignar un valor inicial al contador, a partir
	 * de el se le asignaran los valores a id. El valor debe de ser mayor que 0
	 * o podria no funcionar correctamente
	 */
	private static int contador;
	private int id;
	private String dni;
	private String nombre;
	private double sueldoBase;
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Empleado.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	/**
	 * El metodo giveId() le da un id () al objeto si no tiene uno ya. Tambien
	 * aumentara el valor del atributo contador en 1
	 */
	public void establecerId() {
		if (this.id == 0) {
			this.id = Empleado.contador++;
			System.out.println("El nuevo id del empleado es " + this.id);
		} else {
			System.out.println("Este empleado ya tiene id");
		}
	}
	public double devolverSalarioTot() {
		return this.sueldoBase;
	}
}
