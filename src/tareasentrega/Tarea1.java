package tareasentrega;
import java.util.Scanner;

public class Tarea1 {

	public static void main(String[] args) {
		final float SYSTEM_VALUE, ROUND_VALUE;
		ROUND_VALUE = 0.5f;
		float userValue, result = 0f;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un valor con decimales: ");
		userValue = sc.nextFloat();
		
		SYSTEM_VALUE = (int) userValue;
		result = ((userValue - SYSTEM_VALUE) > ROUND_VALUE) ? (int) userValue++ : (int) userValue;
		userValue = (int) userValue;
		
		System.out.println("\n" + userValue);
		
		sc.close();
		
		/* No es el código más óptimo, pero este es uno de esos momentos
		 * en los que no sé que hacer con este código ahora mismo
		 * dadas las condiciones fkldlkdld */
		
	}

}
