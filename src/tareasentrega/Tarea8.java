package tareasentrega;
import java.util.Scanner;

public class Tarea8 {

	/* Vamos a hacer un Script en el que pida al usuario
	 * que introduzca la cantidad de tickets que tiene
	 * para calcular el precio total a pagar. */
	
	public static void main(String[] args) {
		
		// Creamos los campos para los valores que usaremos como referencia.
		final float CHILDREN_PRICE = 15.50f;
		final float ADULT_PRICE = 20f;
		final float DISCOUNT = 0.05f;
		final float DISCOUNT_REFERENCE = 100f;
		
		/* Creamos las variables de los tickets que tenga el usuario, junto
		con el precio total a pagar. */
		float adultTicket, childrenTicket, totalPrice = 0f;
		
		// Abrimos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Le pedimos los valores al usuario y los guardamos en sus variables.
		System.out.print("Introduzca el número de entradas de adultos: ");
		adultTicket = sc.nextFloat();
		
		System.out.print("Introduzca el número de entradas de niños: ");
		childrenTicket = sc.nextFloat();
		
		
		// Hacemos la operación para calcular el precio total.
		totalPrice = (ADULT_PRICE * adultTicket) + (CHILDREN_PRICE * childrenTicket);
		
		// Aplicamos el descuento si el precio es mayor o igual a 100€.
		totalPrice -= totalPrice >= DISCOUNT_REFERENCE ? (totalPrice * DISCOUNT) : totalPrice;
		
		// Imprimimos el resultado.
		System.out.println("\n" + "Precio total: " + totalPrice + "€");
		
		// Cerramos el Scanner.
		sc.close();
	}

}
