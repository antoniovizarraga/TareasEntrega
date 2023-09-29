package tareasentrega;
import java.util.Scanner;

public class Tarea9 {

	/* Crearemos un Script que compruebe si unos valores que
	 * introducirá el usuario son iguales o no. En caso de
	 * que sean iguales, dirá true. En caso contrario false. */
	public static void main(String[] args) {
		
		// Creamos los valores que pediremos al usuario.
		int firstValue, secondValue = 0;
		
		// Creamos el bool que dirá si es verdadero o falso.
		boolean result = false;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		
		// Pedimos los valores al usuario y abriremos el Scanner.
		System.out.print("Introduce el primer valor: ");
		firstValue = sc.nextInt();
		
		System.out.print("Introduce el segundo valor: ");
		secondValue = sc.nextInt();
		
		/* Comprobamos si los valores son iguales. De ser así,
		 * pondremos true en la variable. Si no, false. */
		result = firstValue == secondValue ? true : false;
		
		// Imprimimos el resultado.
		System.out.println("\n" + result);
		
		// Cerramos el Scanner.
		sc.close();
	}

}
