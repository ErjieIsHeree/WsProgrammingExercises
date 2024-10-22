package actividades;

public class _10_Ejer {
	
	public static void main(String[] args) {
		
		Coche c1 = new Coche();
		
		c1.marca = "Nissan";
		c1.modelo = "A1";
		c1.matricula = "JxUWU";
		c1.peso = 200;
		c1.añosDeAntiguedad = 4;
		c1.esElectrico = true;
		
		Coche c2 = new Coche();
		
		c2.marca = "Pidgeotto";
		c2.modelo = "C2";
		c2.matricula = "LFJKSDK";
		c2.peso = 300;
		c2.añosDeAntiguedad = 10;
		c2.esElectrico = false;
		
		Coche c3 = new Coche();
		
		c3.marca = "Ferrari";
		c3.modelo = "Fast&Furius";
		c3.matricula = "UWUONICHAN";
		c3.peso = 150;
		c3.añosDeAntiguedad = 1;
		c3.esElectrico = true;
		
		imprimir(c1);
		imprimir(c2);
		imprimir(c3);
		
	}

	private static void imprimir(Coche c) {
		System.out.println("Marca: " + c.marca + "\r\n" +
				"Modelo: " + c.modelo + "\r\n" +
				"Matricula: " + c.matricula + "\r\n" +
				"Peso: " + c.peso + "\r\n" +
				"Años De Antiguedad: " + c.añosDeAntiguedad + "\r\n" +
				"Es eléctrico?: " + c.esElectrico);
		System.out.println("------------------------------------------");
		
	}
	

}
