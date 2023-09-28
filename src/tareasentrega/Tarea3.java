package tareasentrega;

import java.util.Scanner;

public class Tarea3 {
	
	/* Vamos a realizar un script que dado un número que el usuario escriba,
	 * pueda saber cuánto le falta a dicho número para ser múltiplo de
	 * cualquier número que se introduzca en el programa. */
	
	public static void main(String[] args) {
		// Creamos una variable que haga referencia al múltiplo.
				int numReference = 0;
				
				/* Creamos el valor que le pediremos al usuario (firstValue),
				 * para que después de calcular el resto de la división, lo 
				 * guardemos en el remainder. Acto seguido haremos una
				 * operación matemática para saber el valor que le
				 * hace falta al número para ser múltiplo de 7 y
				 * lo guardaremos en la variable result. */
				
				int firstValue, result, remainder = 0;
				
				// Creamos el Scanner para pedir el valor al usuario.
				Scanner sc = new Scanner(System.in);
				
				// Le preguntamos por el número a introducir.
				System.out.print("Introduzca un número entero: ");
				
				// Le abrimos el Scanner para guardar lo que escriba.
				firstValue = sc.nextInt();
				
				// Preguntamos por el múltiplo.
				System.out.print("Introduzca el múltiplo: ");
				
				// Abrimos el Scanner nuevamente.
				numReference = sc.nextInt();
				
				/* Realizamos el resto de la división para guardarlo en
				 * una variable aparte (remainder). Ya que lo
				 * necesitaremos para más adelante. */
				
				remainder = firstValue % numReference;
				
				/* En la variable result guardamos el resultado de coger
				 * la constante de referencia (7 en este caso) y
				 * restarle el resto de la divisón anterior. Hacemos
				 * esto para saber lo que le queda al número para
				 * llegar a ser múltiplo de 7. */
				
				result = numReference - remainder;
				
				// Imprimimos el resultado.
				System.out.println("\n" + "El valor que le hace falta a " + firstValue +
				" para ser múltiplo de " + numReference + " es: " + result);
				
				// Cerramos el Scanner.
				sc.close();

	}

}
