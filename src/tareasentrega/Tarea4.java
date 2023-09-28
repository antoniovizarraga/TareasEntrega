package tareasentrega;
import java.util.Scanner;

public class Tarea4 {
	
	/* Vamos a realizar un script que nos calcule el área
	 * de un triángulo dándole como datos la base y la
	 * altura. */

	public static void main(String[] args) {
		
		/* Hacemos una constante de 2 ya que para calcular 
		 * el área de un triángulo, siempre se divide
		 * entre 2. */
		final int NUM_DIVISION = 2;
		
		/* Creamos valores flotantes para la base, altura y el
		 * resultado, que será el área del triángulo. */
		float base, height, result = 0f;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario la base del triángulo.
		System.out.print("Introduzca la base del triángulo: ");
		
		// Le abrimos el Scanner para que introduzca la base.
		base = sc.nextFloat();
		
		// Le pedimos también la altura.
		System.out.print("Introduzca la altura del triángulo: ");
		
		// Abrimos el Scanner.
		height = sc.nextFloat();
		
		// Hacemos la operación para calcular el área.
		result = base * height;
		result = result / NUM_DIVISION;
		
		// Imprimimos el resultado en consola.
		System.out.println("\n" + "El área del triángulo es: " + result);
	
		// Cerramos el Scanner.
		sc.close();
	}

}
