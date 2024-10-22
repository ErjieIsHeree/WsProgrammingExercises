package actividades;

import java.util.Arrays;

public class Empresa {

	String nombre;
	String nif;
	Trabajador[] trabajadores;
	
	public Empresa() {
		super();
	}

	public Empresa(String nombre, String nif, Trabajador[] trabajadores) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.trabajadores = trabajadores;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", nif=" + nif + ", trabajadores="
				+ Arrays.toString(trabajadores) + "]";
	}
	
	public void datosDeTrabajadores() {
		System.out.println(Arrays.toString(trabajadores));
	}
	
	public boolean existeTrabajador(String dniAComprobar) {
		for (Trabajador trabajador : this.trabajadores) {
			if (trabajador.dni.equalsIgnoreCase(dniAComprobar)) {
				return true;
			}
		}
		return false;
	}
	
	public int cantidadTrabajadores() {
		return this.trabajadores.length;
	}
	
	public double capitalEnEmpleados() {
		double capitalTot = 0;
		for (Trabajador trabajador : this.trabajadores) {
			capitalTot += trabajador.salario;
		}
		return capitalTot;
	}
	
	public int ganaMasTresK(){
		int trabajadores = 0;
		for (Trabajador trabajador : this.trabajadores) {
			if (trabajador.salario >= 3000) {
				trabajadores ++;
			}
		}
		return trabajadores;
	}
	
	public int ganaMenosDeSMI(){
		int trabajadores = 0;
		for (Trabajador trabajador : this.trabajadores) {
			if (trabajador.salario < 1323) {
				trabajadores ++;
			}
		}
		return trabajadores;
	}
	
	public int trabajadoresQueGananMasQue(double salario){
		int trabajadores = 0;
		for (Trabajador trabajador : this.trabajadores) {
			if (trabajador.salario > salario) {
				trabajadores ++;
			}
		}
		return trabajadores;
	}
	
	public boolean sonTodosTrabajadoresConDniValido() {
		for (Trabajador trabajador : this.trabajadores) {
			if (!trabajador.esValido()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean sonEmpresasIguales(Empresa empresaB) {
		if (!this.nif.equalsIgnoreCase(empresaB.nif)) {
			return false;
		} else if (!this.nombre.equalsIgnoreCase(empresaB.nombre)) {
			return false;
		}
		return true;
	}

}
