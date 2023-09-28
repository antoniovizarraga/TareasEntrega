package tareasentrega;
import java.util.Scanner;

public class Tarea6 {

	/* Vamos a crear un script que nos permita
	 * que el usuario introduzca un número de
	 * segundos y que lo representemos en
	 * horas, minutos y segundos. */
	
	public static void main(String[] args) {
		/* Creamos las constantes de referencia
		 * que se usarán en la operación. */
		final int HOUR_REFERENCE = 3600;
		final int MIN_REFERENCE = 60;
		
		/* Creamos las variables de segundos,
		 * minutos, horas y el resto de las
		 * distintas divisiones que iremos
		 * haciendo. */
		int sec, min, hours, remainder = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca los segundos.
		System.out.print("Introduzca los segundos: ");
		
		// Abrimos el Scanner.
		sec = sc.nextInt();
		
		/* Calculamos las horas, minutos y segundos en base
		 * a las diferentes divisiones que iremos haciendo,
		 * guardando los valores en sus respectivas variables. */
		hours = sec / HOUR_REFERENCE;
		remainder = sec % HOUR_REFERENCE;
		min = remainder / MIN_REFERENCE;
		sec = remainder % MIN_REFERENCE;
		
		// Imprimimos el resultado final.
		System.out.println("\n" + hours + " horas, "
		+ min + " minutos con " + sec + " segundos.");
		
		// Cerramos el Scanner.
		sc.close();
	}

}
