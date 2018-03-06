

import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Long resultado = 1L;// usamos el Long para permitir factoriales grandes, se ha de poner la "L".
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
		
		for (int i = numero; i>0 ; i--) {
			
			resultado = resultado *i;
			
			
		}
		System.out.println("El factorial de "+numero+ " es "+ resultado);
	}

}
