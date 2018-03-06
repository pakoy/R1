import java.util.*;

public class AdivinaNumeroDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio =(int)(Math.random()*100);// es una refundicion para que solo muestre numero enteros, ya que el random muestra del 0 al 1.
												// al multiplicar por 100 muestra 2 valores con decimales y con ese int solo muestra los enteros.
		
		Scanner entrada = new Scanner (System.in);// el System.in recoge valores por pantalla
		
		int numero = 0;
		int intentos = 0;
		
		do {
			
			intentos ++;
			
			System.out.println("Introduce un numero, por favor");
			numero = entrada.nextInt();// recoje el numero que introduces por pantalla.
			
			if (aleatorio<numero) {
				
				System.out.println("Más bajo");
			}
			else if(aleatorio>numero){
				System.out.println("Más alto");
			}
		}while (numero != aleatorio );

		System.out.println("Correcto. Lo has conseguido en "+ intentos +" intentos");
	}

}
