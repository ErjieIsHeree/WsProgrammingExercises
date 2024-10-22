package actividades;

import java.util.Arrays;

/**
 * A simple work for school, it's used for constructing a simple
 * object and contains simple methods and constructors, which are:
 * 
 * 
 * Object - User(atributes):
 * -id: contain a long variable type value that meant to be an id
 * of the user
 * -nombre: contain a string that is suppossed to work as a name
 * of the user
 * -valoraciones: contain an double[5] that is suppossed to be the
 * feedback from the previous user
 * 
 * 
 * Constructors:
 * There are two, one useless, so let's just talk about the useful one.
 * It contain all the atributes from the object User: id, nombre,
 * valoraciones.
 */

public class User {
	
	long id;
	String nombre;
	double[] valoraciones;

	public User() {
	}
	
	public User(long id, String nombre, double[] valoraciones) {
		this.id = id;
		this.nombre = nombre;
		this.valoraciones = valoraciones;
	}

	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", valoraciones=" + Arrays.toString(valoraciones) + "]";
	}
	
	public int valMed() {
		int valMed = 0;
			for (int i = 0; i < this.valoraciones.length; i++) {
				valMed += this.valoraciones[i];
			}
		valMed /= this.valoraciones.length;
		return valMed;
	}
	
	public void valoraciones() {
		System.out.print("Valoraciones de " + this.nombre + " ");
		for (int i = 0; i < this.valoraciones.length; i++) {
			 System.out.print(valoraciones[i]);
			 if (i < this.valoraciones.length - 1) {
				 System.out.print(" - ");
			 }
		}
	}
	
	public int mejVals(double valoracion) {
		int mejVal = 0;
			
			for (int i = 0; i < this.valoraciones.length; i++) {
				if (this.valoraciones[i] > valoracion) {
					mejVal += 1;
				}
			}
		
		return mejVal;
	}
	
	public boolean mejQueValMed(double valoracion) {
		boolean mejQueValMed = false;
		
		if (valoracion > valMed()) {
			mejQueValMed = true;
		}
		
		return mejQueValMed;
	}
	
	
	
}
