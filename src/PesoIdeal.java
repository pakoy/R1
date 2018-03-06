import javax.swing.*; 

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero ="";
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
			
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		// els equals.ignoreCase compara y no tiene en cuenta mayusculas o minusculas

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altutra en cm"));
			// es importante poner el parseInt por que el dialog trata los valores como String Staticos
		
		int pesoideal = 0;
				
				if (genero.equalsIgnoreCase("H")) {
					
					pesoideal = altura-110;
				
				}else if(genero.equalsIgnoreCase("M")) {
					
					pesoideal = altura-120;
				}
				System.out.println("Tu peso ideal es " + pesoideal + "kg.");
		
	}

}
