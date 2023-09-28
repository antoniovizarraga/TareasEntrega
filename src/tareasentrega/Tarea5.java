package tareasentrega;
import java.util.Scanner;

public class Tarea5 {

	/* Vamos a hacer un Script el cual calcule un polinomio
	 * de segundo grado dados unos valores. */
	
	public static void main(String[] args) {
		// Creamos los valores matemáticos del polinomio.
		int a, b, c, x = 0;
		
		/* Creamos una variable en la que guardamos el
		 * resultado de las operaciones. Tiene que ser
		 * double debido a que el método Math.pow();
		 * nos devuelve un double. */
		double y = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Pedimos los valores de referencia del polinomio.
		System.out.print("Introduzca el valor a del polinomio: ");
		
		// Abrimos el Scanner para dichos valores.
		a = sc.nextInt();

		System.out.print("Introduzca el valor b del polinomio: ");
		b = sc.nextInt();
		
		System.out.print("Introduzca el valor c del polinomio: ");
		c = sc.nextInt();
		
		System.out.print("Introduzca el valor de x: ");
		x = sc.nextInt();
		
		
		// Hacemos la ecuación con el método: Math.pow();
		y = (a * Math.pow(x, 2)) + (b * x + (c));
		
		// Imprimimos el resultado en consola.
		System.out.print("El resultado del polinomio es: " + y);
		
		// Cerramos el Scanner.
		sc.close();
	}

}
