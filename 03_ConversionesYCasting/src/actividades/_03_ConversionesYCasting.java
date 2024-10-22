package actividades;

public class _03_ConversionesYCasting {
	
	public static void main(String[] args) {
		
		int numeroEntero = 5;
		float numeroFloat = 5.5F;
		double numeroDouble = 5.5;
		char caracter = 'a';
		int numero97 = 97;
		String cadena = "hola hola";
		String cadenaa = "a";
		
		//------------Int->Float----------
		System.out.println("Int->Float");
		numeroFloat = numeroEntero;
		System.out.println(numeroFloat);
		//No es necesario hacer casting y tampoco se pierde información
		
		//------------Float->Int----------
		System.out.println("Float->Int");
		numeroEntero = (int)numeroFloat;
		System.out.println(numeroEntero);
		//Es necesario hacer casting y se pierden información
		
		//------------Double->Int----------
		System.out.println("Double->Int");
		numeroEntero = (int)numeroDouble;
		System.out.println(numeroEntero);
		//Es neecesario hacer casting y es pierde información
		
		//------------Int->Double----------
		System.out.println("Int->Double");
		numeroDouble = numeroEntero;
		System.out.println(numeroDouble);
		//No es necesario hacer casting y tampoco se pierde información
		
		//------------Char->Int----------
		System.out.println("Char->Int");
		numeroEntero = caracter;
		System.out.println(numeroEntero);
		//Se puede realizar la operación sin hacer casting "dato: lo muestra en ASCII"
		
		//------------Int->Char----------
		System.out.println("Int->Char");
		caracter = (char)numero97;
		System.out.println(caracter);
		//No see puede realizar la operación sin hacer casting "dato: muestra el valor de ASCII"
		
		/*
		 * ------------String->Int----------
		 * System.out.println("String->Int");
		 * numeroEntero = (int)cadena;
		 * System.out.println(numeroEntero);
		 * 
		 * No see puede realizar la operación
		 */
		
		/*
		 * ------------Char->String----------
		 * System.out.println("Char->String");
		 * cadena = (String)caracter;
		 * System.out.println(cadena);
		 * 
		 * No see puede realizar la operación
		 */
		
	}

}
