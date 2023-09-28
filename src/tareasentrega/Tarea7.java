package tareasentrega;
import java.util.Scanner;

public class Tarea7 {

	
	/* Vamos a crear un script que pida 3 longitudes al usuario
	 * en diferentes medidas de milímetros, centrímetros y metros. */
	public static void main(String[] args) {
		/* Creamos las variables para las longitudes
		 * junto con la variable del resultado. */
		float firstValue, secondValue, thirdValue, result = 0f;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Pedimos los valores al usuario.
		System.out.print("Introduzca la primera longitud en milímetros: ");
		
		// Abrimos el Scanner para estos tres valores.
		firstValue = sc.nextFloat();
		
		System.out.print("Introduzca la segunda longitud en centímetros: ");
		secondValue = sc.nextFloat();
		
		System.out.print("Introduzca la tercera longitud en metros: ");
		thirdValue = sc.nextFloat();
		
		// Hacemos la conversión de milímetros a centímetros.
		firstValue = firstValue / 10f;
		
		// Pasamos de metros a centímetros.
		thirdValue = thirdValue * 100f;
		
		/* Sumamos todos los resultados (No hacemos nada
		 * con la segunda variable ya que está dicho
		 * expresamente que el valor que introducirá será
		 * un valor ya convertido en centímetros. */
		result = (firstValue + secondValue) + thirdValue;

		// Imprimimos el resultado.
		System.out.println("\n" + "El resultado de la suma de las tres longitudes en centímetros es: " + result);
		
		// Cerramos el Scanner.
		sc.close();
	}

}
