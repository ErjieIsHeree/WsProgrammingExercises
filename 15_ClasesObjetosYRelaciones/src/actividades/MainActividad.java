package actividades;

public class MainActividad {
	
	public static void main(String[] args) {
		
		Empresa[] empresas = creadorEmpresas();
		Trabajador[] trabajadores = creadorTrabajadores();
		empresas[0].trabajadores = trabajadores;
		empresas[1].trabajadores = trabajadores;
		//Tienen los mismo trabajadores, lo sé
		
		for (Empresa empresa : empresas) {
			System.out.println("------------------------------");
			System.out.println(empresa.toString());
			empresa.datosDeTrabajadores();
			System.out.println("Existe un trabajador con DNI: 23523234Z");
			empresa.existeTrabajador("23523234Z");
			System.out.println("Cuántos trabajadores hay?");
			empresa.cantidadTrabajadores();
			System.out.println("Cuánto se gasta la empresa en los salarios?");
			empresa.capitalEnEmpleados();
			System.out.println("Cuántos trabajadores cobran más de 3k?");
			empresa.ganaMasTresK();
			System.out.println("Cuántos trabajadores ganan menos que el SMI?");
			empresa.ganaMenosDeSMI();
			System.out.println("Cuántos trabajadores ganan más que 1400?");
			empresa.trabajadoresQueGananMasQue(1400);
			System.out.println("Todos los trabajadores tienen un DNI válido?");
			empresa.sonTodosTrabajadoresConDniValido();
			System.out.println("Son las dos empresas iguales?");
			empresas[0].sonEmpresasIguales(empresas[1]);
			System.out.println("------------------------------");
		}
		
		
	}
	
	public static Trabajador[] creadorTrabajadores() {
		Trabajador[] trabajadores = new Trabajador[3];
		Trabajador trabajador = new Trabajador("Erjie", "29738423A", 1500);
		trabajadores[0] = trabajador;
		trabajador = new Trabajador("Anthony", "90243587B", 3000);
		trabajadores[1] = trabajador;
		trabajador = new Trabajador("Felipe", "98342753Z", 1000);
		trabajadores[2] = trabajador;
		return trabajadores;
	}
	
	public static Empresa[] creadorEmpresas() {
		Empresa[] empresas = new Empresa[2];
		Empresa empresa = new Empresa("Riot", "29738423A", null);
		empresas[0] = empresa;
		empresa = new Empresa("Riot", "29738423A", null);
		empresas[1] = empresa;
		return empresas;
	}

}
