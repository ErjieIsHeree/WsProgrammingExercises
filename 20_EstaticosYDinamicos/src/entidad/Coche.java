package entidad;

public class Coche {
	
	private int id;
	private String matricula;
	private String marca;
	private static int contadorID = 0;
	private static final String toy = "TOYOTA";
	private static final String ren = "RENAULT";
	
	public Coche() {
		super();
		this.id = contadorID;
		contadorID++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static int getContadorID() {
		return contadorID;
	}

	public static String getToy() {
		return toy;
	}

	public static String getRen() {
		return ren;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}

	public static void mostrarContador() {
		System.out.println(contadorID);
	}
	
	public void resetContadorID() {
		contadorID = 0;
	}
	
}
