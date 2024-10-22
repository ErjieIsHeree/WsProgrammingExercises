package mainClass;

import java.util.ArrayList;

import entidades.*;

public class claseMain {
	
	public static void main(String[] args) {
		
		Procesador procesador = new Procesador("AMD", "Ryzen 7", 8, 300);
		
		RAM ramTG = new RAM(null, 8, 0);
		
		TarjetaGrafica tarjetaGrafica = new TarjetaGrafica("NVIDIA", "RTX 4060",
				3072, 400, ramTG);
		
		PlacaBase placaBase = new PlacaBase("ASUS", 100.99, "ATX");
		
		ArrayList<RAM> listaRAMs = new ArrayList<RAM>();
		
		RAM ram1 = new RAM("Corsair", 16, 400.50);
		listaRAMs.add(ram1);
		RAM ram2 = new RAM("Corsair", 16, 400.50);
		listaRAMs.add(ram2);
		RAM ram3 = new RAM("Corsair", 16, 400.50);
		listaRAMs.add(ram3);
		ArrayList<Periferico> listaPerifericos = new ArrayList<Periferico>();
		Periferico periferico1 = new Periferico("ratón", "havit", 15);
		listaPerifericos.add(periferico1);
		Periferico periferico2 = new Periferico("teclado", "havit", 20);
		listaPerifericos.add(periferico2);
		Periferico periferico3 = new Periferico("cascos", "havit", 30);
		listaPerifericos.add(periferico3);
		double precio = 0;
		Ordenador ordenador = new Ordenador(precio, procesador, tarjetaGrafica,
				placaBase, listaRAMs, listaPerifericos);
		System.out.println(ordenador.toString());
		ordenador.calcularPrecio();
		System.out.println(ordenador.toString());
	}

}
