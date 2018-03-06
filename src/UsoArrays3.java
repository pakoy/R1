
public class UsoArrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] matriz_ale = new int [150];
		
		
		for (int i= 0; i<matriz_ale.length; i++) {
			
			matriz_ale[i]= (int)Math.round(Math.random()*100);
			
		}
		
		for(int numero:matriz_ale) {
			System.out.print(numero+ " ");
		}
	}

}
