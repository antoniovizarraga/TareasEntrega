package tareasentrega;
import java.util.Scanner;

public class Tarea10 {

	/* Vamos a crear un código en el que pida al usuario un valor
	 * medido en metros, para luego expresarlo en centímetros sin
	 * mostrar decimales. */
	
	public static void main(String[] args) {
		// Creamos el valor que le pediremos al usuario.
		float firstValue = 0f;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el valor al usuario y le abrimos el Scanner.
		System.out.print("Introduce un valor medido en metros: ");
		firstValue = sc.nextFloat();
		
		/* Multiplicamos el valor por 100 para pasar de metros
		 * a centímetros. */
		firstValue = firstValue * 100;
		
		// Lo pasamos de float a int para que no tenga decimales.
		firstValue = (int) firstValue;
		
		// Imrpimimos el resultado.
		System.out.println("\n" + "La parte correspondiente en centímetros sería: " + firstValue + " cm.");
		
		// Cerramos el Scanner.
		sc.close();
	}

}
