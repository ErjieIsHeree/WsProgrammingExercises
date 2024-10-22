package entiedades;

import java.util.ArrayList;

public class Director extends Empleado {
	
	ArrayList<Empleado> listaEmpleados;
	
	public Director() {
		super();
		establecerId();
	}
	
	@Override
	public String toString() {
		return "Director [listaEmpleados=" + listaEmpleados + ", id=" + getId() + ", dni=" + getDni()
				+ ", nombre=" + getNombre() + ", sueldo base=" + getSueldoBase() + "]";
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	
	/**
	 * Crea una lista de empleados que estan bajo la direccion del director
	 * @param <b>Lista de todos los empleados</b>
	 */
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		
		this.listaEmpleados = listaEmpleados;
	}

	/**
	 * Devuelve el salario total que sera el sueldo base mas 100€ por cada
	 * empleado que tenga bajo su direccion.
	 * 
	 * @return <b>salario total</b>
	 */
	@Override
	public double devolverSalarioTot() {
		// TODO Auto-generated method stub
		return super.devolverSalarioTot() + 100 * listaEmpleados.size();
	}
	
}
