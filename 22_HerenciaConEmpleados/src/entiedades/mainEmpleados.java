package entiedades;

import java.util.ArrayList;
import java.util.Scanner;

public class mainEmpleados {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		Empleado.setContador(10000);
		String eleccion = "0";
		
		do {
			System.out.println("Bienvenido al menu de empleados");
			System.out.println("1.Dar de alta");
			System.out.println("2.Mostrar empleados");
			System.out.println("3.Mostrar salario del empleado");
			System.out.println("4.Coste de la empresa(Salario de todos)");
			System.out.println("5.Salir del programa");
			System.out.println("Elija la opcion:");
			eleccion = sc.nextLine();
			
			if (eleccion.equals("1")) {
				System.out.println("¿Que tipo de empleado desea dar de alta?");
				System.out.println("1.Programador");
				System.out.println("2.Jefe de proyecto");
				System.out.println("3.Director");
				String tipoEleccion = sc.nextLine();
				if (tipoEleccion.equals("1")) {
					listaEmpleados.add(darDeAltaProgramador(sc));
					sc.nextLine();
				} else if (tipoEleccion.equals("2")) {
					listaEmpleados.add(darDeAltaJefeProy(sc));
					sc.nextLine();
				} else if (tipoEleccion.equals("3")) {
					listaEmpleados.add(darDeAltaDirector(listaEmpleados, sc));
					sc.nextLine();
				} else {
					System.out.println("Esta opcion no existe");
				}
			} else if (eleccion.equals("2")) {
				mostrarEmpleados(listaEmpleados);
			} else if (eleccion.equals("3")) {
				mostrarSalarioDe(seleccionarEmpleado(listaEmpleados, sc));
			} else if (eleccion.equals("4")) {
				mostrarCosteEmpresa(listaEmpleados);
			} else if (eleccion.equals("5")) {
				System.out.println("Programa cerrado");
			} else {
				System.err.println("Opción no existente, elija otra");
			}
		} while (!eleccion.equals("5"));
	}
	
	/**
	 * El metodo darDeAltaProgramador(Scanner sc) con sus atributos rellenos.
	 * Los atributos serán pedidos por consola con la ayuda del objeto Scanner.
	 * 
	 * @param <b>sc</b> Objeto de la clase Scanner de la biblioteca
	 * java.util.Scanner, la construccion aplicada y recomendada es
	 * "Scanner sc = new Scanner(System.in);"
	 */
	public static Programador darDeAltaProgramador(Scanner sc) {
		Programador programador = new Programador();
		
		System.out.println("DNI:");
		programador.setDni(sc.nextLine());
		System.out.println("Nombre:");
		programador.setNombre(sc.nextLine());
		System.out.println("Sueldo Base:");
		programador.setSueldoBase(sc.nextDouble());
		sc.hasNextLine();
		
		return programador;
	}
	
	/**
	 * El metodo darDeAltaJefeProy(Scanner sc) con sus atributos rellenos.
	 * Los atributos serán pedidos por consola con la ayuda del objeto Scanner.
	 * 
	 * @param <b>sc</b> Objeto de la clase Scanner de la biblioteca
	 * java.util.Scanner, la construccion aplicada y recomendada es
	 * "Scanner sc = new Scanner(System.in);"
	 */
	public static JefeProyecto darDeAltaJefeProy(Scanner sc) {
		JefeProyecto jefeProy = new JefeProyecto();
		
		System.out.println("DNI:");
		jefeProy.setDni(sc.nextLine());
		System.out.println("Nombre:");
		jefeProy.setNombre(sc.nextLine());
		System.out.println("Sueldo Base:");
		jefeProy.setSueldoBase(sc.nextDouble());
		sc.hasNextLine();
		System.out.println("Incentivo:");
		jefeProy.setIncentivo(sc.nextDouble());
		sc.hasNextLine();
		
		return jefeProy;
	}
	
	/**
	 * El metodo darDeAltaDirector(Scanner sc) con sus atributos rellenos.
	 * Los atributos serán pedidos por consola con la ayuda del objeto Scanner.
	 * 
	 * @param <b>sc</b> Objeto de la clase Scanner de la biblioteca
	 * java.util.Scanner, la construccion aplicada y recomendada es
	 * "Scanner sc = new Scanner(System.in);" <
	 * @return <b>objeto Director</b> con atributos rellenados
	 */
	public static Director darDeAltaDirector(ArrayList<Empleado> listaEmpleados,
			Scanner sc) {
		Director director = new Director();
		
		System.out.println("DNI:");
		director.setDni(sc.nextLine());
		System.out.println("Nombre:");
		director.setNombre(sc.nextLine());
		System.out.println("Sueldo Base:");
		director.setSueldoBase(sc.nextDouble());
		sc.nextLine();
		director.listaEmpleados = new ArrayList<Empleado>();
		String tieneMasEmpleados = "y";
		do {
			System.out.println("El director tiene empleados bajo su direccion?");
			System.out.println("Introduce y o n");
			tieneMasEmpleados = sc.nextLine();
			if (tieneMasEmpleados.equals("y")) {
				System.out.println("Seleccione que empleado desea bajo su direccion:");
				director.listaEmpleados.add(seleccionarEmpleado(listaEmpleados, sc));
			} else if (tieneMasEmpleados.equals("n")) {
				System.out.println("El director tiene de empleados a:");
				for (Empleado e : listaEmpleados) {
					System.out.println("1 - " + e.toString());
				}
			} else {
				System.err.println("Error, elija otra opcion");
			}
		} while (!tieneMasEmpleados.equals("n"));
		
		return director;
	}
	
	/**
	 * El metodo mostrarEmpleados(ArrayList<Empleado/> listaEmpleados) imprime
	 * en pantalla un listado de todos los empleados
	 * @param <b>listaEmpleados</b> un objeto creado mediante la clase ArrayList
	 * que contiene objetos de clase Empleado
	 */
	public static void mostrarEmpleados(ArrayList<Empleado> listaEmpleados) {
		for (Empleado s : listaEmpleados) {
			System.out.println("1 - " + s.toString());
		}
	}
	
	/**
	 * El metodo seleccionarEmpleado(ArrayList<Empleado/> listaEmpleados,
	 * Scanner sc) devuelve un valor de un array list de objetos empleado
	 * @param <b>ArrayList<Empleado/> listaEmpleados</b> lista en la que se
	 * almacenan los objetos Empleado. <b>sc</b> objeto Scanner de la biblioteca
	 * (java.util.Scanner)
	 * @return <b>empleado</b> el objeto de la lista seleccionado por usuario
	 */
	public static Empleado seleccionarEmpleado(ArrayList<Empleado>
			listaEmpleados, Scanner sc) {
		mostrarEmpleados(listaEmpleados);
		System.out.println("(Seleccione del 1 al " + listaEmpleados.size() + 
				") el empleado que deseas");
		int eleccion = sc.nextInt();
		sc.hasNextLine();
		return listaEmpleados.get(eleccion - 1);
	}
	
	/**
	 * El metodo mostrarSalarioDe(Empleado empleado) muestra el salario del
	 * empleado pasado por parametro
	 * @param <b>empleado</b> objeto creado mediante la clase Empleado
	 * @return Texto: "(Nombre del empleado) cobra (salario total del empleado)"
	 */
	public static void mostrarSalarioDe(Empleado empleado) {
		System.out.println("Escoja de que empleado quiere saber el salario");
		System.out.println(empleado.getNombre() + " cobra " +
				empleado.devolverSalarioTot());
	}
	
	/**
	 * El metodo mostrarCosteEmpresa(ArrayList<Empleado/> listaEmpleados) recorre
	 * todo los valores contenido en el array recogiendo un valor de tipo
	 * "double". Todos los valores seran sumados y al acabar, devolvera
	 * "El coste total de la empresa sera de (suma de todos los "double")".
	 * 
	 * Este metodo esta asociado al metodo devolverSalarioTot() de la clase
	 * empleado, por lo que si el array tiene algun valor distinto del objeto
	 * creado mediante la clase Empleado o sus herederos, con su metodo 
	 * devolverSalarioTot(), (metodo que devuelve un valor "double"), podria
	 * no funcionar correctamente.
	 * 
	 * @param <b>listaEmpleados</b> es un objeto creado mediante la clase
	 * ArrayList.
	 * @return Todos los valores seran sumados y al acabar, devolvera
	 * <b>"El coste total de la empresa sera de (suma de todos los "double")"</b>
	 */
	public static void mostrarCosteEmpresa(ArrayList<Empleado> listaEmpleados) {
		double salTot = 0;
		for (Empleado e : listaEmpleados) {
			salTot += e.devolverSalarioTot();
		}
		System.out.println("El coste total de la empresa sera de " + salTot);
	}

}
