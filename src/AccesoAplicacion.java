import javax.swing.*;

public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Fran";
		
		String pass = "";
		
		while (clave.equals(pass)==false) {// si la clave no es igual a pass es false, vuelve a salir la pantalla JOptionPane.showInputDialog
			
			pass = JOptionPane.showInputDialog("Introduce la contraseņa correcta ");
			
			if (clave.equalsIgnoreCase(pass)==false ) {
				
				System.out.println("Contraseņa incorrecta");
				
			}
		}
		
		System.out.println("Contraseņa correcta. Acceso permitido");
	}

}