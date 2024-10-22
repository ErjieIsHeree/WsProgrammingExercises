package actividades;

import java.util.Scanner;

public class _04_EntradaYSalidaDeDatos {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.err.println();
		//Son las dos sentencias de salida de datos
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Please complete de next form:");
		
		System.out.println("Name:");
		String name = ab.nextLine();
		System.out.println("So " + name + ", go get a bath ty.");
		
		System.out.println("Favourite character on the keyboard (ONLY ONE!!!!)");
		char character = ab.next().charAt(0);
		System.out.println("That's fantastic! I also like ur " + character);
		//-Si se introducen varios caracteres solo aparecerá el primero
		
		System.out.println("What's ur fav number?");
		int favNumber = ab.nextInt();
		System.out.println("Ewwwww what's that number, " + favNumber + " it gives me bad luck just by hearing it!");
		/* 
		 * -Si no es un número dará error
		 * -Si el número no está entre -2,147,483,648 y 2,147,483,647 dará error
		 * -Si el número no es entero dará error
		 */
		
		System.out.println("Let's just leave that apart. What's the largest number u can tell me?");
		long largestNumber = ab.nextLong();
		System.out.println("That's the largest number I've ever heard by far " + largestNumber + ", I'm lucky I could even say it");
		/*
		 * -Si no es un número dará error
		 * -Si el número no es entero dará error
		 */
		
		System.out.println("Now tell me a number between -32,768 and 32,767");
		short shortNumber = ab.nextShort();
		System.out.println("Why did u choose " + shortNumber + " u re a weirdo");
		/*
		 * -Si no es un número dará error
		 * -Si el número no está entre -32,768 y 32,767 dará error
		 * -Si el número no es entero dará error
		 */
		
		System.out.println("Give me another number and stop being weirdo, just give me a number between -128 and 127");
		byte byteNumber = ab.nextByte();
		System.out.println("Well, " + byteNumber + " is kinda better...");
		/*
		 * -Si no es un número dará error
		 * -Si el número no está entre -128 y 127 dará error
		 * -Si el número no es entero dará error
		 */
		
		System.out.println("Now give me a number with decimals");
		float floatNumber = ab.nextFloat();
		System.out.println("WOAH! RELAX, I DIDN'T ASKED U FOR SUCH A BIG ONE. " + floatNumber + "... for real");
		//-Si no es un número dará error
		
		System.out.println("Give me another with kinda less decimals...");
		double doubleNumber = ab.nextDouble();
		System.out.println(doubleNumber + " is better.");
		System.out.println("Ty for ur help!");
		//-Si no es un número dará error
		
	}

}
