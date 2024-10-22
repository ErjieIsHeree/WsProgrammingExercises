package entiedades;

public class JefeProyecto extends Empleado {
	
	private double incentivo;
	
	public JefeProyecto() {
		super();
		establecerId();
	}
	
	@Override
	public String toString() {
		return "JefeProyecto [incentivo=" + incentivo + ", id=" + getId() + ", dni=" + getDni()
				+ ", nombre=" + getNombre() + ", salario total=" + getSalarioTotal() + "]";
	}

	public double getIncentivo() {
		return incentivo;
	}
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	@Override
	public double devolverSalarioTot() {
		// TODO Auto-generated method stub
		return super.devolverSalarioTot() + incentivo;
	}
	

}
