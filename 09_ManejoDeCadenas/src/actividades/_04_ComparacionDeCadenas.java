package actividades;

import java.util.Scanner;

public class _04_ComparacionDeCadenas {
	
	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		String usuario = "Capi";
		String contrasenia = "odioAironMan69";
		
		System.out.println("Bienvenido a BBVA\r\n"
				+ "Por favor introduzca su usuario:");
		String usuarioOnline = ab.nextLine();
		String usuarioFinal = usuarioOnline.trim();
		
		System.out.println("Por favor, introduzca su contraseña:");
		String contraseniaIntroducida = ab.nextLine();
		String contraIntroFinal = contraseniaIntroducida.trim();
		
		if (usuarioFinal.equalsIgnoreCase(usuario) && contraIntroFinal.equals(contrasenia)) {
			System.out.println("Bienvenido!");
		} else {
			System.out.println("Usuario o contraseña incorrecta");
		}
		
	}

}
