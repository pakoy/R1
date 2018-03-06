import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba = 0;
		boolean punto = false;
		
		String email = JOptionPane.showInputDialog("Introduce el mail");
		
		for( int i = 0; i<email.length(); i++) {
			
			if (email.charAt(i) == '@') {// charAt es el contenido de la posicion de la cadena de caracteres, los char van con comillas simple
				
				arroba++;
			}
			if (email.charAt(i) == '.') {// charAt es el contenido de la posicion de la cadena de caracteres, los char van con comillas simple
				
				punto = true;
			}
			
		}
		
		if (arroba== 1 && punto == true) {
			
			System.out.println("Es correcto");
			
		}
		else {
			System.out.println("Email erroneo");
		}

	}

}
