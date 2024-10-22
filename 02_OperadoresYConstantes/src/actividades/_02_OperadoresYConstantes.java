package actividades;

public class _02_OperadoresYConstantes {

	public static void main(String[] args) {

		
		//-------------Calculadora de area y perimetro---------------//
		int anchura = 5;
		int longitud = 3;
		
		double area = anchura * longitud;
		System.out.println("Área del rectángulo");
		System.out.println(area);
		
		double perimetro = 2 * (anchura + longitud);
		System.out.println("Perímetro del rectángulo");
		System.out.println(perimetro);
		
		anchura = 10;
		longitud = 5;
		
		area = anchura * longitud;
		System.out.println("Área del rectángulo");
		System.out.println(area);
		
		perimetro = 2 * (anchura + longitud);
		System.out.println("Perímetro del rectángulo");
		System.out.println(perimetro);
		
		anchura = 8;
		longitud = 20;
		
		System.out.println("Área del rectángulo");
		System.out.println(anchura * longitud);
		
		System.out.println("Perímetro del rectángulo");
		System.out.println(2 * (anchura + longitud));
		
		//-------------Conversion celsius-fahrenheit---------------//
		int celsius = 0;
		int fahrenheit = 0;
		
		System.out.println("Conversión de celsius a fahrenheit");
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println(celsius);
		
		System.out.println("Conversión de celsius a fahrenheit");
		fahrenheit = 80;
		System.out.println((fahrenheit - 32) * 5 / 9);
		
		//-------------Calculadora area circulo---------------//
		final double PI = 3.14;
		int radio = 5;
		
		System.out.println("Área del círculo");
		area = PI * radio * radio;
		System.out.println(area);
		
		System.out.println("Área del círculo");
		radio = 7;
		System.out.println(PI * radio * radio);
		
		//-------------Calculadora interés---------------//
		int principal = 100; //€ 
		double tasa = 2.5; //€
		int tiempo = 5; //días
		double interes = principal * tasa * tiempo;
		
		System.out.println("Interés");
		System.out.println(interes);
		
		System.out.println("Interés");
		principal = 1000;
		tasa = 0.5;
		tiempo = 7;
		System.out.println(principal * tasa * tiempo);
		
		//-------------Conversión dólar-euro---------------//
		double dolar = 1;
		final double Euro = dolar * 85 / 100;
		
		System.out.println("Conversión de dólar a euro");
		System.out.println(Euro);
		
		//-------------Calculadora de indice de masa corporal---------------//
		double peso = 60.5; //kg
		double altura = 1.84; //m
		double IMC = peso / (altura * altura);
		System.out.println("Índice de Masa Corporal");
		System.out.println(IMC);
		
		System.out.println("Índice de Masa Corporal");
		peso = 70.5;
		altura = 1.7;
		System.out.println(peso / (altura * altura));
				
	}

}
